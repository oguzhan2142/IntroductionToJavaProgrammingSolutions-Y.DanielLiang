package Chapter06.exercise39;

import java.util.Scanner;

public class PointPosition {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three points for p0, p1, and p2:");
		double x0 = scan.nextDouble();
		double y0 = scan.nextDouble();
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		scan.close();

		if (leftOfTheLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("left side on line");
		} else if (onTheSameLine(x0, y0, x1, y1, x2, y2)) {
			System.out.println("same line");
		} else {
			System.out.println("right side on line");
		}

	}

	public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (result > 0) {
			return true;
		}

		return false;

	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (result == 0) {
			return true;
		}
		return false;

	}

	public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2) {

		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (result < 0) {
			return true;
		}
		return false;

	}

}
