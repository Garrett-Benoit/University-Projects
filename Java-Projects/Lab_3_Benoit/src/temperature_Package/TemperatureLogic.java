package temperature_Package;
	
public class TemperatureLogic {

	//instance fields
	private double oldTempNum;
	private double newTempNum;
	
	//constructor
	public TemperatureLogic(double a)
	{
			
		// Assign the old temperature number to variable a
		oldTempNum = a;
		
	}
	
	// Accessors
	public void setOldTemp(double num)
	{
		oldTempNum = num;
	}

	public double getOldTemp()
	{
		return oldTempNum;
	}
		
	public void setNewTemp(double num)
	{
		newTempNum = num;
	}

	public double getNewTemp()
	{
		return newTempNum;
	}
	
	// Methods
	public double fahrenheit()
	{
		// Calculate Fahrenheit to Celsius and return the number
		return newTempNum = (((oldTempNum-32)*5)/9);

	} 

	public double celsius()
	{
		// Calculate Celsius to Fahrenheit and return the number
		return newTempNum = ((oldTempNum*1.8)+32);
	} 
		
}
