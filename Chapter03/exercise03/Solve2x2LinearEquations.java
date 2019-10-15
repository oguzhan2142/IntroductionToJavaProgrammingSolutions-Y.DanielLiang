package Chapter03.exercise03;

import java.util.Scanner;

public class Solve2x2LinearEquations {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		double f = scan.nextDouble();
		
		
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);

		if ((a * d - b * c) == 0) {
			System.out.println("The equation has no solution");
		}
		else {
			System.out.println("X:" + x);
			System.out.println("Y:" + y);
		}
		scan.close();

	}

}
