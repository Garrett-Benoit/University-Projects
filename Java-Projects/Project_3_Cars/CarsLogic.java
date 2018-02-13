/*		Programmer:		Garrett Benoit
 * 		Project:		Project 3
 * 		Instructor:		Kaye Kussmann
 * 		Description:	Cars program displays a frame, and upon a click of the mouse, a randomly colored car is drawn and moves
 * 						horizontally across the screen.  A maximum of 20 cars can be displayed on the screen at once.
 */

package project_3_Cars;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import project_3_Cars.Car;
import project_3_Cars.CarFrame;

public class CarsLogic
{
	// Declare variables
	private int x;
    private int y;
    private int width = 500;
    private int height = 500;
    private boolean move;
    private int z;
    private int red = random(255);
    private int blue = random(255);
    private int green = random(255);

    // Constructor
    CarsLogic(int x, int y, int width, int height, boolean move)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.move = move;
        movement();
    }
    
    CarsLogic(int x, int y, int width, int height)
    {
        this(x, y, width, height, false);
    }

    public void draw(Graphics g)
    {
    	// Cast Graphics to Graphics2D
    	Graphics2D g2 = (Graphics2D) g;
    	
    	// Assign random color to each car
        g2.setColor(new Color(red, blue, green));
        
        // Create car class, pass in x and y coordinates
        Car car = new Car(x, y);
        
        // Draw car
        car.draw(g2);
    }

    public static int random(int maxRange)
    {
    	// Calculate random number
        return (int) Math.round((Math.random() * maxRange));
    }
    
    private void movement()
    {
        z = 10;
    }

    public void move(CarFrame frame)
    {
        if (move)
        {
            x += z;

            if (x >= getHeight())
            {
                move = false;
                movement();
            }
        }
        else
        {
            x += -z;
            if (x <= 0)
            {
                move = true;
                movement();
            }
        }

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
	
}
