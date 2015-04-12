package nl.jchmb.math.shape;

import java.util.ArrayList;

import nl.jchmb.math.vector.Vector;

public class Circle<T extends Number> implements Shape<T> {
	private Vector<T> origin;
	private T range;
	
	public Circle(Vector<T> origin, T range) {
		this.origin = origin;
		this.range = range;
	}
	
	@Override
	public boolean contains(Vector<T> p) {
		return origin.inRange(p, range);
	}
	
	public T getRange() {
		return range;
	}

	@Override
	public Iterable<Vector<T>> getPointIterator() {
		ArrayList<Vector<T>> points = new ArrayList<Vector<T>>();
		points.add(origin);
		return points;
	}

}
