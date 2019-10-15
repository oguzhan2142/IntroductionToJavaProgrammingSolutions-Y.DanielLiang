package Chapter09.exercise12;

public class IntersectingPoint {


	private double x1;
	private double y1;
	private double x2;
	private double y2;
	private double x3;
	private double y3;
	private double x4;
	private double y4;

	double a = (y1 - y2);
	double b = -(x1 - x2);
	double c = (y3 - y4);
	double d = -(x3 - x4);
	double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
	double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

	public double getIntersectX() {
		double x = (e * d - b * f) / (a * d - b * c);
		return x;

	}

	public double getIntersectY() {
		double y = (a * f - e * c) / (a * d - b * c);
		return y;

	}

	public boolean isLinesParalel() {
		if ((a * d - b * c) == 0) {
			return true;
		}
		return false;
	}

}
