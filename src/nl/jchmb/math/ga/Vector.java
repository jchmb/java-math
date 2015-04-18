package nl.jchmb.math.ga;

public interface Vector<T extends Number> {
	public Vector<T> add(Vector<T> v);
	public Vector<T> subtract(Vector<T> v);
	public Vector<T> multiply(T multiplier);
	public Vector<T> divide(T divider);
	public Vector<T> negate();
	public T length();
	public T contract(Vector<T> v);
	public T get(SpaceDimension dimension);
}
