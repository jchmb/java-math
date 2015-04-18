package nl.jchmb.math.vector2;

public interface Vector<T> {
	public Vector<T> add(Vector<T> v);
	public Vector<T> subtract(Vector<T> v);
	public Vector<T> scale(T multiplier);
	public T contract(Vector<T> v);
	public T distance(Vector<T> v);
	public Vector<T> negate();
	public boolean inRange(Vector<T> v, T range);
	public boolean contains(Vector<T> v);
	public T length();
	public int size();
	public T get(SpaceDimension dimension);
	public boolean inRange(Vector<T> v);
	public T angle(Vector<T> v);
}
