package nl.jchmb.math.function;

public class IdentityFunction<X> implements Function<X, X> {
	public X map(X x) {
		return x;
	}
}
