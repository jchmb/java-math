package nl.jchmb.math.tree;

import java.util.Map;

public class Connection<K, T> {
	private Node<K, T> node;
	
	public Connection(Node<K, T> node) {
		this.node = node;
	}
	
	public Node<K, T> getNode() {
		return node;
	}
	
	public void setNode(Node<K, T> node) {
		this.node = node;
	}
	
	public T evaluate(Map<K, T> model) {
		return node.evaluate(model);
	}
}
