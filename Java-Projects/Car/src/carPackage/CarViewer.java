package carPackage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CarViewer
{

	public static void main(String[] args)
	{
		
		// Create the frame
		JFrame frame = new JFrame("Car");
		
		// Set size of frame
		frame.setSize(500, 400);
		
		// Set close on exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		// Show dialog box asking for X coordinate input stored into a string named numX
		String numX = JOptionPane.showInputDialog("Please enter an X coordinate: ");
		
		// Parse value of numX into an integer named x
		int x = Integer.parseInt(numX);
		
		// Show dialog box asking for X coordinate input stored into a string named numY
		String numY = JOptionPane.showInputDialog("Please enter a Y coordinate: ");
		
		// Parse value of numY into an integer named y
		int y = Integer.parseInt(numY);
		
		
		// Create CarComponent as component
		CarComponent component = new CarComponent(x, y);
		
		// Add component CarComponent to the frame
		frame.add(component);
		
		// Set frame to visible
		frame.setVisible(true);
		
	}

}
