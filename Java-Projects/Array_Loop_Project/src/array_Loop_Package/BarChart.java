/*	Program:		Array_Loop_Project
 * 	Programmer:		Garrett Benoit
 * 	Class:			CSCI 282 Q
 * 	Instructor:		Kussmann
 * 	Date:			09/25/2015
 */

package array_Loop_Package;

import java.awt.Graphics2D;

public class BarChart
{

	// Initialize variables, arrays, and constants
	private int [] barArray;
	private final int SIZE = 5;
	private final String ASTERISK = "*";
	
	// Constructor
	public BarChart(int [] val)
	{
		
		barArray = val;
		
	}
	
	public void draw(Graphics2D g2)
	{
		
		int x = 5;
		int y = 15;
		
		for (int i=0; i<SIZE; i++)
		{
			for (int j=0; j<barArray[i]; j++)
			{
				// Draw an asterisk per loop
				g2.drawString(ASTERISK, x, y);
				// Increment x coordinate 5 pixels per loop
				x += 5;
			}
			
			// Increment y coordinate 10 pixels per loop
			y+=10;
			
			// Reset x value
			x=5;
			
		}
		
	}
	
}
