package nl.jchmb.math.vector;

public interface Vector<T extends Number> {
	public Vector<T> add(Vector<T> v);
	public Vector<T> subtract(Vector<T> v);
	public Vector<T> scale(T multiplier);
	public T contract(Vector<T> v);
	public T distance(Vector<T> v);
	public Vector<T> negate();
	public boolean inRange(Vector<T> v, T range);
	public T length();
	public T get(int offset);
	public T[] getArray();
	public int size();
}
