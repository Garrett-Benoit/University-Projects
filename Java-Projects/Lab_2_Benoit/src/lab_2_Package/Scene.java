package lab_2_Package;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Scene {

	// member instance fields
	private int xLeft;
	private int yTop;
		
	// constructor
	public Scene(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}

	// Draw Scene
	public void draw(Graphics2D g2)
	{
		// Create a rectangle named Sky
		Rectangle Sky = new Rectangle(xLeft+25, yTop+25, 499, 299);
		
		// Create a rectangle named Ground
		Rectangle Ground = new Rectangle(xLeft+25, yTop+290, 499, 220);
	
		// Set color of Sky as blue
		g2.setColor(Color.BLUE);
		g2.fillRect(xLeft+25, yTop+25, 499, 299);
		
		// Draw Sky
		g2.draw(Sky);
		
		// Set color of Ground as green
		g2.setColor(Color.GREEN);
		g2.fillRect(xLeft+25, yTop+290, 499, 220);
		
		// Draw Ground
		g2.draw(Ground);
		
	}
}
