package Chapter04.exercise01;

import java.util.Scanner;

public class AreaOfAPentagon {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the length from the center to a vertex:");
		
		double lengthFromCenterToVertex = scan.nextDouble();
		
		scan.close();

		double lengthOfSide = 2 * lengthFromCenterToVertex * Math.sin(Math.PI / 5);
		
		double area = (5 * lengthOfSide * lengthOfSide) / (4 * Math.tan(Math.PI / 5));
		
		
		System.out.println("The area of the pendragon is " + area);
		

	}

}
