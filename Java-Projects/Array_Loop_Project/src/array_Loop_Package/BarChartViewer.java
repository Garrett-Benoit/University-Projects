/*	Program:		Array_Loop_Project
 * 	Programmer:		Garrett Benoit
 * 	Class:			CSCI 282 Q
 * 	Instructor:		Kussmann
 * 	Date:			09/25/2015
 */

package array_Loop_Package;

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class BarChartViewer
{

	public static void main(String[] args)
	{
		final int SIZE = 5;
		int [] val = new int [SIZE];
		
		for (int i=0; i<SIZE; i++)
		{
			
			String num = JOptionPane.showInputDialog("Please enter an integer value: ");
		
			// Parse string num to an integer, store into array
			val[i] = Integer.parseInt(num);
			
		}
		
		// Create instance of JFrame called frame
		JFrame frame = new JFrame("Bar Chart");
		
		// Set frame size
		frame.setSize(500, 500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create instance of BarChartComponent called chartComponent
		BarChartComponent chartComponent = new BarChartComponent(val);
		
		frame.add(chartComponent);
		
		frame.setVisible(true);
		
	}

}
