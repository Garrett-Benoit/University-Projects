/*	Coder:		Garrett Benoit
 * 	Project:	Lab 1 Encryption Program
 * 	Instructor:	Kay Kussmann
 * 	Due Date:	10/01/2015
 * 	Program:	This program accepts 4 integer values, encrypts the input, and
 * 				displays the encrypted, decrypted, and original numbers and
 * 				displays a counter for number of times executed.
 */

package Encryption_Package;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class EncryptionViewer extends JComponent{

	// Declare variables
	private int [] digits;
	
	// Constructor
	public EncryptionViewer(int [] a)
	{
		// Assign passed in array to digits Array
		digits = a;
	}
	
	public void paintComponent(Graphics g)
	{
		// Cast Graphics g into Graphics2D g2
		Graphics2D g2 = (Graphics2D) g;
		
		// Create EncryptionLogic class
		EncryptionLogic encryptionOutput = new EncryptionLogic(digits);
		
		// Draw EncryptionLogic calculation
		encryptionOutput.draw(g2);
				
	}
}
