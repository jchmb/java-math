package nl.jchmb.math.vector;

import java.util.ArrayList;
import java.util.Random;

import nl.jchmb.generic.generator.Generator;

public class FloatVectorGenerator implements Generator<Vector<Float>> {
	private Generator<Float> scalarGenerator;
	private int dim;
	
	public FloatVectorGenerator(int dim, Generator<Float> scalarGenerator) {
		this.dim = dim;
		this.scalarGenerator = scalarGenerator;
	}
	
	@Override
	public FloatVector generate() {
		float[] values = new float[dim];
		for (int i = 0; i < dim; i++) {
			values[i] = scalarGenerator.generate();
		}
		return new FloatVector(values);
	}
}
