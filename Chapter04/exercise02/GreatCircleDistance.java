package Chapter04.exercise02;

import java.util.Scanner;

public class GreatCircleDistance {

	public static void main(String[] args) {
		
		final double RADIUS_OF_EARTH = 6371.01;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter point 1 (latitude and longitude) in degrees:");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		System.out.println("Enter point 2 (latitude and longitude) in degrees:");
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		
		scan.close();
		
		double x1Radian = Math.toRadians(x1);
		double y1Radian = Math.toRadians(y1);
		double x2Radian = Math.toRadians(x2);
		double y2Radian = Math.toRadians(y2);
		
		
		double distance = RADIUS_OF_EARTH * Math.acos(Math.sin(x1Radian) * Math.sin(x2Radian) + Math.cos(x1Radian) * Math.cos(x2Radian) * Math.cos(y1Radian -y2Radian));
		
		System.out.println("The distance between the two points is " + distance);
	}

}
