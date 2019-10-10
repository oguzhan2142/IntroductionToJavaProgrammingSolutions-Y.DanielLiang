package Chapter06.exercise35;

import java.util.Scanner;

public class AreaOfAPentagon {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter side of pentagon:");
		double side = scan.nextDouble();
		scan.close();
		System.out.println("area is " + area(side));
		
		
		
		
	}
	public static double area(double side) {
		
		
		
		double area = (5 * side * side) / (4 * Math.tan(Math.PI / 5));
		
		
		return area;
	}

}


