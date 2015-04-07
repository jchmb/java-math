package nl.jchmb.math.vector;

public abstract class BaseVector<T extends Number> implements Vector<T> {
	@Override
	public String toString() {
		T[] values = getArray();
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
