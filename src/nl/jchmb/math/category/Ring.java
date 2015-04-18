package nl.jchmb.math.category;

public interface Ring<T> extends Group<T> {
	public T multiply(T a, T b);
	public T getMultiplicativeIdentity();
	public T negate(T x);
}
