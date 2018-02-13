/*		Programmer:		Garrett Benoit
 * 		Project:		string_Viewer1
 * 		Instructor:		Kaye Kussmann
 * 		Description:	string_Viewer1.java opens read_String1.java and attempts to
 * 						open, read, print, and close the file.
 */

import java.io.IOException;

	public class string_Viewer1
	{

		public static void main(String[] args) {

			// Add user filename
			read_String1 rs = new read_String1();

			try {
				rs.openFile();
				rs.readFile();
				rs.printList();
				rs.closeFile();
			} catch (IOException ioE) {
				System.err.println("Read error: Terminating");
				System.exit(1);
			}

		}

	}