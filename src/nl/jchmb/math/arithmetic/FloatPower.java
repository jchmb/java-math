package nl.jchmb.math.arithmetic;

import nl.jchmb.generic.tuple.Pair;
import nl.jchmb.math.function.BinaryFunction;

public class FloatPower implements BinaryFunction<Float, Float, Float> {
	@Override
	public Float map(Pair<Float, Float> x) {
		return (float) Math.pow(x.getLeft(), x.getRight());
	}

	@Override
	public String toString() {
		return "^";
	}
}
