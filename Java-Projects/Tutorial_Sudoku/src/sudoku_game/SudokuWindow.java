package sudoku_game;

import javax.swing.*;

public class SudokuWindow extends JFrame {
	
	private int window_width = 400;
	private int window_height = 400;
	
	private SudokuGame game;
	private SudokuDisplay gameBoard;
	
	public SudokuWindow() {
		this.setTitle("Sudoku");
		this.setSize(window_width, window_height);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//game = new SudokuGame("Sudoku_4_4_01.txt");
		//game = new SudokuGame("Sudoku_4_4_02.txt");
		game = new SudokuGame("Sudoku_4_4_03.txt");
		gameBoard = new SudokuDisplay(game);
		this.add(gameBoard);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		SudokuWindow sudokuWindow = new SudokuWindow();
	}

}