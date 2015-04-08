package nl.jchmb.math.random;

import java.util.Random;

import nl.jchmb.generic.generator.Generator;

public class FloatGenerator implements Generator<Float> {
	private Random random;
	private float limit;
	private float offset;
	
	public FloatGenerator(float limit, float offset) {
		this.limit = limit;
		this.offset = offset;
		random = new Random();
	}
	
	public FloatGenerator() {
		this(1.0f, 0.0f);
	}
	
	@Override
	public Float generate() {
		return random.nextFloat() * limit + offset;
	}
}
