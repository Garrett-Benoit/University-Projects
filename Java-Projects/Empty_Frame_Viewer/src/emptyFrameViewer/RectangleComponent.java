package emptyFrameViewer;

// Import JComponent class
import javax.swing.JComponent;
// Import Graphics class
import java.awt.Graphics;
// Import Graphics2D class
import java.awt.Graphics2D;
// Import Rectangle class
import java.awt.Rectangle;
// Import Color class
import java.awt.Color;
// Import Ellipse2D class
import java.awt.geom.Ellipse2D;

public class RectangleComponent extends JComponent
{
	
	public void paintComponent(Graphics g)
	{
		
		// Cast g Graphics into g2 Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Create a rectangle (x, y, width, height)
		Rectangle box = new Rectangle(25, 25, 80, 50);
		
		// Draw box
		g2.draw(box);
		
		// Initialize magenta as a Color
		Color magenta = new Color(255, 0, 255);
		
		// Set color of box as magenta
		g2.setColor(magenta);
		
		// Translate box to a new location
		box.translate(15, 25);
		
		// Draw box a second time
		g2.draw(box);
		
		// Create an ellipse (x, y, width, height)
		Ellipse2D.Double ellipse = new Ellipse2D.Double(125, 125, 100, 160);
		
		// Set color of box as blue
		g2.setColor(Color.BLUE);
		
		// Draw ellipse
		g2.draw(ellipse);
		
	}
	
}
