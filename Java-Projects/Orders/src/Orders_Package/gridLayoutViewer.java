package Orders_Package;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class gridLayoutViewer extends JFrame
{

	public gridLayoutViewer()
	{
		super.setSize(400,400);
	}
	
	JPanel gridLayout = new JPanel();
	gridLayout.setLayout(new GridLayout(2, 1, 50, 100));
	
}
