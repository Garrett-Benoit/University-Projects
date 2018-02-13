package Bouncing_Balls_Package;

import java.awt.Color;
import java.awt.Graphics;

public class VerticalBall
{

    public static int random(int maxRange)
    {
        return (int) Math.round((Math.random() * maxRange));
    }

    private int x;
    private int y;
    private int canvasWidth = 500;
    private int canvasHeight = 500;
    private boolean upDown;
    private int deltaY;
    private int radius = 20;
    private int red = random(255);
    private int green = random(255);
    private int blue = random(255);

    VerticalBall(int x, int y, int width, int height)
    {
        this(x, y, width, height, false);
    }

    VerticalBall(int x, int y, int width, int height, boolean upDown)
    {
        this.x = x;
        this.y = y;
        this.canvasWidth = width;
        this.canvasHeight = height;
        this.upDown = upDown;
        updateDelta();
    }

    public void draw(Graphics g) {

        g.setColor(new Color(red, green, blue));
        g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius),
                (int) (2 * radius));
    }

    private void updateDelta() {
        final int minimumMovement = 5;
        final int maxExtra = 10;
        deltaY = minimumMovement + (int) (Math.random() * maxExtra);
    }

    public void verticalBounce(Container container) {

        // controls vertical ball motion
        if (upDown) {
            y += deltaY;

            if (y >= getHeight()) {
                upDown = false;
                updateDelta();
            }
        } else {
            y += -deltaY;
            if (y <= 0) {
                upDown = true;
                updateDelta();
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
        return canvasWidth;
    }

    public int getHeight() {
        return canvasHeight;
    }
}