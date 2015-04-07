package nl.jchmb.math.tree;

import nl.jchmb.generic.tuple.Pair;
import nl.jchmb.math.function.BinaryFunction;

public class BinaryOperator<T> implements Node<T> {
	private Node<T> n1, n2;
	private BinaryFunction<T, T, T> f;
	
	public BinaryOperator(BinaryFunction<T, T, T> f, Node<T> n1, Node<T> n2) {
		this.f = f;
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public T evaluate() {
		return f.map(new Pair<T, T>(n1.evaluate(), n2.evaluate()));
	}
}
