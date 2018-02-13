package array_Writer_Package;

import java.security.SecureRandom;
import java.util.Arrays;

public class Simple_Array	// Caution: Unsafe thread
{

	private final static SecureRandom random = new SecureRandom();
	private final int [] array;
	private int index = 0;
	
	// Constructor
	public Simple_Array(int size)
	{
		array = new int [size];
	}
	
	// Add value to array
	public void add(int value)
	{
		int position = index;
		
		try
		{
			Thread.sleep(random.nextInt(500));
		}
		catch(InterruptedException e)
		{
			Thread.currentThread().interrupt();
		}
		
		// Insert value into array
		array[position] = value;
		
		System.out.printf("%s wrote %2d to element %d.%n", Thread.currentThread().getName(), value, position);
		
		index++;
		
		System.out.printf("Next write index: %d%n", index);
		
	}
	
	public String toString()
	{
		return Arrays.toString(array);
	}
	
}
