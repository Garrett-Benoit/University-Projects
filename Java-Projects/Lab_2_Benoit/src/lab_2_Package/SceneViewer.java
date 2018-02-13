package lab_2_Package;

import javax.swing.JFrame;
import lab_2_Package.SceneComponent;

public class SceneViewer {

	public static void main(String[] args) {

		// Create the frame
		JFrame frame = new JFrame("Scene");
		
		// Set size of frame
		frame.setSize(575, 600);
		
		// Set close on exit
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create PaintComponent as component
		SceneComponent component = new SceneComponent();
		
		// Add component PaintComponent to the frame
		frame.add(component);
		
		// Set frame to visible
		frame.setVisible(true);
	}

}
