package nl.jchmb.math.arithmetic;

import nl.jchmb.generic.tuple.Pair;
import nl.jchmb.math.function.BinaryFunction;

public class FloatRoot implements BinaryFunction<Float, Float, Float> {

	@Override
	public Float map(Pair<Float, Float> x) {
		return (float) Math.pow(x.getLeft(), 1 / x.getRight());
	}
	
	@Override
	public String toString() {
		return "√";
	}

}
