/*	Author:			Garrett Benoit
 * 
 * 	Project:		DataSetReader
 * 
 * 	Description:	Read a set of data from a file.  The file must have the format
 * 					numberOfValues
 * 					value1
 * 					value2
 * 					value3
 * 
 * 	Date:			26/10/15
 */

package data_Set_Reader;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DataSetReader {

	/**	Reads a data set from a file.
	 * 
	 * @param filename the name of the file holding data
	 * @return the data of the file
	 * @throws IOException for opening/closing the file
	 */
	private double[] data;
	
	public double[] readFile(String filename) throws IOException
	{
		// Create new file class called inFile
		File inFile = new File(filename);
		
		// Create new scanner class called input
		Scanner input = new Scanner(inFile);
		
		// 
		try
		{
			readData(input);
			
			return data;
		}
		finally
		{
			input.close();
		}
	}
	
	/**
	 * Reads all data.
	 * @param input is the scanner which reads data
	 * @throws BadDataException reports incorrect input data
	 */
	private void readData(Scanner input) throws BadDataException
	{
		if (!input.hasNextInt())
		{
			throw new BadDataException("Length expected!");
		}
		
		int numberOfValues = input.nextInt();
		data = new double[numberOfValues];
		
		for (int i=0; i<numberOfValues; i++)
		{
			readValue(input, i);
		}
		
		if (input.hasNext())
		{
			throw new BadDataException("End of file expected!");
		}
		
	}
	
	/**
	 * 	Reads one data value
	 * @param input is the scanner which reads data
	 * @param i is the position of the value it reads
	 * @throws BadDataException reports incorrect input data
	 */
	private void readValue(Scanner input, int i) throws BadDataException
	{
		if (!input.hasNextDouble())
		{
			throw new BadDataException("Data value expected!");
		}
		
		data[i] = input.nextDouble();
		
	}
	
}
