package data_Set_Reader;

import java.io.IOException;

public class BadDataException extends IOException
{

	public BadDataException()
	{
		
	}
	
	public BadDataException(String message)
	{
		super(message);
	}
	
}
