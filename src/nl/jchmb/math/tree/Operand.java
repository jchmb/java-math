package nl.jchmb.math.tree;

public class Operand<T> implements Node<T> {
	private T value;
	
	public Operand(T value) {
		this.value = value;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	
	@Override
	public T evaluate() {
		return value;
	}

}
