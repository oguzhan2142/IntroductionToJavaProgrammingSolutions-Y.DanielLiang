package Chapter02.exercise15;

import java.util.Scanner;

public class DistanceOfTwoPoints {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		double distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		System.out.println(distance);
		scan.close();

		
		
	}

}
