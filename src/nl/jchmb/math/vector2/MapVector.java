package nl.jchmb.math.vector2;

import java.util.Map;

public class MapVector<T> implements Vector<T> {
	private Map<SpaceDimension, T> values;
	
	public MapVector(Map<SpaceDimension, T> values) {
		this.values = values;
	}
	
	@Override
	public Vector<T> add(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<T> subtract(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<T> scale(T multiplier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T contract(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T distance(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vector<T> negate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inRange(Vector<T> v, T range) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean contains(Vector<T> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T length() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public T get(SpaceDimension dimension) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean inRange(Vector<T> v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T angle(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}

}
