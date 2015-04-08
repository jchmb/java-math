package nl.jchmb.math.shape;

import nl.jchmb.math.vector.Vector;

public interface Shape<T extends Number> {
	public boolean contains(Vector<T> p);
}
