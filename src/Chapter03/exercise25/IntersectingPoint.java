package Chapter03.exercise25;

import java.util.Scanner;

public class IntersectingPoint {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();
		double x4 = scan.nextDouble();
		double y4 = scan.nextDouble();

		scan.close();



		double a = (y1 - y2);
		double b = -(x1 - x2);
		double c =(y3 - y4);
		double d = -(x3 - x4);
		double e = ((y1 - y2) * x1) - ((x1 - x2) * y1);
		double f = ((y3 - y4) * x3) - ((x3 - x4) * y3);

		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if ((a * d - b * c) == 0) {
			System.out.println("two lines are parallel");
		} else {
			System.out.println("the intersecting point is at " + x + "," + y);
		}

	}

}
