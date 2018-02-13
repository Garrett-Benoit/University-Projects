/*		Programmer: Garrett Benoit
 * 		Date:		12/02/2015
 * 		CarsViewer.java
 */

package project_3_Cars;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import project_3_Cars.CarsLogic;
import project_3_Cars.CarFrame;

public class CarsViewer extends JPanel implements MouseListener
{
	// Declare variables
	protected List<CarsLogic> logic = new ArrayList<CarsLogic>(20);
    private CarFrame frame;
    private DrawCanvas canvas;
    private Boolean doubleClick = false;
    private final Integer waitTime = (Integer) Toolkit.getDefaultToolkit()
            .getDesktopProperty("awt.multiClickInterval");
    private static int canvasWidth = 500;
    private static int canvasHeight = 500;
    public static final int UPDATE_RATE = 30;
    int count = 0;
    private int maxCars = 20;
    private int maxCarsCounter =0;

    public static void main(String[] args)
	{
		// Create frame
		JFrame frame = new JFrame("Project 3");
		
		// Default close operation
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set height and width
        frame.setContentPane(new CarsViewer(canvasHeight, canvasWidth));
        frame.pack();
        frame.setVisible(true);
	}
    
    public static int random(int maxRange)
    {
        return (int) Math.round((Math.random() * maxRange));
    }

    public CarsViewer(int width, int height)
    {
        canvasWidth = width;
        canvasHeight = height;
        frame = new CarFrame();
        canvas = new DrawCanvas();
        this.setLayout(new BorderLayout());
        this.add(canvas, BorderLayout.CENTER);
        this.addMouseListener(this);

        start();

    }

    public void start()
    {

        Thread t = new Thread()
        {

            public void run()
            {

                while (true)
                {

                	for (CarsLogic car : logic)
                    {
                        car.move(frame);
                    }
                	
                    repaint();
                    
                    try
                    {
                        Thread.sleep(1000 / UPDATE_RATE);
                    }
                    catch (InterruptedException e)
                    {
                    	// Handle thread error
                    	System.err.println(e);
                    }
                }
            }
        };
        
        t.start();
        
    }

    class DrawCanvas extends JPanel
    {
        public void paintComponent(Graphics g)
        {
        	// Cast Graphics to Graphics2D
    		Graphics2D g2 = (Graphics2D) g;
            
    		// Draw CarFrame
            frame.draw(g2);
            
            // Draw car for each CarsLogic execution
            for (CarsLogic car : logic)
            {
                car.draw(g2);
            }
        }

        public Dimension getPreferredSize()
        {
            return (new Dimension(canvasWidth, canvasHeight));
        }
    }

	@Override
    public void mousePressed(MouseEvent e)
	{
    	
    	final int x = e.getX();
    	final int y = e.getY();
    	
    	if (maxCarsCounter < maxCars)
    	{
	        if (e.getClickCount() >= 2)
	        {
	            doubleClick = true;
	            
	            logic.add(new CarsLogic(e.getX(), e.getY(), canvasWidth, canvasHeight));
	        }
	        else
	        {
	            Timer timer = new Timer(waitTime, new ActionListener()
	            {
	
	                public void actionPerformed(ActionEvent e)
	                {
	                	// if statement checking for double click
	                    if (doubleClick)
	                    {
	                        doubleClick = false;
	                    }
	                    else
	                    {
	                        count++;
	                        logic.add(new CarsLogic(x, y, canvasWidth, canvasHeight));
	                    }
	                }
	            });
	            
	            timer.setRepeats(false);
	            timer.start();
	            
	        }
	        
	        maxCarsCounter++;
	        
    	}
    	else
    	{
    		// Display max cars reached
    		JOptionPane.showMessageDialog(canvas, "Max number of cars reached!", "Error", JOptionPane.WARNING_MESSAGE);
    	}
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
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
