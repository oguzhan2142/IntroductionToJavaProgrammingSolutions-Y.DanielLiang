package Chapter03.exercise22;

import java.util.Scanner;

public class PointInACircle {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		scan.close();
		
		
		double circleX = 0;
		double circleY = 0;
		
		double radiusOfCircle = 10;
		
		
		double distanceBetweenCircleCenterAndPoint;
		
		distanceBetweenCircleCenterAndPoint = Math.pow( Math.pow(x - circleX, 2) + Math.pow(y - circleY, 2), 0.5);
		
		if (distanceBetweenCircleCenterAndPoint <= radiusOfCircle) {
			System.out.println("point is in circle");
		}
		else {
			System.out.println("point is not in circle");
		}
	}

}
