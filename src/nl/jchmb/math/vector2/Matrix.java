package nl.jchmb.math.vector2;

public class Matrix<T> implements LinearTransformation<T> {
	@Override
	public Vector<T> transform(Vector<T> v) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class Column {
		private SpaceDimension vectorDimension;
		private Vector<T> v;
		
		public Column(SpaceDimension vectorDimension, Vector<T> v) {
			this.vectorDimension = vectorDimension;
			this.v = v;
		}
	}
}
