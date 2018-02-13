package GUIFrame_Package;

import javax.swing.JDialog;
import javax.swing.JCheckBox;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class GUI_Dialog extends JDialog {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GUI_Dialog dialog = new GUI_Dialog();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GUI_Dialog() {
		setBounds(100, 100, 375, 350);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,
				FormSpecs.RELATED_GAP_COLSPEC,
				FormSpecs.DEFAULT_COLSPEC,},
			new RowSpec[] {
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,
				FormSpecs.RELATED_GAP_ROWSPEC,
				FormSpecs.DEFAULT_ROWSPEC,}));
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel, "6, 2, 1, 5");
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		panel.add(lblNewLabel_1, "8, 2, 1, 5");
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		panel.add(lblNewLabel_2, "10, 2, 1, 5");
		
		JComboBox comboBox = new JComboBox();
		panel.add(comboBox, "6, 8, 5, 1, fill, default");
		
		JCheckBox chckbxImage = new JCheckBox("Image");
		panel.add(chckbxImage, "6, 12");
		
		JCheckBox chckbxText = new JCheckBox("Text");
		panel.add(chckbxText, "8, 12");
		
		JCheckBox chckbxCode = new JCheckBox("Code");
		panel.add(chckbxCode, "10, 12");
		
		JRadioButton rdbtnSmall = new JRadioButton("Small");
		panel.add(rdbtnSmall, "6, 14");
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		panel.add(rdbtnMedium, "8, 14");
		
		JRadioButton rdbtnLarge = new JRadioButton("Large");
		panel.add(rdbtnLarge, "10, 14");
		
		JButton btnOk = new JButton("Ok");
		panel.add(btnOk, "6, 18");
		
		JButton btnCancel = new JButton("Cancel");
		panel.add(btnCancel, "10, 18");
	}

}
