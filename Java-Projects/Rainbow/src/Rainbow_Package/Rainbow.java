package Rainbow_Package;

public enum Rainbow
{
	red(2010),
	orange(2011),
	yellow(2012),
	green(2013),
	blue(2014),
	indigo(2015),
	violet(2016);
	
//	red,
//	orange,
//	yellow,
//	green,
//	blue,
//	indigo,
//	violet;
	
	// Initialize variables
	private int year;
	
	// Constructor
	Rainbow(int year)
	{
		this.year = year;
	}
	
	public int getYear()
	{
		return year;
	}
	
}
