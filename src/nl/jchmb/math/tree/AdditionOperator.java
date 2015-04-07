package nl.jchmb.math.tree;

import nl.jchmb.math.arithmetic.FloatAddition;

public class AdditionOperator extends BinaryOperator<Float> {
	public AdditionOperator(Node<Float> n1, Node<Float> n2) {
		super(new FloatAddition(), n1, n2);
	}
}
