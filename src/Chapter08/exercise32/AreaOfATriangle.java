package Chapter08.exercise32;

import java.util.Scanner;

public class AreaOfATriangle {

	public static void main(String[] args) {
		
		
		double[][] point = new double[3][2];
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter points of triangle");
		
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				
				point[i][j] = scan.nextDouble()	;
				
			}
		}
		
		scan.close();
		
		double area = getTriangleArea(point);
		
		System.out.println("Area of triagle is " + area);
				
		
	}
	
	
	public static double getTriangleArea(double[][] points) {
		
		

		double side1 = Math.pow(Math.pow(points[1][0] - points[0][0], 2) + Math.pow(points[1][1] - points[0][1], 2), 0.5);
		double side2 = Math.pow(Math.pow(points[1][0] - points[2][0], 2) + Math.pow(points[1][1] - points[2][1], 2), 0.5);
		double side3 = Math.pow(Math.pow(points[2][0] - points[0][0], 2) + Math.pow(points[2][1] - points[0][1], 2), 0.5);

		double s = (side1 + side2 + side3) / 2;

		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);		
		
		return area;
		
		
	}

}
