/*		Programmer: Garrett Benoit
 * 		Date:		12/02/2015
 * 		CarFrame.java
 */

package project_3_Cars;

import java.awt.*;

	public class CarFrame
    {

        private static final int HEIGHT = 500;
        private static final int WIDTH = 500;

        public void draw(Graphics g)
        {
            g.setColor(Color.WHITE);
            g.fillRect(0, 0, WIDTH, HEIGHT);
        }
    }
