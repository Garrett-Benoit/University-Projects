package lab_2_Package;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Garage {

	// member instance fields
	private int xLeft;
	private int yTop;
		
	// constructor
	public Garage(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}

	// Draw Garage
	public void draw(Graphics2D g2)
	{
		// Create a rectangle named wall
		Rectangle wall = new Rectangle(xLeft, yTop, 100, 100);
		
		// Create a rectangle named door
		Rectangle door = new Rectangle(xLeft+10, yTop+60, 80, 40);
		
		// Create a rectangle named window
		Rectangle window = new Rectangle(xLeft+20, yTop+20, 30, 30);
		
		// Create point1
		Point2D.Double point1 = new Point2D.Double(xLeft+35, yTop+20);
		
		// Create point2
		Point2D.Double point2 = new Point2D.Double(xLeft+35, yTop+50);
		
		// Create point3
		Point2D.Double point3 = new Point2D.Double(xLeft+20, yTop+35);
		
		// Create point4
		Point2D.Double point4 = new Point2D.Double(xLeft+50, yTop+35);
		
		// Create a line named verticalpane
		Line2D.Double verticalpane = new Line2D.Double(point1, point2);
		
		// Create a line named horizontalpane
		Line2D.Double horizontalpane = new Line2D.Double(point3, point4);
		
		// Draw Garage
		// Set color of wall as gray
		g2.setColor(Color.GRAY);
		g2.fillRect(xLeft, yTop, 100, 100);
		g2.draw(wall);
		
		// Set color of door as black
		g2.setColor(Color.BLACK);
		g2.fillRect(xLeft+10, yTop+60, 80, 40);
		g2.draw(door);
		
		// Set color of window as green
		g2.setColor(Color.GREEN);
		g2.fillRect(xLeft+20, yTop+20, 30, 30);
		g2.draw(window);
		
		// Set color of vertical pane as black
		g2.setColor(Color.BLACK);
		g2.fillRect(xLeft+35, yTop+20, 2, 30);
		g2.draw(verticalpane);
		
		// Set color of horizontal pane as black
		g2.setColor(Color.BLACK);
		g2.fillRect(xLeft+20, yTop+35, 30, 2);
		g2.draw(horizontalpane);
		
		
		
	}
	
}
