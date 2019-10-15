package Chapter06.exercise19;

import java.util.Scanner;

public class TheMyTriangleClass {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter side1:");
		double side1 = scan.nextDouble();
		System.out.println("Enter side2:");
		double side2 = scan.nextDouble();
		System.out.println("Enter side3:");
		double side3 = scan.nextDouble();
		scan.close();
		
		if (MyTriangle.isValid(side1, side2, side3)) {
			System.out.println("Area is " + MyTriangle.area(side1, side2, side3));
		}
		else {
			System.out.println("Invalid");
		}



	}

}


class MyTriangle{
	
	
	public static boolean isValid(
			double side1, double side2, double side3) {
		
		if (side1 + side2 > side3) {
			return true;
		}
		else if (side1 + side3 > side2) {
			return true;
		}
		else if (side3 + side2 > side1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	public static double area(
			double side1, double side2, double side3) {
		
		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
		
		return area;
		
	}
	
	
}