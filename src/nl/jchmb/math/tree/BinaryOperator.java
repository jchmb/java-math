package nl.jchmb.math.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nl.jchmb.generic.tuple.Pair;
import nl.jchmb.math.function.BinaryFunction;

public class BinaryOperator<K, T> implements Node<K, T> {
	private Connection<K, T> n1, n2;
	private BinaryFunction<T, T, T> f;
	
	public BinaryOperator(BinaryFunction<T, T, T> f, Node<K, T> n1, Node<K, T> n2) {
		this.f = f;
		this.n1 = new Connection<K, T>(n1);
		this.n2 = new Connection<K, T>(n2);
	}
	
	public T evaluate(Map<K, T> model) {
		return f.map(new Pair<T, T>(n1.evaluate(model), n2.evaluate(model)));
	}
	
	public void setLeftChild(Node<K, T> child) {
		n1 = new Connection<K, T>(child);
	}
	
	public void setRightChild(Node<K, T> child) {
		n2 = new Connection<K, T>(child);
	}

	@Override
	public List<Connection<K, T>> getChildren() {
		List<Connection<K, T>> children = new ArrayList<Connection<K, T>>(2);
		children.add(n1);
		children.add(n2);
		return children;
	}
	
	@Override
	public String toString() {
		return "(" + n1.getNode().toString() + " " + f.toString() + " " + n2.getNode().toString() + ")";
	}
	
	protected Connection<K, T> getLeftConnection() {
		return n1;
	}
	
	protected Connection<K, T> getRightConnection() {
		return n2;
	}
	
	@Override
	public Node<K, T> copy() {
		return new BinaryOperator<K, T>(
				f,
				n1.getNode().copy(),
				n2.getNode().copy()
		);
	}
}
