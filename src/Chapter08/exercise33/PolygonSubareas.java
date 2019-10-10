package Chapter08.exercise33;

import java.util.Scanner;

public class PolygonSubareas {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] point = new double[4][2];
		System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				point[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		
		double []intersectingPoint = getIntersectingPoint(point);
		
		double [ ] area = new double [4];
		double[][] triangle1Points = new double[3][2];
		double[][] triangle2Points = new double[3][2];
		double[][] triangle3Points = new double[3][2];
		double[][] triangle4Points = new double[3][2];
		
		triangle1Points[0][0] = point[0][0];
		triangle1Points[0][1] = point[0][1];
		triangle1Points[1][0] = point[1][0];
		triangle1Points[1][1] = point[1][1];
		triangle1Points[2][0] = intersectingPoint[0];
		triangle1Points[2][1] = intersectingPoint[1];
		
		triangle2Points[0][0] = point[1][0];
		triangle2Points[0][1] = point[1][1];
		triangle2Points[1][0] = point[2][0];
		triangle2Points[1][1] = point[2][1];
		triangle2Points[2][0] = intersectingPoint[0];
		triangle2Points[2][1] = intersectingPoint[1];
		

		
		triangle3Points[0][0] = point[2][0];
		triangle3Points[0][1] = point[2][1];
		triangle3Points[1][0] = point[3][0];
		triangle3Points[1][1] = point[3][1];
		triangle3Points[2][0] = intersectingPoint[0];
		triangle3Points[2][1] = intersectingPoint[1];
		
		triangle4Points[0][0] = point[3][0];
		triangle4Points[0][1] = point[3][1];
		triangle4Points[1][0] = point[0][0];
		triangle4Points[1][1] = point[0][1];
		triangle4Points[2][0] = intersectingPoint[0];
		triangle4Points[2][1] = intersectingPoint[1];
		
		
		area[0] = getTriangleArea(triangle1Points);
		area[1] = getTriangleArea(triangle2Points);
		area[2] = getTriangleArea(triangle3Points);
		area[3] = getTriangleArea(triangle4Points);
		
		for (int j = 0; j < area.length; j++) {
			System.out.println("area " + (j + 1 ) + " is " + area[j]);
		}

	}
	

	public static double getTriangleArea(double[][] points) {

		double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2),
				0.5);
		double side2 = Math.pow(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2),
				0.5);
		double side3 = Math.pow(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2),
				0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		return area;

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
