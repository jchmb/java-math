package nl.jchmb.math.tree;

import java.util.ArrayList;
import java.util.List;

public abstract class Leaf<K, T> implements Node<K, T> {
	@Override
	public List<Connection<K, T>> getChildren() {
		return new ArrayList<Connection<K, T>>();
	}
}
