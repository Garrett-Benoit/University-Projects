package array_Writer_Package;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Array_Tester
{

	public static void main(String[] args)
	{
		
		Simple_Array simple = new Simple_Array(6);
		
		// Create two tasks
		Array_Writer writer1 = new Array_Writer(1, simple);
		Array_Writer writer2 = new Array_Writer(11, simple);

		// Execute ExecutorService
		ExecutorService executor = Executors.newCachedThreadPool();
		
		executor.execute(writer1);
		executor.execute(writer2);
		
		executor.shutdown();
		
		try
		{
			// Wait 1 minute for both writers to finish executing
			boolean taskEnd = executor.awaitTermination(1, TimeUnit.MINUTES);
			
			if (taskEnd)
			{
				System.out.printf("%nContents of Simple_Array: %n");
				System.out.println(simple);
			}
			else
			{
				System.out.println("Timed out while waiting for tasks to finish.");
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
