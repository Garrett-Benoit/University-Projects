package print_Task_Package;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Execute_Task
{

	public static void main(String[] args)
	{
		
		// Create threads, name each runnable
		Print_Task task1 = new Print_Task("task1");
		Print_Task task2 = new Print_Task("task2");
		Print_Task task3 = new Print_Task("task3");
		
		System.out.println("Starting thread execution.");

		// Create ExecutorService to manage threads
		ExecutorService executor = Executors.newCachedThreadPool();
		
		// Start three tasks
		executor.execute(task1);
		executor.execute(task2);
		executor.execute(task3);
		
		executor.shutdown();	// Shut down ExecutorService
		
		System.out.printf("Thread execution tasks started.  Main ends.%n%n");
		
	}

}
