package triangles_Package;

public class Triangle
{

	// Instance fields
	private int width;
	private final String BOX = "[ ]";
	
	// Constructor
	public Triangle(int w)
	{
		width = w;
	}
	
	// Get area
	public int getArea()
	{
		if (width == 1)
		{
			return 1;
		}
		else
		{
			Triangle smallAngle = new Triangle(width - 1);
			
			int smallArea = smallAngle.getArea();
			
			return smallArea + width;
		}
	}
	
	public String toString()
	{
		String space = "";
		
		for(int i=1; i<=width; i++)
		{
			for(int j=1; j<=i; j++)
			{
				space += BOX;
			}
			space += "\n";
		}
		
		return space;
	}
	
}
