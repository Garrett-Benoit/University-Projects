/*		Programmer: Garrett Benoit
 * 		Date:		12/02/2015
 * 		Car.java
 */

package project_3_Cars;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car
{

		// member instance fields
		private int xLeft;
		private int yTop;
		
		// constructor
		public Car(int x, int y)
		{
			xLeft = x;
			yTop = y;
		}
		
		// Draw car1
		public void draw(Graphics2D g2)
		{
			// Create a rectangle named body
			Rectangle body = new Rectangle(xLeft, yTop+10, 60, 10);
			
			// Create a circle named wheel1
			Ellipse2D.Double wheel1 = new Ellipse2D.Double(xLeft+10, yTop+20, 10, 10);
			
			// Create a circle named wheel2
			Ellipse2D.Double wheel2 = new Ellipse2D.Double(xLeft+40, yTop+20, 10, 10);
			
			// Create point1
			Point2D.Double point1 = new Point2D.Double(xLeft+10, yTop+10);
			
			// Create point2
			Point2D.Double point2 = new Point2D.Double(xLeft+20, yTop);
			
			// Create point3
			Point2D.Double point3 = new Point2D.Double(xLeft+40, yTop);
			
			// Create point4
			Point2D.Double point4 = new Point2D.Double(xLeft+50, yTop+10);
			
			// Connect Front Windshield
			Line2D.Double frontWindshield = new Line2D.Double(point1, point2);
			
			// Connect Top Windshield
			Line2D.Double topWindshield = new Line2D.Double(point2, point3);
			
			// Connect Rear Windshield
			Line2D.Double rearWindshield = new Line2D.Double(point3, point4);
			
			// Draw car
			g2.draw(body);
			g2.draw(wheel1);
			g2.draw(wheel2);
			g2.draw(frontWindshield);
			g2.draw(topWindshield);
			g2.draw(rearWindshield);
			
		}
}
