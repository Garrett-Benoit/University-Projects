/*	Program:		Array_Loop_Project
 * 	Programmer:		Garrett Benoit
 * 	Class:			CSCI 282 Q
 * 	Instructor:		Kussmann
 * 	Date:			09/25/2015
 */

package array_Loop_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{

	// Initialize variables, arrays, and constants
	private int[] values;
	
	// Constructor
	public BarChartComponent(int [] val)
	{
	
		values = val;
		
	}
	
	public void paintComponent(Graphics g)
	{
		
		// Cast Graphics g into Graphics2D g2
		Graphics2D g2 = (Graphics2D) g;
		
		// Create new instance of BarChart called chart
		BarChart chart = new BarChart(values);
		
		// Draw chart
		chart.draw(g2);
		
	}
	
}
