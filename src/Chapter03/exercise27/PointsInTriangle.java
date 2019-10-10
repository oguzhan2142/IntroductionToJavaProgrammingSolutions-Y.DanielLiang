package Chapter03.exercise27;

import java.util.Scanner;

public class PointsInTriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// get points
		double x = scan.nextDouble();
		double y = scan.nextDouble();

		scan.close();

				
		
		double intersectx = (-x * (200 * 100)) / (-y * 200 - x * 100);
		double intersecty = (-y * (200 * 100)) / (-y * 200 - x * 100);
		
		
		System.out.println("The point " + ((x > intersectx || y > intersecty)
				? "is not " : "is " ) + "in the triangle");
		
		

	}

}
