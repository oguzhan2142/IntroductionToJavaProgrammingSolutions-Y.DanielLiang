package Chapter04.exercise04;

import java.util.Scanner;

public class AreaOfAHexagon {

	public static void main(String[] args) {

		
		System.out.println("Enter the side:");
		Scanner scan =new Scanner(System.in);
		
		double lengthOfSide = scan.nextDouble();
		
		scan.close();
		
		
		double area = (6 * lengthOfSide * lengthOfSide) / (4 * Math.tan(Math.PI / 6));
		
		System.out.println("The area of the hexagon is " + area);
		
		
	}

}
