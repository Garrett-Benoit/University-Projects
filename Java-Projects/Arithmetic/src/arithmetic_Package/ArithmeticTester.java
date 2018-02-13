package arithmetic_Package;

import java.util.Scanner;

public class ArithmeticTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create scanner for keyboard input
		Scanner input = new Scanner(System.in);
		
		// Prompt user for two integer values
		System.out.println("Please enter an integer value: ");
		int first = input.nextInt();

		System.out.println("Please enter another integer value: ");
		int second = input.nextInt();
		
		// Create Arithmetic class with two integer values
		Arithmetic pish = new Arithmetic(first, second);
		
		// Display results for calculations
		System.out.println(pish.getNum1() + " + " + pish.getNum2() + " = " + pish.add());
		
		System.out.println(pish.getNum1() + " - " + pish.getNum2() + " = " + pish.subtract());
		
		System.out.println(pish.getNum1() + " * " + pish.getNum2() + " = " + pish.multiply());
		
		System.out.println(pish.getNum1() + " / " + pish.getNum2() + " = " + pish.divide() + " remainder of " + pish.remainder());
	
		// Close scanner
		input.close();
		
	}
	
}
