package data_Set_Reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * 		This program reads a file containing numbers and analyzes its contents
 * 		If the file doesn't exist or contains strings that are not numbers, an error
 * 		message is displayed.
 * 
 * @author user
 *
 */
public class DataAnalyzer {

	public static void main(String[] args) {
		
		//
		DataSetReader reader = new DataSetReader();
		
		Scanner input = new Scanner(System.in);
		
		boolean finished = false;
		
		while (!finished)
		{
			try
			{
				System.out.println("Please enter the file name: ");
				String filename = input.next();
				
				double[] data = reader.readFile(filename);
				double sum = 0;
				
				for(double d : data)
				{
					sum += d;
				}
				
				System.out.println("The sum is " + sum);
				
				finished = true;
			}
			catch(FileNotFoundException e)
			{
				System.err.println("File not found!");
			}
			catch(BadDataException e)
			{
				System.err.println("Bad data: " + e.getMessage());
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}

	}

}
