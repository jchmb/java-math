package nl.jchmb.math.shape;

import nl.jchmb.math.vector.Vector;

public class Rectangle<T extends Number> implements Shape<T> {
	private Vector<T> v1, v2;
	
	public Rectangle(Vector<T> v1, Vector<T> v2) {
		this.v1 = v1;
		this.v2 = v2;
	}
	
	@Override
	public boolean contains(Vector<T> p) {
		Vector<T> container = v2.subtract(v1);
		Vector<T> newPoint = p.subtract(v1);
		return container.contains(newPoint);
	}

}
