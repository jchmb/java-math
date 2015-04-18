package nl.jchmb.math.vector;

public class XYVector extends FloatVector {
	public static final XYVector EX = new XYVector(1, 0);
	public static final XYVector EY = new XYVector(0, 1);
	
	public XYVector(float x, float y) {
		super(new float[]{x, y});
	}
}
