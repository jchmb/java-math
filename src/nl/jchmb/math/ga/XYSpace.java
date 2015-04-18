package nl.jchmb.math.ga;

import java.util.ArrayList;
import java.util.List;

public class XYSpace implements Space {
	public static final SpaceDimension EX = new SpaceDimension();
	public static final SpaceDimension EY = new SpaceDimension();
	
	@Override
	public List<SpaceDimension> getSpan() {
		List<SpaceDimension> span = new ArrayList<SpaceDimension>();
		span.add(EX);
		span.add(EY);
		return span;
	}
}