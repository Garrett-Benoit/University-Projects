package sudoku_game;

import java.io.*;
import java.util.*;

public class SudokuGame {
	
	private int gameNumber;
	private int [][] gameVariables;
	private ArrayList<CSP> variables = new ArrayList<CSP>();

	public SudokuGame(String gameFileName) {
		loadGameFromFile(gameFileName);
		populateRemainingVariables();
		
		System.out.println("\nAll squares populated");
		
		purgeInitialDomains();
		
		System.out.println("\nInitial domains purged\n");
		
		for(CSP variable : variables) {
			System.out.println("Row: " + variable.getRow() + " Col: " + variable.getColumn() + " Variable: " + variable.getAssignment() + " Domain: " + variable.getVertices().toString());
		}
		
		reduceDomainForColumns();
		reduceDomainForRows();
		reduceDomainForGroups();
		
		System.out.println("\nRows, Columns, Groups reduced\n");
		
		for(CSP variable : variables) {
			System.out.println("Row: " + variable.getRow() + " Col: " + variable.getColumn() + " Variable: " + variable.getAssignment() + " Domain: " + variable.getVertices().toString());
		}
	}
	
	public boolean loadGameFromFile(String fileName) {
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			
			System.out.println("Assigning game number.");
			
			gameNumber = fileScanner.nextInt();
			
			System.out.println("\nGame Number: " + gameNumber);
			
			int calculated_search_space = (int) java.lang.Math.pow(gameNumber, java.lang.Math.pow(gameNumber,2));
			
			System.out.println("\nFull Search Space: " + calculated_search_space);
			
			gameVariables = new int[gameNumber][gameNumber];
			
			while (fileScanner.hasNext()) {
				int row = fileScanner.nextInt();
				int column = fileScanner.nextInt();
				int value = fileScanner.nextInt();
				
				gameVariables[row][column] = value;
				
				variables.add(new CSP(row, column, 0, 0, value, generateDomain(gameNumber)));
			}
			
			fileScanner.close();
			
			System.out.println("\nFinished scanning file");
			
		} catch(IOException ioE) {
			System.err.printf("IOException thrown: ", ioE);
		}
		
		return true;
	}
	
	public int getGameNumber() {
		return gameNumber;
	}
	
	public int getValue(int row, int column) {
		return gameVariables[row][column];
	}
	
	public int getConstrainedValue(int row, int column) {
		int value = 0;
		for (CSP variable : variables) {
			if ((variable.getRow() == row) && (variable.getColumn() == column)) {
				value = variable.getAssignment();
			}
		}
		return value;
	}
	
	/********************Private Functions********************/
	private Hashtable<Integer, Boolean> generateDomain(int size) {
		Hashtable<Integer,Boolean> new_vertices = new Hashtable<Integer, Boolean>();
		for (int i = 1; i <= size; i++) {
			new_vertices.put(i, true);
		}
		return new_vertices;
	}
	
	private void populateRemainingVariables() {
		for (int i = 0; i < gameNumber; i++) {
			for (int j = 0; j < gameNumber; j++) {
				boolean match = false;
				for (CSP variable : variables) {
					if ((variable.getRow() == i) && (variable.getColumn() == j)) {
						match = true;
					}
				}
				if (!match) {
					variables.add(new CSP(i, j, 0, 0, 0, generateDomain(gameNumber)));
				}
			}
		}
	}
	
	private void purgeInitialDomains() {
		for (CSP variable : variables) {
			if (variable.getAssignment() != 0) {
				int vertex = variable.getAssignment();
				for (int i = 1; i <= gameNumber; i++) {
					if (vertex != i) {
						variable.removeVertex(i);
					}
				}
			}
		}
	}
	
	private void reduceDomainForColumns() {
		for (int column_index = 0; column_index < gameNumber; column_index++ ) {
			for (int row_index = 0; row_index < gameNumber; row_index++) {
				for (CSP variable : variables) {
					if (variable.getColumn() == column_index) {
						if (variable.getAssignment() == 0) {
							variable.removeVertex(gameVariables[row_index][column_index]);
							if (variable.getVertices().size() == 1) {
								variable.setAssignment(variable.getFirstVertex());
							}
						}
					}
				}
			}
		}
	}
	
	private void reduceDomainForRows() {
		for(int row_index = 0; row_index < gameVariables.length; row_index++) {
			for(int column_index = 0; column_index < gameVariables[row_index].length; column_index++) {
				for(CSP variable : variables) {
					if (variable.getRow() == row_index) {
						if (variable.getAssignment() == 0) {
							variable.removeVertex(gameVariables[row_index][column_index]);
							if (variable.getVertices().size() == 1) {
								variable.setAssignment(variable.getFirstVertex());
							}
						}
					}
				}
			}
		}
	}

	private void reduceDomainForGroups() {
		for (int column_index = 0; column_index < gameNumber; column_index++ ) {
			for (int row_index = 0; row_index < gameNumber; row_index++) {
				int vertex = gameVariables[row_index][column_index];
				if (column_index < (gameNumber/2) && row_index < (gameNumber/2)) {
					for(CSP variable : variables) {
						if ((variable.getRow() < (gameNumber/2)) && (variable.getColumn() < (gameNumber/2))) {
							if (variable.getAssignment() == 0) {
								variable.removeVertex(vertex);
								if (variable.getVertices().size() == 1) {
									variable.setAssignment(variable.getFirstVertex());
								}
							}
						}
					}
				} else if (column_index >= (gameNumber/2) && row_index < (gameNumber/2)) {
					for(CSP variable : variables) {
						if ((variable.getRow() < (gameNumber/2)) && (variable.getColumn() >= (gameNumber/2))) {
							if (variable.getAssignment() == 0) {
								variable.removeVertex(vertex);
								if (variable.getVertices().size() == 1) {
									variable.setAssignment(variable.getFirstVertex());
								}
							}
						}
					}
					
				} else if (column_index < (gameNumber/2) && row_index >= (gameNumber/2)) {
					for(CSP variable : variables) {
						if ((variable.getRow() >= (gameNumber/2)) && (variable.getColumn() < (gameNumber/2))) {
							if (variable.getAssignment() == 0) {
								variable.removeVertex(vertex);
								if (variable.getVertices().size() == 1) {
									variable.setAssignment(variable.getFirstVertex());
								}
							}
						}
					}
				} else {
					for(CSP variable : variables) {
						if (variable.getAssignment() == 0) {
							variable.removeVertex(vertex);
							if (variable.getVertices().size() == 1) {
								variable.setAssignment(variable.getFirstVertex());
							}
						}
					}
				}
			}
		}
	}
	/*********************************************************/
}
