package temperature_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class TemperatureComponent extends JComponent
{
	//instance fields
	private double tempInput;
	private int tempType;
	private final String OLDTEMP = "The old temperature input of ";
	private final String NEWTEMP = " has been converted to ";
		
	//constructor
	public TemperatureComponent(double a, int b)
	{
		// Assign tempInput to variable a and tempType to variable b
		tempInput = a;
		tempType = b;
	}
	
	public void paintComponent(Graphics g)
	{
	// Cast Graphics g into Graphics2D g2
	Graphics2D g2 = (Graphics2D) g;
		
	// Create TemperatureLogic class with a temperature input
	TemperatureLogic pish = new TemperatureLogic(tempInput);
			
	// If Else statement to decide on Fahrenheit or Celsius calculation
	if(tempType == 0)
		{
			String oldNum = Double.toString(pish.getOldTemp());
			String farenheit = Double.toString(pish.fahrenheit());
			
			g2.drawString(OLDTEMP + oldNum + NEWTEMP + farenheit, 25, 35);
		}
	else
		{
		
			String oldNum = Double.toString(pish.getOldTemp());
			String celsius = Double.toString(pish.celsius());
		
			g2.drawString(OLDTEMP + oldNum + NEWTEMP + celsius, 5, 25);
					
		}
	
	}
	
}
