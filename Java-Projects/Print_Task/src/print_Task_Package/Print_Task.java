package print_Task_Package;

import java.security.SecureRandom;

public class Print_Task implements Runnable
{

	private final static SecureRandom random = new SecureRandom();
	private final int sleepTime;
	private final String taskName;
	
	// Constructor
	public Print_Task(String name)
	{
		// Assign passed in string to taskName
		taskName = name;
		
		// Pick a random time for sleep mode
		sleepTime = random.nextInt(5000);	//milliseconds

	}
	
	public void run()
	{
		try
		{
			System.out.printf("%s going to sleep for %d milliseconds. %n", taskName, sleepTime);
			
			Thread.sleep(sleepTime);	// Put thread to sleep
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
			
			Thread.currentThread().interrupt();		// Interrupt current thread
		}
		
		System.out.printf("%s is done sleeping.%n", taskName);
		
	}
	
}
