package arrayMethodsPackage;

public class ArrayViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Create an ArrayMethods class without an input
		ArrayMethods val = new ArrayMethods();

		// For loop starting at 0 and incrementing one time per loop until i = 10
		// for (int i = 0; i < ArrayMethods.getSIZE(); i++)
		for (int value : ArrayMethods.getValues()) // Enhanced for loop
		{
			// Try Catch statement for Array
			try
			{
				// Print out the value of the current index
				// System.out.println(val.getValues()[i]);
				System.out.println(value); // Enhanced for loop
			} 
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
			
	}
		
}


