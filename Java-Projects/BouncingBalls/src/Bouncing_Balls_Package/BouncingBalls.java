package Bouncing_Balls_Package;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BouncingBalls extends JPanel implements MouseListener {

    protected List<RandomBall> randomBalls = new ArrayList<RandomBall>(20);
    protected List<VerticalBall> verticalBalls = new ArrayList<VerticalBall>(20);
    private Container container;
    private DrawCanvas canvas;
    private Boolean doubleClick = false;
    private final Integer waitTime = (Integer) Toolkit.getDefaultToolkit()
            .getDesktopProperty("awt.multiClickInterval");
    private static int canvasWidth = 500;
    private static int canvasHeight = 500;
    public static final int UPDATE_RATE = 30;
    int count = 0;

    public static int random(int maxRange) {
        return (int) Math.round((Math.random() * maxRange));
    }

    public BouncingBalls(int width, int height) {
        canvasWidth = width;
        canvasHeight = height;

        container = new Container();

        canvas = new DrawCanvas();
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        this.addMouseListener(this);

        start();

    }

    public void start() {

        Thread t = new Thread() {

            public void run() {

                while (true) {

                    update();
                    repaint();
                    try {
                        Thread.sleep(1000 / UPDATE_RATE);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        t.start();
    }

    public void update() {

        for (RandomBall ball : randomBalls) {
            ball.ballBounce(container);

        }
        for (VerticalBall ball : verticalBalls) {
            ball.verticalBounce(container);

        }
    }

    class DrawCanvas extends JPanel {

        public void paintComponent(Graphics g) {

            super.paintComponent(g);
            container.draw(g);
            for (RandomBall ball : randomBalls) {
                ball.draw(g);
            }
            for (VerticalBall ball : verticalBalls) {
                ball.draw(g);
            }
        }

        public Dimension getPreferredSize() {

            return (new Dimension(canvasWidth, canvasHeight));
        }
    }

    public static void main(String[] args) {

        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run()
            {
                JFrame f = new JFrame("Stack Answer 2");
                f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
                f.setContentPane(new BouncingBalls(canvasHeight, canvasWidth));
                f.pack();
                f.setVisible(true);
            }
        });
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent e) {
    	
    	final int x = e.getX();
    	final int y = e.getY();
    	
        if (e.getClickCount() >= 2) {
            doubleClick = true;
             verticalBalls.add(new VerticalBall(e.getX(), e.getY(), canvasWidth, canvasHeight));
            System.out.println("double click");
        } else {
            Timer timer = new Timer(waitTime, new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    if (doubleClick) {

                        /* we are the first click of a double click */
                        doubleClick = false;
                    } else {
                        count++;
                        randomBalls.add(new RandomBall(x, y, canvasWidth, canvasHeight));
                        /* the second click never happened */
                        System.out.println("single click");
                    }
                }
            });
            timer.setRepeats(false);
            timer.start();
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }
}