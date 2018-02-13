/*	Coder:		Garrett Benoit
 * 	Project:	Lab 1 Encryption Program
 * 	Instructor:	Kay Kussmann
 * 	Due Date:	10/01/2015
 * 	Program:	This program accepts 4 integer values, encrypts the input, and
 * 				displays the encrypted, decrypted, and original numbers and
 * 				displays a counter for number of times executed.
 */

package Encryption_Package;

import java.awt.Graphics2D;
import java.util.Arrays;

public class EncryptionLogic {

	// Declare variables
	private int [] digits;
	static int counter = 0;
	
	// Constructor
	public EncryptionLogic(int [] a)
	{
		
		// Assign passed in array to digits array
		digits = a;
		
	}
	
	// Logic for encryption
	public void draw(Graphics2D g2)
	{
		// Draw original number
		g2.drawString("Original input: " + Arrays.toString(digits), 25, 25);
		
		// For loop
		for(int i = 0; i < 4; i++)
		{	
			// Add 7 to current integer at array index
			digits[i] += 7;
			
			// Mod by 10 to current integer at array index
			digits[i] %= 10;
		}
		
		// Create placeholder variable for swapping digits
		int placeholderDigit;
		
		// Store 1st digit into placeholder
		placeholderDigit = digits[0];
		// Assign digit 3 into digit 1
		digits[0] = digits[2];
		// Assign digit 1 into digit 3
		digits[2] = placeholderDigit;
		// Store 2nd digit into placeholder
		placeholderDigit = digits[1];
		// Assign digit 4 into digit 2
		digits[1] = digits[3];
		// Assign digit 2 into digit 4
		digits[3] = placeholderDigit;
		
		// Draw encrypted number
		g2.drawString("Number encrypted: " + Arrays.toString(digits), 25, 100);
		
		// Store 1st digit into placeholder
		placeholderDigit = digits[0];
		// Assign digit 3 into digit 1
		digits[0] = digits[2];
		// Assign digit 1 into digit 3
		digits[2] = placeholderDigit;
		// Store 2nd digit into placeholder
		placeholderDigit = digits[1];
		// Assign digit 4 into digit 2
		digits[1] = digits[3];
		// Assign digit 2 into digit 4
		digits[3] = placeholderDigit;
				
		// For loop
		for(int i = 0; i < 4; i++)
		{
			// Add 3 to current integer at array index
			digits[i] += 3;
					
			// Mod by 10 to current integer at array index
			digits[i] %= 10;	
		}
		
		// Draw decrypted number
		g2.drawString("Number decrypted: " + Arrays.toString(digits), 25, 175);
		
		// Draw counter
		g2.drawString("This operation has performed: " + counter, 25, 250);
	}
	
}
