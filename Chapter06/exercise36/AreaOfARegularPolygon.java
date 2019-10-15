package Chapter06.exercise36;

import java.util.Scanner;

public class AreaOfARegularPolygon {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of sides:");
		int n = scan.nextInt();
		System.out.println("Enter the side:");
		double side = scan.nextDouble();
		scan.close();
		
		System.out.println("The area of the polygon is " + area(n, side));
		
		
	}
	
	public static double area(int n, double side) {
		
		double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
		
		
		return area;
	}

}
