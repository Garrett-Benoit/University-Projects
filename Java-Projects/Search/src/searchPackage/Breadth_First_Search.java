package searchPackage;

import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Breadth_First_Search {
	
	private Hashtable<String, Node> search_tree = new Hashtable<String, Node>();
	private boolean value_found = false;
	private double cost_so_far = 0.0;

	public boolean breadthFirstSearch(Hashtable<String, Node> search_tree, String starting_node, String ending_node) {
		this.search_tree = search_tree;
		expand(starting_node, ending_node);
		return true;
	}
	
	private void expand(String starting_node, String ending_node) {
		Node node = search_tree.get(starting_node);
		Hashtable<String, Double> edges = node.getEdges();
		Set<String> keys = edges.keySet();
		
		if (!value_found) {
			if (node.getEdges().containsKey(ending_node)) {
				System.out.println("-------------------------------------------");
				System.out.println("\n*******************************************");
				System.out.println("Goal state reached");
				System.out.println("Found node " + ending_node + " from node " + node.getName() + " with weight " + node.getEdge(ending_node));
				cost_so_far += node.getEdge(ending_node);
				System.out.println("Total cost: " + cost_so_far);
				System.out.println("*******************************************");
				value_found = true;
			} else if (node.visited) {
				System.out.println("already expanded this node");
			} else {
				for (String key: keys) {
					if (!value_found) {
						if ((search_tree.get(key) != null) && (!search_tree.get(key).visited)) {
							System.out.println("-------------------------------------------");
							System.out.println("Expanding node " + key + " from node " + node.getName());
							double expanded_node_weight = node.getEdge(key);
							System.out.println("Expanded node weight: " + expanded_node_weight);
							cost_so_far += expanded_node_weight;
							System.out.println("Current total cost: " + cost_so_far);
							node.visited = true;
							expand(key, ending_node);
						} else {
							System.out.println("Fully explored node " + node.getName());
						}
					}
				}
			}
		}
		
		/*Node node = search_tree.get(starting_node);
		queue.add(node);
		node.visited = true;
		
		
		
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
		}*/
		
		
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
	}
}
