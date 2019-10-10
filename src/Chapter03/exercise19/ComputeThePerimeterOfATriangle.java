package Chapter03.exercise19;

import java.util.Scanner;

public class ComputeThePerimeterOfATriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();

		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();

		scan.close();

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);
		double side3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);

		boolean check1 = (side1 + side2) > side3 && Math.abs(side1 - side2) < side3;
		boolean check2 = (side1 + side3) > side2 && Math.abs(side1 - side3) < side2;
		boolean check3 = (side3 + side2) > side1 && Math.abs(side3 - side2) < side1;

		
		if (check1 && check2 && check3) {
			System.out.println("perimeter of triagle is: " + (side1 + side2 + side3));
		}
		else {
			System.out.println("the input is invalid");
		}
	}

}
