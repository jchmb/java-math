package nl.jchmb.math.random;

import java.util.Random;

import nl.jchmb.generic.generator.Generator;

public class FloatGenerator implements Generator<Float> {
	private Random random;
	
	public FloatGenerator() {
		random = new Random();
	}
	
	@Override
	public Float generate() {
		return random.nextFloat();
	}
}
