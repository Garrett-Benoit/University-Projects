/*	Coder:		Garrett Benoit
 * 	Project:	Lab 1 Encryption Program
 * 	Instructor:	Kay Kussmann
 * 	Due Date:	
 * 	Program:	This program accepts 4 integer values, encrypts the input, and
 * 				displays the encrypted, decrypted, and original numbers and
 * 				displays a counter for number of times executed.
 */

package Encryption_Package;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EncryptionTester {

	public static void main(String[] args) {
		
		// Create variables
		int [] inputArray = {0, 0, 0, 0};
		String input = "0";
		
		// Create JFrame called frame
		JFrame frame = new JFrame();
		
		// Set size of frame
		frame.setSize(250,300);
		
		while(input != null)
		{			
			for(int i = 0; i<4; i++)
			{
			
				// Prompt user for four integer values to encrypt
				input = JOptionPane.showInputDialog("Please enter four individual integer values to encrypt: \nPress enter without an input to terminate.");
			
				if (input != null)
				{			
					// Store current input integer into inputArray index
					inputArray[i] = Integer.parseInt(input);
				}
				else
				{
					// Exit application if no input is entered
					System.exit(0);
				}
				
			}

				// Increment counter
				EncryptionLogic.counter += 1;
			
				// Create EncryptionViewer class
				EncryptionViewer encryptionOperation = new EncryptionViewer(inputArray);
	
				// Add EncryptionViewer class to frame
				frame.add(encryptionOperation);
						
				// Set frame to exit on close
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						
				// Set frame to visible
				frame.setVisible(true);
		}
		
	}

}
