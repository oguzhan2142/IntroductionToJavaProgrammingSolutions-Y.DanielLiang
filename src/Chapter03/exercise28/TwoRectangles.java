package Chapter03.exercise28;

import java.util.Scanner;

public class TwoRectangles {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		 System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double r1Width = scan.nextDouble();
		double r1Height = scan.nextDouble();

		 System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double r2Width = scan.nextDouble();
		double r2Height = scan.nextDouble();

		scan.close();

		double r2RightEdge = (x2 + r2Width / 2);
		double r2LeftEdge = (x2 - r2Width / 2);
		double r2UpEdge = y2 + r2Height / 2;
		double r2DownEdge = y2 - r2Height / 2;

		double r1RightEdge = x1 + r1Width / 2;
		double r1LeftEdge = x1 - r1Width / 2;
		double r1UpEdge = y1 + r1Height / 2;
		double r1DownEdge = y1 - r1Height / 2;

		boolean horizontalIsInside = (r1RightEdge >= r2RightEdge) && (r1LeftEdge <= r2LeftEdge);
		boolean verticalIsInside = r1UpEdge >= r2UpEdge && r1DownEdge <= r2DownEdge;

		boolean isHorizontalOverlaps = (r2RightEdge > r1RightEdge && r2LeftEdge < r1RightEdge)
				|| (r2LeftEdge < r1LeftEdge && r2RightEdge > r1LeftEdge);
		boolean isVerticalOverlaps = (r2UpEdge > r1UpEdge && r2DownEdge < r1UpEdge)
				|| (r2DownEdge < r1DownEdge && r2UpEdge > r1DownEdge);

		boolean isDoesNotHorizontalOverlaps = (r2RightEdge > r1RightEdge && r2LeftEdge > r1RightEdge)
				|| (r2LeftEdge < r1LeftEdge && r2RightEdge < r1LeftEdge);
		boolean isDoesNotVerticalOverlaps = (r2UpEdge > r1UpEdge && r2DownEdge > r1UpEdge)
				|| (r2DownEdge < r1DownEdge && r2UpEdge < r1DownEdge);

		if ((horizontalIsInside && verticalIsInside)) {
			System.out.println("r2 is inside r1");
		}

		if ((isVerticalOverlaps && isHorizontalOverlaps)) {

			System.out.println("r2 overlaps r1");
		}

		if (isDoesNotVerticalOverlaps && isDoesNotHorizontalOverlaps) {
			System.out.println("r2 does not overlap r1");
		}
	}

}
