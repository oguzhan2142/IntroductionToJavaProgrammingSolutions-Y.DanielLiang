package Chapter02.exercise19;

import java.util.Scanner;

public class AreaOfATriangle {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();

		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();

		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

		System.out.println(area);
		scan.close();
	}

}
