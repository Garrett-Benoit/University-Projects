package lab_2_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

import lab_2_Package.Garage;

@SuppressWarnings("serial")
public class SceneComponent extends JComponent 
{

	public void paintComponent(Graphics g)
	{
		// Cast Graphics to Graphics2D
		Graphics2D g2 = (Graphics2D) g;
		
		// Create Scene
		Scene scene1 = new Scene(0,0);
		
		// Create Track
		Track track1 = new Track(70, 239);
		
		// Create Car1
		Car car1 = new Car(215, 224);
		
		// Create Car2
		Car car2 = new Car(285, 384);
		
		// Create Tree
		Tree tree1 = new Tree(445, 224);
		
		// Create Cloud1
		Cloud cloud1 = new Cloud(90, 70);
		
		// Create Cloud2
		Cloud cloud2 = new Cloud(325, 50);
		
		// Create Garage
		Garage garage1 = new Garage(155, 299);
		
		// Draw SceneView
		scene1.draw(g2);
		track1.draw(g2);
		car1.draw(g2);
		car2.draw(g2);
		tree1.draw(g2);
		cloud1.draw(g2);
		cloud2.draw(g2);
		garage1.draw(g2);
		
	}
	
}
