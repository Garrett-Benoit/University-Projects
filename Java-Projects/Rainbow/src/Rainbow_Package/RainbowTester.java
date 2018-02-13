package Rainbow_Package;

import java.util.EnumSet;

public class RainbowTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
/*
		System.out.println("Years");
		
		for(Rainbow bow:Rainbow.values())
		{
			System.out.printf("%-10s%10d%n", bow, bow.getYear());
		}
		
		// Enumeration Set
		System.out.println("Range");
		
		for(Rainbow bow:EnumSet.range(Rainbow.blue, Rainbow.indigo))
		{
			System.out.printf("%-10s%10d%n", bow, bow.getYear());
		}
*/

		for (Rainbow bow: Rainbow.values())
		{
			System.out.printf("%-10s%n", bow);
		}
	}
}
