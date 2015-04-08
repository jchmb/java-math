package nl.jchmb.math.tree;

import nl.jchmb.generic.generator.Generator;

public class SimpleTreeGenerator<T> implements Generator<Tree<T>> {
	private T defaultValue;
	
	public SimpleTreeGenerator(T defaultValue) {
		this.defaultValue = defaultValue;
	}
	
	@Override
	public Tree<T> generate() {
		return new Tree<T>(new Constant<String, T>(defaultValue));
	}
}
