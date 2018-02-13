package font_Frame_Package;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Font_Frame extends JFrame
{

	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	
	private JLabel name;
	private String facename;
	private int fontStyle;
	private int fontSize;
	
	public Font_Frame()
	{
		super("Font Viewer");
		
		// Construct the label
		name = new JLabel("Java");
		
		// Add name label to frame
		add(name, BorderLayout.CENTER);
		
		// Construct menu
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		menuBar.add(createFileMenu());
		menuBar.add(createFontMenu());
		
		facename = "Serif";
		fontSize = 24;
		fontStyle = Font.PLAIN;
		
		setLabelFont();
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		
	}

	class ExitItemListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			System.exit(0);
		}
	}
	
	public JMenu createFileMenu()
	{
		JMenu menu = new JMenu("File");
		
		JMenuItem exitItem = new JMenuItem("Exit");
		
		ActionListener listener = new ExitItemListener();
		
		exitItem.addActionListener(listener);
		
		menu.add(exitItem);
		
		return menu;
	}
	
	public JMenu createFontMenu()
	{
		JMenu menu = new JMenu("Font");
		
		menu.add(createFaceMenu());
		
		menu.add(createSizeMenu());
		
		menu.add(createStyleMenu());
		
		return menu;
	}
	
	public JMenu createFaceMenu()
	{
		JMenu menu = new JMenu("Face");
		menu.add(createFaceItem("Serif"));
		menu.add(createFaceItem("SansSerif"));
		menu.add(createFaceItem("Monospaced"));
		
		return menu;
	}
	
	public JMenu createSizeMenu()
	{
		JMenu menu = new JMenu("Size");
		menu.add(createSizeItem("Smaller", -1));
		menu.add(createSizeItem("Larger", +1));
		
		return menu;
	}
	
	public JMenu createStyleMenu()
	{
		JMenu menu = new JMenu("Style");
		menu.add(createStyleItem("Plain", Font.PLAIN));
		menu.add(createStyleItem("Bold", Font.BOLD));
		menu.add(createStyleItem("Italic", Font.ITALIC));
		menu.add(createStyleItem("Bold Italic", Font.BOLD + Font.ITALIC));
		
		return menu;
	}
	
	public JMenuItem createFaceItem(final String name)
	{
		class FaceItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				facename = name;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		
		ActionListener listener = new FaceItemListener();
		
		item.addActionListener(listener);
		
		return item;
	}
	
	public JMenuItem createSizeItem(String name, final int increment)
	{
		class SizeItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				fontSize += increment;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		
		ActionListener listener = new SizeItemListener();
		
		item.addActionListener(listener);
		
		return item;
	}
	
	public JMenuItem createStyleItem(String name, final int style)
	{
		class StyleItemListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				fontStyle = style;
				setLabelFont();
			}
		}
		
		JMenuItem item = new JMenuItem(name);
		ActionListener listener = new StyleItemListener();
		item.addActionListener(listener);
		
		return item;
	}
	
	public void setLabelFont()
	{
		Font f = new Font(facename, fontStyle, fontSize);
		name.setFont(f);
	}
	
}
