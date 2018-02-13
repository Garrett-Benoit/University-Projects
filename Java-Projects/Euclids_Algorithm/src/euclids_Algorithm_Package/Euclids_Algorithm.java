package euclids_Algorithm_Package;

import java.util.Scanner;

public class Euclids_Algorithm {

	static int m;
	static int n;
	
	public static void main(String[] args)
	{
		// Create scanner class
		Scanner input = new Scanner(System.in);
		
		// Prompt for advisor
		System.out.print("Please enter an advisor: ");
		
		// Store advisor input
		m = input.nextInt();
		
		// Prompt for divisor input
		System.out.print("Please enter a divisor: ");
		
		// Store divisor input
		n = input.nextInt();
		
		// Print out greatest common divisor
		System.out.printf("\nRecursive answer is: %s", recursively(m, n));
		
		System.out.printf("\n\nIterative answer: %s", iteratively(m, n));
		
		// Close scanner
		input.close();

	}
	
	// Euclid's Algorithm Recursively
	public static int recursively(int m, int n)
	{
		if(n == 0)
		{
			return m;
		}
		else
		{
			return recursively(n, m%n);
		}
	}
	
	// Euclid's Algorithm Iteratively
	public static int iteratively(int m, int n)
	{
		int r;
		
		while(n != 0)
		{
			r = m % n;
			
			m = n;
			
			n = r;
			
		}
		
		return m;
		
	}

}
