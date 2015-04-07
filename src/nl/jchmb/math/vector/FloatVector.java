package nl.jchmb.math.vector;

public class FloatVector extends BaseVector<Float> {
	private final Float[] values;
	
	public FloatVector(Float[] values) {
		this.values = values;
	}
	
	public FloatVector(float[] values) {
		this.values = new Float[values.length];
		for (int i = 0; i < values.length; i++) {
			this.values[i] = values[i];
		}
	}
	
	@Override
	public Vector<Float> add(Vector<Float> v) {
		Float[] newValues = new Float[values.length];
		for (int i = 0; i < newValues.length; i++) {
			newValues[i] = values[i] + v.get(i);
		}
		return new FloatVector(newValues);
	}

	@Override
	public Vector<Float> scale(Float multiplier) {
		Float[] newValues = new Float[values.length];
		for (int i = 0; i < newValues.length; i++) {
			newValues[i] = multiplier * values[i];
		}
		return new FloatVector(newValues);
	}

	@Override
	public Float contract(Vector<Float> v) {
		Float contraction = 0.0f;
		for (int i = 0; i < values.length; i++) {
			contraction += values[i] * v.get(i);
		}
		return contraction;
	}

	@Override
	public Float length() {
		return (float) Math.sqrt(contract(this));
	}

	@Override
	public Float[] getArray() {
		return values;
	}

	public static final FloatVector getNullVector(int dim) {
		return new FloatVector(new float[dim]);
	}

	@Override
	public Float get(int offset) {
		return values[offset];
	}

	@Override
	public int size() {
		return values.length;
	}

	@Override
	public Float distance(Vector<Float> v) {
		return subtract(v).length();
	}

	@Override
	public Vector<Float> negate() {
		return scale(-1.0f);
	}

	@Override
	public Vector<Float> subtract(Vector<Float> v) {
		return add(v.negate());
	}

	@Override
	public boolean inRange(Vector<Float> v, Float range) {
		return distance(v) <= range;
	}
}
