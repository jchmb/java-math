package nl.jchmb.math.category;

public interface Group<T> {
	public T add(T a, T b);
	public T subtract(T a, T b);
	public T getAdditiveIdentity();
	public boolean greaterThan(T a, T b);
	public boolean equals(T a, T b);
	public boolean lessThan(T a, T b);
}
