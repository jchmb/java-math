package nl.jchmb.math.vector2;

public interface LinearTransformation<T> {
	public Vector<T> transform(Vector<T> v);
}
