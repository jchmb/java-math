package nl.jchmb.math.ga;

import java.util.List;

public class XYZSpace extends XYSpace {
	public static final SpaceDimension EZ = new SpaceDimension();
	
	@Override
	public List<SpaceDimension> getSpan() {
		List<SpaceDimension> span = super.getSpan();
		span.add(EZ);
		return span;
	}
}
