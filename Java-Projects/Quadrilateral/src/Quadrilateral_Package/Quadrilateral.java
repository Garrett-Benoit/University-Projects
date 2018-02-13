package Quadrilateral_Package;

public abstract class Quadrilateral implements Shape
{

	// Initialize variables
	private Point pt1;
	private Point pt2;
	private Point pt3;
	private Point pt4;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
	{
		// Assign passed in coordinates to points
		pt1 = new Point(x1, y1);
		pt2 = new Point(x2, y2);
		pt3 = new Point(x3, y3);
		pt4 = new Point(x4, y4);
	}
	
	// Accessor Methods
	public Point getPt1()
	{
		return pt1;
	}
	
	public Point getPt2()
	{
		return pt2;
	}
	
	public Point getPt3()
	{
		return pt3;
	}
	
	public Point getPt4()
	{
		return pt4;
	}
	
	// Calculate width of quadrilateral
	public double getWidth()
	{
		if(getPt1().getY() == getPt2().getY())
		{
			return Math.abs(getPt1().getX() - getPt2().getX());
		}
		else
		{
			return Math.abs(getPt2().getX() - getPt3().getX());
		}
	}
	
	// Calculate height of quadrilateral
	public double getHeight()
	{
		if(getPt1().getY() == getPt2().getY())
		{
			return Math.abs(getPt2().getY() - getPt3().getY());
		}
		else
		{
			return Math.abs(getPt1().getY() - getPt3().getY());
		}
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
	
	// Override toString
	public String toString()
	{
		return String.format("%s, %s, %s, %s", pt1, pt2, pt3, pt4);
	}
	
}
