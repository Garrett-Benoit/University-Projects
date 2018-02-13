/*		Programmer:		Garrett Benoit
 * 		Project:		read_String1
 * 		Instructor:		Kaye Kussmann
 * 		Description:	read_String1.java opens file stream, reads file, splits
 * 						words with " " space and outputs to console
 */

	import java.io.File;
	import java.io.IOException;
	import java.util.Formatter;
	import java.util.NoSuchElementException;
	import java.util.Scanner;

	public class read_String1
	{

		private static Formatter output;
		private static Scanner input;
		private String[] bookList;

		public void openFile() throws IOException // Open file and handle error
													// catching
		{
			input = new Scanner(new File("in.txt"));
		}

		public void readFile() {
			bookList = new String[100];

			String sentence = new String();
			try {
				while (input.hasNext()) {
					sentence += input.nextLine();
				}

				bookList = sentence.split(" ");

			} catch (NoSuchElementException elementException) {
				System.err.println("File improperly formed: Terminating");
			} catch (IllegalStateException stateException) {
				System.err.println("Error during file read: Terminating");
			}

		}

		public void closeFile() {
			if (input != null) {
				input.close();
			}
		}

		public void printList()
		{
			for(String book: bookList)
			{
				System.out.println(book);
			}
		}
	}
