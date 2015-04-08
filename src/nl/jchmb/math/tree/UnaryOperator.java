package nl.jchmb.math.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import nl.jchmb.math.function.Function;

public class UnaryOperator<K, T> implements Node<K, T> {
	private Connection<K, T> child;
	private Function<T, T> f;
	
	public UnaryOperator(Function<T, T> f, Node<K, T> child) {
		this.child = new Connection<K, T>(child);
	}
	
	@Override
	public T evaluate(Map<K, T> model) {
		return f.map(child.evaluate(model));
	}

	@Override
	public List<Connection<K, T>> getChildren() {
		List<Connection<K, T>> children = new ArrayList<Connection<K, T>>(1);
		children.add(child);
		return children;
	}

	@Override
	public Node<K, T> copy() {
		return new UnaryOperator<K, T>(f, child.getNode().copy());
	}
}
