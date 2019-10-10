package Chapter04.exercise05;

import java.util.Scanner;

public class AreaOfARegularPolygon {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter the number of sides: ");
		int numOfSide = scan.nextInt();
		System.out.println("Enter the length of the side: ");
		double leghtOfSide = scan.nextDouble();
		scan.close();


		double area = (numOfSide * leghtOfSide * leghtOfSide) / (4 * Math.tan(Math.PI / numOfSide));


		System.out.println("The area of the polygon is " + area);
	}

}
