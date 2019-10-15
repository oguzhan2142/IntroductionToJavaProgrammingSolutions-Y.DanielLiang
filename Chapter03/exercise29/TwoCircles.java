package Chapter03.exercise29;

import java.util.Scanner;

public class TwoCircles {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter circle1's center x-, y-coordinates, and radius:");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double radius1 = scan.nextDouble();
		System.out.println("Enter circle2's center x-, y-coordinates, and radius:");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double radius2 = scan.nextDouble();

		scan.close();

		
		
		double distanceBetweenCenters = Math.pow(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2), 0.5);

		if (distanceBetweenCenters < Math.abs(radius2 - radius1)) {

			System.out.println("circle2 is inside circle1");
			
		}
		else if (distanceBetweenCenters > Math.abs(radius1 - radius2) && distanceBetweenCenters < Math.abs(radius1 + radius2)) {
			System.out.println("circle2 overlaps circle1");
		}

		else {
			System.out.println("circle2 does not overlap circle1");
		}
	}

}
