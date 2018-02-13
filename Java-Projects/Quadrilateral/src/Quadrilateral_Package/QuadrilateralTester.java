package Quadrilateral_Package;

public class QuadrilateralTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Point
		Point ptTest = new Point(1.1, 2.4);
		System.out.printf("Point is: %s.%n", ptTest);

		// Quadrilateral
//		Quadrilateral quadTest = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);	
//		System.out.printf("Quadrilateral is: %s.%n", quadTest);
		
		// Parallelogram
		Parallelogram parallel = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		System.out.printf("Parallelogram is: %s.%n", parallel);
		System.out.printf("Area of Parallelogram is: %s.%n", parallel.getArea());
		System.out.printf("The name of the shape is %s.%n", parallel.getName());
		
		// Trapezoid
		Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);
		System.out.printf("Trapezoid is: %s.%n", trapezoid);
		System.out.printf("Area of Trapezoid is: %s.%n", trapezoid.getArea());
		System.out.printf("The name of the shape is %s.%n", trapezoid.getName());
		
		// Rectangle
		Rectangle rectangle1 = new Rectangle(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		System.out.printf("Rectangle is: %s.%n", rectangle1);
		System.out.printf("Area of Rectangle is: %s.%n", rectangle1.getArea());
		System.out.printf("The name of the shape is %s.%n", rectangle1.getName());
		
		// Rectangle
		Square square1 = new Square(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);
		System.out.printf("Square is: %s.%n", square1);
		System.out.printf("Area of Square is: %s.%n", square1.getArea());
		System.out.printf("The name of the shape is %s.%n", square1.getName());
		
		// Down cast rectangle2 as square1
		Rectangle rectangle2 = square1;
		System.out.printf("Rectangle is: %s.%n", rectangle2);
		System.out.printf("Area of Rectangle is: %s.%n", rectangle2.getArea());
		System.out.printf("The name of the shape is %s.%n", rectangle2.getName());
		
		// Rectangle
//		Rectangle rectangle = new Rectangle();
//		if (rectangle instanceof Rectangle)
//		{
//			System.out.println("Rectangle");
//		}
//		if (rectangle instanceof Parallelogram)
//		{
//			System.out.println(parallel.getName());
//		}
//		else
//		{
//			System.out.println("Not a Parallelogram");
//		}
	}

}
