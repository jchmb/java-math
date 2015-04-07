package nl.jchmb.math.tree;

import nl.jchmb.math.function.Function;

public class UnaryOperator<T> implements Node<T> {
	private Node<T> child;
	private Function<T, T> f;
	
	public UnaryOperator(Function<T, T> f, Node<T> child) {
		this.child = child;
	}
	
	@Override
	public T evaluate() {
		return f.map(child.evaluate());
	}

}
