package triangles_Package;

import java.util.Scanner;

public class TriangleTester {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		
		System.out.println("Enter triangle width: ");
		
		Scanner in = new Scanner(System.in);
		
		int triangleInput = in.nextInt();
		
		Triangle triangleClass = new Triangle(triangleInput);
		
		System.out.println(triangleClass.getArea());
		
		System.out.println(triangleClass);

	}

}
