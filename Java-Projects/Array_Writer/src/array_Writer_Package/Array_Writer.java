package array_Writer_Package;

public class Array_Writer implements Runnable
{

	private final Simple_Array simple;
	private final int startTime;
	
	public Array_Writer(int time, Simple_Array arr)
	{
		simple = arr;
		startTime = time;
	}
	
	public void run()
	{
		for (int i=startTime; i<startTime+3; i++)
		{
			simple.add(i);
		}
	}
	
}
