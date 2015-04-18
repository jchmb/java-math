package nl.jchmb.math.random;

import java.util.Random;

import nl.jchmb.generic.generator.Generator;

public class IntegerGenerator implements Generator<Integer> {
	private int min, max;
	private Random random;
	
	public IntegerGenerator(int min, int max) {
		this.min = min;
		this.max = max;
		random = new Random();
	}

	@Override
	public Integer generate() {
		return random.nextInt(max + 1 - min) + min;
	}
}
