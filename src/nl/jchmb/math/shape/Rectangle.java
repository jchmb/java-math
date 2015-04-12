package nl.jchmb.math.shape;

import java.util.ArrayList;

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

	@Override
	public Iterable<Vector<T>> getPointIterator() {
		ArrayList<Vector<T>> vectors = new ArrayList<Vector<T>>();
		vectors.add(v1);
		vectors.add(v2);
		return vectors;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(v1.toString());
		builder.append(" ^ ");
		builder.append(v2.toString());
		return builder.toString();
	}
}
