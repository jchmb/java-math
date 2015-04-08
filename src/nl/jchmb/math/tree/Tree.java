package nl.jchmb.math.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Tree<T> {
	private Connection<String, T> root;
	
	public Tree(Node<String, T> root) {
		this.root = new Connection<String, T>(root);
	}
	
	public T evaluate(Map<String, T> model) {
		return root.evaluate(model);
	}
	
	public List<Connection<String, T>> getNodes() {
		List<Connection<String, T>> nodes = new ArrayList<Connection<String, T>>();
		Queue<Connection<String, T>> queue = new LinkedList<Connection<String, T>>();
		Connection<String, T> connection;
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			connection = queue.poll();
			nodes.add(connection);
			queue.addAll(connection.getNode().getChildren());
		}
		
		return nodes;
	}
	
	public Tree<T> copy() {
		return new Tree<T>(root.getNode().copy());
	}
	
	public int size() {
		return getNodes().size();
	}
	
	public String toString() {
		return root.getNode().toString();
	}
}
