package sudoku_game;

import java.util.Hashtable;

public class CSP {
	private int row;
	private int column;
	private int group_row;
	private int group_column;
	private int assignment;
	private Hashtable<Integer,Boolean> vertices;
	
	/********************Initializer********************/
	public CSP(int row, int column, int group_row, int group_column, int assignment, Hashtable<Integer, Boolean> vertices) {
		this.row = row;
		this.column = column;
		this.group_row = group_row;
		this.group_column = group_column;
		this.assignment = assignment;
		this.vertices = vertices;
	}
	
	/********************Getters********************/
	public int getRow() {
		return this.row;
	}
	
	public int getColumn() {
		return this.column;
	}
	
	public int getGroupRow() {
		return this.group_row;
	}
	
	public int getGroupColumn() {
		return this.group_column;
	}
	
	public int getAssignment() {
		return this.assignment;
	}
	
	public boolean getVertex(Integer key) {
		return this.vertices.get(key);
	}
	
	public int getFirstVertex() {
		return this.vertices.keys().nextElement();
	}
	
	public Hashtable<Integer,Boolean> getVertices() {
		return this.vertices;
	}
	/***********************************************/
	
	/********************Setters********************/
	public void setRow(int row) {
		this.row = row;
	}
	
	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setGroupRow(int group_row) {
		this.group_row = group_row;
	}
	
	public void setGroupColumn(int group_column) {
		this.group_column = group_column;
	}
	
	public void setAssignment(int assignment) {
		this.assignment = assignment;
	}
	
	public void setVertex(int key, boolean value) {
		this.vertices.put(key, value);
	}
	/***********************************************/
	
	public void removeVertex(int key) {
		this.vertices.remove(key);
	}
	
	public boolean containsVertex(int key) {
		return this.vertices.containsKey(key);
	}
	
	public int domainCount() {
		return this.vertices.size();
	}
	
	// N ^ (N^2) to determine full search space
	
	// Row constraint
	// Column constraint
	// Group constraint
	
	// A != B != C != D
	
	// A != B
	// A != C
	// A != D
	
	// B != C
	// B != D
	
	// C != D
	
	// Iterate through board, if only one value exists in domain, purge all other variables that
	//	have that domain value from the col, row, and group
	
	
	
	
	// BACKTRACK SEARCH
	// Know order in which variables are assigned (Hint: Use a stack)
	// Know which index you took the assignment from in the domain
}
