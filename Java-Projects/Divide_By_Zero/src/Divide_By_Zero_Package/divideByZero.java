package Divide_By_Zero_Package;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divideByZero {

	public static int quotient(int numerator, int denominator)
		throws ArithmeticException
	{
		return numerator/denominator;	// Possible exception <Division by Zero>
	}
	
	public static void main(String[] args) {
		
		// Create scanner
		Scanner input = new Scanner(System.in);
		
		// Declare variables
		boolean continueLoop = true;
		
		// Loop project
		do
		{
			// Exception handling for input
			try
			{
				// Prompt for numerator input
				System.out.print("Please enter a numerator: ");
				
				// Store numerator input
				int numerator = input.nextInt();
				
				// Prompt for denominator input
				System.out.print("Please enter a denominator: ");
				
				// Store denominator input
				int denominator = input.nextInt();
	
				// Pass 
				int result = quotient(numerator, denominator);
				
				// Display results
				System.out.printf("%nResult: %d/%d = %d%n", numerator, denominator, result);
				
				// Terminate loop
				continueLoop = false;
			}
			catch (ArithmeticException arEx)
			{
				// Display math error
				System.err.printf("%nException: %s%n", arEx);
				System.out.printf("Cannot divide by zero! ");
			}
			catch (InputMismatchException inMis)
			{
				// Display input error
				System.err.printf("%nException: %s%n", inMis);
				input.nextLine();
				System.out.printf("Must enter integer values! ");
			}
		} while (continueLoop);
	}

}
