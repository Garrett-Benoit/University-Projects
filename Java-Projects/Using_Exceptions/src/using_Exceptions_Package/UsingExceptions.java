package using_Exceptions_Package;

public class UsingExceptions
{

	public static void main(String[] args)
	{
		
		try
		{
			method1();
		}
		catch(Exception e)
		{
			System.err.println("Exception handled in main");
			e.printStackTrace();
			
			StackTraceElement[] traceElement = e.getStackTrace();
			
			System.out.printf("%nStack trace from getStackTrace: %n");
			System.out.printf("Class\t\tFile\t\tLine\t\tMethod%n");
			
			for (StackTraceElement stck:StackTraceElement)printf(%s%n);
			
		}
		
		method2();
		
	}
	
	public static void method1()
		throws Exception
	{
		
		try
		{
			System.out.println("throwException executed");
			throw new Exception();
		}
		catch(Exception e)
		{
			System.err.println("Exception handled in throwException");
			throw e;
		}
		
		finally
		{
			System.err.println("Finally is executed");
		}
	
	}
	
	public static void method2()
	{
		
		try
		{
			System.out.println("Inside doesNotThrow");
		}
		catch(Exception e)
		{
			System.err.println(e);
		}
		finally
		{
			System.err.println("Finally in doesNotThrow");
		}
			
	}
	
}
