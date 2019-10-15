package Chapter08.exercise31;

import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {

		double[][] point = new double[4][2];

		Scanner scan = new Scanner(System.in);
		System.out.println("enter points");
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				point[i][j] = scan.nextDouble();
			}
		}
		scan.close();

		double[] intersectingPoint = getIntersectingPoint(point);

		System.out.println(intersectingPoint[0]);
		System.out.println(intersectingPoint[1]);

	}

	public static double[] getIntersectingPoint(double[][] points) {

		double[] intersectingPoint = new double[2];

		double a = (points[0][1] - points[1][1]);
		double b = -(points[0][0] - points[1][0]);
		double c = (points[2][1] - points[3][1]);
		double d = -(points[2][0] - points[3][0]);
		double e = ((points[0][1] - points[1][1]) * points[0][0]) - ((points[0][0] - points[1][0]) * points[0][1]);
		double f = ((points[2][1] - points[3][1]) * points[2][0]) - ((points[2][0] - points[3][0]) * points[2][1]);

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		intersectingPoint[0] = x;
		intersectingPoint[1] = y;

		if ((a * d - b * c) == 0) {
			System.out.println("two lines are parallel");
			return null;
		} else {
			return intersectingPoint;
		}

	}

}
