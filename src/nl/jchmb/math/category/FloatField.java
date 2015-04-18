package nl.jchmb.math.category;

public class FloatField implements Field<Float> {
	@Override
	public Float multiply(Float a, Float b) {
		return a * b;
	}

	@Override
	public Float getMultiplicativeIdentity() {
		return 1.0f;
	}

	@Override
	public Float negate(Float x) {
		return -x;
	}

	@Override
	public Float add(Float a, Float b) {
		return a + b;
	}

	@Override
	public Float subtract(Float a, Float b) {
		return a - b;
	}

	@Override
	public Float getAdditiveIdentity() {
		return 0.0f;
	}

	@Override
	public Float divide(Float a, Float b) {
		return a / b;
	}

	@Override
	public boolean greaterThan(Float a, Float b) {
		return a.floatValue() > b.floatValue();
	}

	@Override
	public boolean equals(Float a, Float b) {
		return a.equals(b);
	}

	@Override
	public boolean lessThan(Float a, Float b) {
		return a.floatValue() < b.floatValue();
	}
	
}
