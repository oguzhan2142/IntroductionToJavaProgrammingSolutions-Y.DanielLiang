package Chapter04.exercise07;

import java.util.Scanner;

public class CornerPointCoordinates {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the radius of the bounding circle:");
		double radiusOfBoundingCircle = scan.nextDouble();
		
		scan.close();

		
		//five points p1,p2,p3,p4,p5
		//angles were calculated according to the inner angles of the regular pentagon 
		
		double p1X = radiusOfBoundingCircle * Math.cos(Math.toRadians(18));
		double p1Y = radiusOfBoundingCircle * Math.sin(Math.toRadians(18));
		
		double p2X = radiusOfBoundingCircle * Math.cos(Math.toRadians(18 + 72));
		double p2Y = radiusOfBoundingCircle * Math.sin(Math.toRadians(18 + 72));
		
		double p3X = radiusOfBoundingCircle * Math.cos(Math.toRadians(18 + 72 + 72));
		double p3Y = radiusOfBoundingCircle * Math.sin(Math.toRadians(18 + 72 + 72));
		
		double p4X = radiusOfBoundingCircle * Math.cos(Math.toRadians(18 + 72 + 72 + 72));
		double p4Y = radiusOfBoundingCircle * Math.sin(Math.toRadians(18 + 72 + 72 + 72));
		
		double p5X = radiusOfBoundingCircle * Math.cos(Math.toRadians(18 + 72 + 72 + 72 + 72));
		double p5Y = radiusOfBoundingCircle * Math.sin(Math.toRadians(18 + 72 + 72 + 72 + 72));
		
		
		System.out.println("The coordinates of five points on the pentagon are ");
		System.out.println();
		System.out.println(p1X + "	,	" + p1Y);
		System.out.println(p2X + "	,	" + p2Y);
		System.out.println(p3X + "	,	" + p3Y);
		System.out.println(p4X + "	,	" + p4Y);
		System.out.println(p5X + "	,	" + p5Y);
		
	}

}
