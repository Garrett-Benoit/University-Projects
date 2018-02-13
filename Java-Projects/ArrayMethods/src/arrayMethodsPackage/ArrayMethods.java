package arrayMethodsPackage;

import java.security.SecureRandom;

public class ArrayMethods {
	
	// Assign a constant SIZE as 10 with data type int
	private static final int SIZE = 10;
	
	// Assign array [values] with data type int
	private static int [] values;
	
	// Constructor
	public ArrayMethods()
	{
		// Assign values with index of SIZE
		values = new int [SIZE];
		
		// Create a random number variable
		SecureRandom randomNumber = new SecureRandom();
		
		// For loop starting at 0 incrementing one time per loop until count = SIZE
		for (int count = 0; count < SIZE; count++)
		{
			
			// Assign a random value from 0-100 to an index of the array [values]
			values[count] = randomNumber.nextInt(100);
			
		}
		
	}
	
	// Get methods
	public static int [] getValues()
	{
		
		// Return array
		return values;
		
	}
	
	public static int getSIZE()
	{
		
		// Return constant
		return SIZE;
		
	}
}
