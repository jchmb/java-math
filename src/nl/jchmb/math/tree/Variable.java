package nl.jchmb.math.tree;

import java.util.Map;

public class Variable<K, T> extends Leaf<K, T> {
	private K identifier;
	
	public Variable(K identifier) {
		this.identifier = identifier;
	}
	
	@Override
	public T evaluate(Map<K, T> model) {
		if (!model.containsKey(identifier)) {
			return null;
		}
		return model.get(identifier);
	}

	@Override
	public Node<K, T> copy() {
		return new Variable<K, T>(identifier);
	}
	
	@Override
	public String toString() {
		return identifier.toString();
	}
}
