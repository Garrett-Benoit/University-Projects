package Quadrilateral_Package;

public class Point {

	// Initialize variables
	private double x;
	private double y;
	
	// Constructor
	public Point (double pointX, double pointY)
	{
		// Assign passed in values to X and Y
		x = pointX;
		y = pointY;
	}
	
	// Accessor Methods
	public double getX ()
	{
		return x;
	}
	
	public double getY ()
	{
		return y;
	}
	
	// Override toString
	public String toString ()
	{
		return String.format("(%.1f, %.1f)", getX(), getY());
	}
	
}
