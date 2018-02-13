package searchPackage;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Greedy_Search {

	private Hashtable<String, Node> tree = new Hashtable<String, Node>();
	private ArrayList<Node> frontier = new ArrayList<Node>();
	private ArrayList<Node> explored = new ArrayList<Node>();
	
	public void greedySearch(Hashtable<String, Node> search_tree, String starting_node, String ending_node) {
		this.tree = search_tree;
		this.push(tree.get(starting_node));
		this.search(ending_node);
	}
	
	private void search(String ending_node) {
		boolean goal_state_reached = false;
		
		while (!frontier.isEmpty() && !goal_state_reached) {
			Node frontier_node = pop();
			
			if (frontier_node.getName() == ending_node) {
				System.out.println("Found node " + frontier_node.getName() + " with weight " + frontier_node.getEdge(ending_node));
				System.out.println("Goal state reached");
				goal_state_reached = true;
			} else {
				Map<String,Double> weights = new HashMap<String,Double>();
				// expand frontier node adding all edges to frontier by weight values
				Hashtable<String,Double> edges = frontier_node.getEdges();
				Set<String> keys = edges.keySet();
		        for (String key: keys) {
		        		double edge_weight = edges.get(key);
		            System.out.println("Weight of " + key + " is: " + edge_weight);
		            if (!weights.containsKey(key)) {
		            		System.out.println("Adding new weight");
		            		weights.put(key, edge_weight);
		            } else if (weights.get(key) > edge_weight) {
		            		System.out.println("Weight for key " + key + " is greater than second weight of " + edge_weight);
		            } else {
		            		System.out.println("Replacing old weight " + weights.get(key) + " for key " + key + " with new weight " + edge_weight);
		            		weights.put(key, edge_weight);
		            }
		        }
		        
		        System.out.println("Finished iterating through keys");
		        System.out.println(weights.toString());
		        
		        System.out.println("Sorting weights by value");
		        ArrayList<String> sorted_weights = sort(weights);
		        System.out.println("sorted weights to string " + sorted_weights.toString());
		        
		        goal_state_reached = true;
			}
		}
	}
	
	private void push(Node node) {
		frontier.add(node);
	}
	
	private Node pop() {
		int last = frontier.size();
		System.out.println("length of frontier: " + last);
		return frontier.get(last - 1);
	}
	
	private ArrayList<String> sort(Map<String, Double> map) {
		ArrayList<String> result = new ArrayList<String>();
		List<Double> weights = new ArrayList<>(map.values());
		Set<String> keys = map.keySet();
		
		Collections.sort(weights);
		
		System.out.println("sorted weight values: " + weights.toString());
		
		for (Double weight : weights) {
			for (String key : keys) {
				if (map.get(key) == weight && !result.contains(key)) {
					System.out.println("Sorted order: " + key);
					result.add(key);
				}
			}
		}
        
        return result;
    }
}
