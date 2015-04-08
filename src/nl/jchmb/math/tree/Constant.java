package nl.jchmb.math.tree;

import java.util.Map;

public class Constant<K, T> extends Leaf<K, T> {
	private T value;
	
	public Constant(T value) {
		this.value = value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public T evaluate(Map<K, T> model) {
		return value;
	}

	@Override
	public Node<K, T> copy() {
		return new Constant<K, T>(value);
	}
	
	@Override
	public String toString() {
		return value.toString();
	}
}
