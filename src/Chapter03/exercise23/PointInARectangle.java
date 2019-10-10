package Chapter03.exercise23;

import java.util.Scanner;

public class PointInARectangle {

	public static void main(String[] args) {

		
		

		Scanner scan = new Scanner(System.in);
		
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		
		scan.close();
		
		
		
		
		
		
		if ( x > 5 || x < -5 || y < -2.5 || y > 2.5) {
			System.out.println("point is not in rectangle");
		}
		else {
			System.out.println("point is  in rectangle");
		}
		
		
		
	}

}
