package lab_2_Package;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

public class Cloud {

	// member instance fields
	private int xLeft;
	private int yTop;
	
	// constructor
	public Cloud(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}
		
	// Draw Cloud
	public void draw(Graphics2D g2)
	{
		// Create an ellipse named TopLeft
		Ellipse2D.Double TopLeft = new Ellipse2D.Double(xLeft, yTop, 20, 20);
		
		// Create an ellipse named TopMid
		Ellipse2D.Double TopMid = new Ellipse2D.Double(xLeft+20, yTop, 20, 20);
		
		// Create an ellipse named TopRight
		Ellipse2D.Double TopRight = new Ellipse2D.Double(xLeft+40, yTop, 20, 20);
		
		// Create an ellipse named LowLeft
		Ellipse2D.Double LowLeft = new Ellipse2D.Double(xLeft+10, yTop+15, 20, 20);
		
		// Create an ellipse named LowRight
		Ellipse2D.Double LowRight = new Ellipse2D.Double(xLeft+30, yTop+15, 20, 20);
		
		// Draw cloud
		g2.setColor(Color.WHITE);
		g2.fillOval(xLeft, yTop, 20, 20);
		g2.draw(TopLeft);
		
		g2.setColor(Color.WHITE);
		g2.fillOval(xLeft+20, yTop, 20, 20);
		g2.draw(TopMid);
		
		g2.setColor(Color.WHITE);
		g2.fillOval(xLeft+40, yTop, 20, 20);
		g2.draw(TopRight);
		
		g2.setColor(Color.WHITE);
		g2.fillOval(xLeft+10, yTop+15, 20, 20);
		g2.draw(LowLeft);
		
		g2.setColor(Color.WHITE);
		g2.fillOval(xLeft+30, yTop+15, 20, 20);
		g2.draw(LowRight);
		
	}
	
}
