
public class TriangleClassifier {

	public enum Classification {
		Equilateral, Isosceles, Scalene;
	}
	
	public static Classification classify(double x, double y, double z) {
		throw new IllegalArgumentException("Not a triangle");
	}
	
}

