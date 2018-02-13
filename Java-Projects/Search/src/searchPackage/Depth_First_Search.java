package searchPackage;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Set;

public class Depth_First_Search {
	private ArrayList<String> frontier = new ArrayList<String>();
	private ArrayList<String> explored = new ArrayList<String>();
	
	public boolean depthFirstSearch(Hashtable<String, Node> search_tree, String starting_node, String ending_node) {
		return expand(search_tree, starting_node, ending_node);
	}
	
	private boolean expand(Hashtable<String, Node> search_tree,String starting_node, String ending_node) {
		/*Node node = search_tree.get(starting_node);
		Hashtable<String, Double> edges = node.getEdges();
		Set<String> keys = edges.keySet();
		
		if (node.getEdges().containsKey(ending_node)) {
			// Node contains final node
			System.out.println("Found node " + ending_node + " weight " + node.getEdge(ending_node));
			return true;
		} else {
			for (String key: keys) {
				if (search_tree.get(key) != null) {
					System.out.println("Expanding node " + key);
					expand(search_tree, key, ending_node);
				} else {
					System.out.println("Fully expanded branch");
				}
			}
		}*/
		
		boolean node_found = false;
		String expand_node = starting_node;
		
		while (!node_found) {
			Node node = search_tree.get(expand_node);
			if (node.getEdges().containsKey(ending_node)) {
				// Node contains final node
				System.out.println("Found node " + ending_node + " weight " + node.getEdge(ending_node));
				return true;
			} else {
				
				Hashtable<String, Double> edges = node.getEdges();
				Set<String> keys = edges.keySet();
				
				for (String key: keys) {
					if (search_tree.get(key) != null) {
						System.out.println("Expanding node " + key);
						expand(search_tree, key, ending_node);
					} else {
						System.out.println("Fully expanded branch");
					}
				}
			}
		}
		
		
		/*for (String key: keys) {
			if (key.equals(ending_node)) {
				System.out.println("Found node " + key);
				break;
				//return true;
			} else {
				if (search_tree.get(key) != null) {
					System.out.println("Expanding node " + key);
					expand(search_tree, key, ending_node);
				} else {
					System.out.println("Fully expanded branch");
				}
			}
		}*/
		
		return true;
	}
	
	private void push(String node) {
		frontier.add(node);
	}
	
	private String pop() {
		int last = frontier.size();
		System.out.println("length of frontier: " + last);
		return frontier.get(last);
	}
}
