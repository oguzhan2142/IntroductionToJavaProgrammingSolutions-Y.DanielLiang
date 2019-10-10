package Chapter03.exercise34;

import java.util.Scanner;

public class PointOnLineSegment {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x0 = scan.nextDouble();
		double y0 = scan.nextDouble();
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		scan.close();

		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

		boolean isOnLine = (result == 0) && !( (x2 < x0) || (y2 < y0) || (x2 > x1) || (y2 > y1));
		
		
		
		
		if (!isOnLine) {
			System.out.println(x2 + "," + y2 + " is not on the line from " + x0 + "," + y0 + " to " +x1 + "," + y1 );
		}
		else {
			System.out.println(x2 + "," + y2 + " is on the line from " + x0 + "," + y0 + " to " +x1 + "," + y1 );
		}
	}

}
