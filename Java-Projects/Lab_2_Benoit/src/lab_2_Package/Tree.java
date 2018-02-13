package lab_2_Package;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

public class Tree {

	// member instance fields
	private int xLeft;
	private int yTop;
		
	// constructor
	public Tree(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}

	// Draw Tree
	public void draw(Graphics2D g2)
	{
		// Create a rectangle named trunk
		Rectangle Trunk = new Rectangle(xLeft+18, yTop+50, 20, 50);
		
		// Create an ellipse named TopLeft
		Ellipse2D.Double TopLeft = new Ellipse2D.Double(xLeft, yTop, 30, 30);
		
		// Create an ellipse named TopRight
		Ellipse2D.Double TopRight = new Ellipse2D.Double(xLeft+25, yTop, 30, 30);
		
		// Create an ellipse named LowLeft
		Ellipse2D.Double LowLeft = new Ellipse2D.Double(xLeft, yTop+25, 30, 30);
		
		// Create an ellipse named LowRight
		Ellipse2D.Double LowRight = new Ellipse2D.Double(xLeft+25, yTop+25, 30, 30);
		
		// Draw Tree
		g2.setColor(Color.DARK_GRAY);
		g2.fillRect(xLeft+18, yTop+50, 20, 50);
		g2.draw(Trunk);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(xLeft, yTop, 30, 30);
		g2.draw(TopLeft);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(xLeft+25, yTop, 30, 30);
		g2.draw(TopRight);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(xLeft, yTop+25, 30, 30);
		g2.draw(LowLeft);
		
		g2.setColor(Color.GREEN);
		g2.fillOval(xLeft+25, yTop+25, 30, 30);
		g2.draw(LowRight);
	}
	
}
