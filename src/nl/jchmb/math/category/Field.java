package nl.jchmb.math.category;

public interface Field<T> extends Ring<T> {
	public T divide(T a, T b);
}
