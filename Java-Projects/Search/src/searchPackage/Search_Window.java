package searchPackage;

import java.util.Scanner;

public class Search_Window {
	
	double heuristic[][];
	String nodeName;
	
	public Search_Window() {
		Scanner reader = new Scanner(System.in);
		boolean menu_item_selected = false;
		boolean file_is_chosen = false;
		int menu_item = 0;
		String file_name = "";
		String starting_node = "";
		String ending_node = "";
		
		System.out.println("\nWelcome to Search!");
		System.out.println("-------------------------------------------");
		
		while (!file_is_chosen) {
			System.out.println("Enter the file you would like to perform a search on (ex. distances.tsv): ");
			file_name = reader.next();
			
			if (file_name != "") {
				file_is_chosen = true;
			}
		}
		
		while (starting_node == "") {
			System.out.println("\nEnter the starting node (ex. A): ");
			starting_node = reader.next().toUpperCase();
		}
		
		while (ending_node == "") {
			System.out.println("Enter the ending node (ex. E): ");
			ending_node = reader.next().toUpperCase();
		}
		
		System.out.println("\nChoose which type of search you would like to perform:");
		System.out.println("1.) Breadth First Search");
		System.out.println("2.) Greedy Search (Unfinished implementation)");
		
		while (!menu_item_selected) {
			System.out.println("\nTo select a search, enter it's menu number: ");
			menu_item = reader.nextInt();
			
			if ((menu_item > 0) && (menu_item < 3)) {
				menu_item_selected = true;
				reader.close();
			}
		}
		
		Search_Tree tree = new Search_Tree();
		tree.createTree(file_name);
		
		System.out.println("\n");
		
		if (menu_item == 1) {
			System.out.println("Executing Breadth First Search");
			tree.runBreadthFirstSearch(starting_node, ending_node);
		} else if (menu_item == 2) {
			System.out.println("Executing Greedy Search");
			tree.runGreedySearch(starting_node, ending_node);
		} else {
			System.out.println("Incorrect search selected");
		}
	}

	public static void main(String[] args) {
		Search_Window searchWindow = new Search_Window();
	}
}
