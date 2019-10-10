package Chapter10.exercise15;

import java.util.Scanner;

import Chapter10.exercise13.MyRectangle2D;

public class BoundingRectangle {
	
	
	
	
	
	public static MyRectangle2D getRectangle(double[][] points) {
		
		double width; 
		double height;
		double x;
		double y;
		double minXPoint = points[0][0];
		double maxXPoint = points[0][0];
		double minYPoint = points[0][1];
		double maxYPoint = points[0][1];
		
		for (int i = 0; i < points.length; i++) {
			if (maxXPoint < points[i][0] ) {
				maxXPoint = points[i][0];
			}
		}
		for (int i = 0; i < points.length ; i++) {
			if (minXPoint > points[i][0]) {
				minXPoint = points[i][0];
			}
		}
		
		

		for (int i = 0; i < points.length; i++) {
			if (maxYPoint < points[i][1] ) {
				maxYPoint = points[i][1];
			}
		}
		for (int i = 0; i < points.length ; i++) {
			if (minYPoint > points[i][1]) {
				minYPoint = points[i][1];
			}
		}
		
		x = (maxXPoint + minXPoint) / 2;
		y = (maxYPoint + minYPoint ) / 2;
		
		width = maxXPoint - minXPoint;
		height = maxYPoint - minYPoint;
		
		 
		return new MyRectangle2D(x, y, width, height);
		
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five points");
		double[][] points = new double[5][2];
		
		for (int i = 0; i < points.length; i++) {
			for (int j = 0; j < points[i].length; j++) {
				points[i][j] = scan.nextDouble();
			}
		}
		
		scan.close();
		
		
		
		
		MyRectangle2D  rectangle = BoundingRectangle.getRectangle(points);
		
		System.out.println(rectangle.getX() + "," + rectangle.getY() + " width: " + rectangle.getWidth() + " height:" + rectangle.getHeight()); 
		
		
		
		
	}
	

}
