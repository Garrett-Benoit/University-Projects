package searchPackage;

import java.io.File;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

public class Search_Tree {
	
	private Hashtable<String, Node> tree = new Hashtable<String, Node>();
	
	public void createTree(String fileName) {
		loadFile(fileName);
		Set<String> keys = tree.keySet();
		System.out.println("-------------------------------------------");
        for (String key: keys) {
            System.out.println("Value of " + key + " is: " + tree.get(key).getEdges().toString());
        }
        System.out.println("-------------------------------------------");
	}
	
	public void runBreadthFirstSearch(String starting_node, String ending_node) {
		Breadth_First_Search BFS = new Breadth_First_Search();
		BFS.breadthFirstSearch(tree, starting_node, ending_node);
	}
	
	public void runGreedySearch(String starting_node, String ending_node) {
		Greedy_Search GS = new Greedy_Search();
		GS.greedySearch(tree, starting_node, ending_node);
	}
	
	private boolean loadFile(String fileName) {
		try {
			Scanner fileScanner = new Scanner(new File(fileName));
			
			while (fileScanner.hasNextLine()) {
				String[] parts = fileScanner.nextLine().split("\t", 0);
				String node_1 = parts[0];
				String node_2 = parts[1];
				double weight = Double.parseDouble(parts[2]);
				
				if (tree.containsKey(node_1)) {
					tree.get(node_1).setEdge(node_2, weight);
				} else {
					tree.put(node_1, new Node(node_1, generateEdge(node_2, weight)));
				}
			}
			
			fileScanner.close();
			System.out.println("\nFinished parsing file successfully");
			
		} catch(IOException ioE) {
			
			System.err.printf("IOException thrown: ", ioE);
		}
		
		return true;
	}
	
	private Hashtable<String, Double> generateEdge(String node, double weight) {
		Hashtable<String, Double> new_edge = new Hashtable<String, Double>();
		new_edge.put(node, weight);
		return new_edge;
	}
}
