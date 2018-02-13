package temperature_Package;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TemperatureViewer {

	public static void main(String[] args) {
		
		// Initialize a new JFrame variable.
		JFrame frame = new JFrame();
				
		// Set size value for frame JFrame.
		frame.setSize(500, 100);
		
		// Declare variables for temperatureType dialog box
		int temperatureType = 0;
		Object[] options = {"Fahrenheit", "Celsius", "Cancel"};
		
		// Custom buttons to select desired temperature
		temperatureType = JOptionPane.showOptionDialog(frame, "Which temperature would you like to convert?", "Select a temperature",
		    JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
		
		if(temperatureType != 2)
		{
			// Prompt user for a temperature value
			String temperatureInput = JOptionPane.showInputDialog("Please enter a temperature to convert: ");
			
			if(temperatureInput != null)
			{
			
				// Create scanner for keyboard input
				Scanner input = new Scanner(System.in);

				// Close scanner input
				input.close();
		
				// Parse the input string to a double
				Double temperatureInputParse = Double.parseDouble(temperatureInput);
		
				// Create TemperatureLogic class with a temperature input
				TemperatureComponent pish = new TemperatureComponent(temperatureInputParse, temperatureType);
		
				frame.add(pish);
		
				// Set frame location to null
				frame.setLocationRelativeTo(null);
				// Set frame to visible
				frame.setVisible(true);
			}
		
		}
		
	}

}
