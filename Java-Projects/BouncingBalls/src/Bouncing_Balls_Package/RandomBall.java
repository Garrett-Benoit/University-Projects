package Bouncing_Balls_Package;

import java.awt.Color;
import java.awt.Graphics;

public class RandomBall {

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }

    private int x;
    private int y;
    private int canvasWidth = 500;
    private int canvasHeight = 500;
    private boolean leftRight;
    private boolean upDown;
    private int deltaX;
    private int deltaY;
    private int radius = 20;
    private int red = random(255);
    private int green = random(255);
    private int blue = random(255);

    RandomBall(int x, int y, int width, int height) {
        this(x, y, width, height, false, false);
    }

    RandomBall(int x, int y, int width, int height, boolean leftRight, boolean upDown) {
        this.x = x;
        this.y = y;
        this.canvasWidth = width;
        this.canvasHeight = height;
        this.leftRight = leftRight;
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
        deltaX = minimumMovement + (int) (Math.random() * maxExtra);
    }

    public void ballBounce(Container container) {
        // controls horizontal ball motion
        if (leftRight) {
            x += deltaX;
            if (x >= getWidth()) {
                leftRight = false;
                updateDelta();
            }
        } else {
            x += -deltaX;
            if (x <= 0) {
                leftRight = true;
                updateDelta();
            }
        }
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