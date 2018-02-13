package Quadrilateral_Package;

public class Parallelogram extends Quadrilateral{
		
	// Constructor
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
		
	// Calculate area of parallelogram
	public double getArea()
	{
		return getHeight() * getWidth();
	}
	
	// Override toString
	public String toString()
	{
		return super.toString();
	}
	
	// Abstract Method from Shape
	public String getName()
	{
		return "Parallelogram";
	}
}
