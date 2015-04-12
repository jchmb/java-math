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
			newValues[i] = values[i].floatValue() + v.get(i).floatValue();
		}
		return new FloatVector(newValues);
	}

	@Override
	public Vector<Float> scale(Float multiplier) {
		Float[] newValues = new Float[values.length];
		for (int i = 0; i < newValues.length; i++) {
			newValues[i] = multiplier.floatValue() * values[i].floatValue();
		}
		return new FloatVector(newValues);
	}

	@Override
	public Float contract(Vector<Float> v) {
		Float contraction = 0.0f;
		for (int i = 0; i < values.length; i++) {
			contraction += values[i].floatValue() * v.get(i).floatValue();
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
		return distance(v).floatValue() <= range.floatValue();
	}

	@Override
	public boolean contains(Vector<Float> v) {
		for (int i = 0; i < values.length; i++) {
			if (v.get(i).floatValue() < 0.0f || v.get(i).floatValue() >= values[i].floatValue()) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("(");
		for (int i = 0; i < values.length; i++) {
			if (i > 0) {
				builder.append(", ");
			}
			builder.append(values[i]);
		}
		builder.append(")");
		return builder.toString();
	}
}
