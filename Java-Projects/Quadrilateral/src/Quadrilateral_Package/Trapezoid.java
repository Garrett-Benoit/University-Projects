package Quadrilateral_Package;

public class Trapezoid extends Quadrilateral{
	
	// Constructor
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		super(x1, y1, x2, y2, x3, y3, x4, y4);
	}
	
	public double getSumOfTwoSides()
	{
		if(getPt1().getY() == getPt2().getY())
		{
			return Math.abs(getPt1().getX() - getPt2().getX()) + Math.abs(getPt3().getX() - getPt4().getX());
		}
		else
		{
			return Math.abs(getPt2().getX() - getPt3().getX()) + Math.abs(getPt1().getX() - getPt4().getX());
		}
	}
	
	// Calculate Area
	public double getArea()
	{
		return (getSumOfTwoSides() / 2.0 * getHeight());
	}
	
	// Override toString
	public String toString()
	{
		return super.toString();
	}
	
	// Abstract Method from Shape
	public String getName()
	{
		return "Trapezoid";
	}
}
