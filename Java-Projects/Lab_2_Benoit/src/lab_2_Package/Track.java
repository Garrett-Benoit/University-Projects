package lab_2_Package;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;

public class Track {

	// member instance fields
	private int xLeft;
	private int yTop;
		
	// constructor
	public Track(int x, int y)
	{
		xLeft = x;
		yTop = y;
	}

	// Draw Track
	public void draw(Graphics2D g2)
	{	
		// Create an ellipse named OutterRing
		Ellipse2D.Double OutterRing = new Ellipse2D.Double(xLeft, yTop, 360, 245);
		
		// Create a rectangle named PitRoad
		Rectangle PitRoad = new Rectangle(xLeft+25, yTop+160, 310, 15);
	
		// Initialize Brown as a Color
		Color brown = new Color(139,69,19);
		
		// Draw Track
		Stroke previousStroke = g2.getStroke();
		g2.setStroke(new BasicStroke(28.0f)); // Set line thickness of ellipse to 28pt
		g2.setColor(brown);
		g2.draw(OutterRing);
		g2.setStroke(previousStroke);
		
		// Draw Pit Road
		g2.setColor(brown);
		g2.fillRect(xLeft+25, yTop+160, 310, 15);
		g2.draw(PitRoad);
		
	}
	
}
