package nl.jchmb.math.statistics;

import java.util.Collection;

import nl.jchmb.math.function.Function;

public class FloatAverage implements Function<Collection<Float>, Float> {

	@Override
	public Float map(Collection<Float> x) {
		float total = 0.0f;
		for (Float f : x) {
			total += f.floatValue();
		}
		return total / ((float) x.size());
	}

}
