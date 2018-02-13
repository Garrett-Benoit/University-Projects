package searchPackage;

import java.awt.List;
import java.util.Hashtable;

public class Node {
	private String name;
	private Hashtable<String,Double> edges;
	boolean visited = false;
	
	public Node(String name, Hashtable<String,Double> edges) {
		this.name = name;
		this.edges = edges;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Double getEdge(String name) {
		return this.edges.get(name);
	}
	
	public String getFirstEdge() {
		return this.edges.entrySet().iterator().next().getKey();
	}
	
	public Hashtable<String,Double> getEdges() {
		return this.edges;
	}
	
	public void setEdge(String name, Double distance) {
		this.edges.put(name, distance);
	}
	
	public List getEdgeNames(String name) {
		return (List) this.edges.keys();
	}
	
	/*public String toString() {
		String info = edges.toString()+"\n";
		return info;
	}*/
}