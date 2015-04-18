package nl.jchmb.math.vector2;

import java.util.List;

public class AffineSpace implements Space {
	public static final SpaceDimension EW = new SpaceDimension();
	
	private Space baseSpace;
	
	public AffineSpace(Space baseSpace) {
		this.baseSpace = baseSpace;
	}
	
	@Override
	public List<SpaceDimension> getSpan() {
		List<SpaceDimension> span = baseSpace.getSpan();
		span.add(EW);
		return span;
	}
}
