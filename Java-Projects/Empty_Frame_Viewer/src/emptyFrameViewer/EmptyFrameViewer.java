package emptyFrameViewer;

// Import JFrame class
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EmptyFrameViewer {

	public static void main(String[] args) {
		
		// Message Dialog Box
		String name = JOptionPane.showInputDialog("What is your name?");
		
		// Create JLabel class
		JLabel northLabel = new JLabel("North");
		JLabel southLabel = new JLabel("South");
		JLabel eastLabel = new JLabel("East");
		JLabel westLabel = new JLabel("West");
		JLabel centerLabel = new JLabel("Center");
		
		// Initialize a new JFrame variable.
		JFrame frame = new JFrame();
		
		// Set size value for frame JFrame.
		frame.setSize(300, 400);
		
		// Set title value for frame JFrame.
		frame.setTitle("An Empty Frame");
		
		// Set frame JFrame to close the frame on exit.
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create RectangleComponent class
		RectangleComponent component = new RectangleComponent();
		
		// Add component class to frame JFrame.
		frame.add(component);
		
		// Add northLabel class to frame JFrame.
		frame.add(northLabel, BorderLayout.NORTH);
		frame.add(southLabel, BorderLayout.SOUTH);
		frame.add(eastLabel, BorderLayout.EAST);
		frame.add(westLabel, BorderLayout.WEST);
		// frame.add(centerLabel, BorderLayout.CENTER);
		
		// Set frame JFrame to visible.
		frame.setVisible(true);
		String message = String.format("Welcome, %s, to Rectangle World!", name);
		JOptionPane.showMessageDialog(null, message);
		
	}

}
