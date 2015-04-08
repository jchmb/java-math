package nl.jchmb.math.tree;

import java.util.List;
import java.util.Map;

public interface Node<K, T> {
	public T evaluate(Map<K, T> model);
	public List<Connection<K, T>> getChildren();
	public Node<K, T> copy();
}
