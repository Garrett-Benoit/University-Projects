package carPackage;

import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class CarComponent extends JComponent
{
	private int numX;
	private int numY;
	
	public CarComponent(int x, int y)
	{
		numX = x;
		numY = y;
		
	}
	
	public void paintComponent(Graphics g)
	{
		// Cast Graphics to Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Create car1
		Car car1 = new Car(0, 0);
		
		// Create car2
		Car car2 = new Car(numX, numY);
		
		int x = getWidth() - 60;
		g2.drawString(Integer.toString(getWidth()), 100, 200);
		
		int y = getWidth() - 60;
		g2.drawString(Integer.toString(getHeight()), 150, 250);
		
		// Create car3
		Car car3 = new Car(x, y);
	
		// Draw car 1
		car1.draw(g2);
		
		// Draw car 2
		car2.draw(g2);
		
		// Draw car 3
		car3.draw(g2);
		
	}
	
	
	
}
