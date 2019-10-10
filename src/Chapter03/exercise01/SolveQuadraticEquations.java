package Chapter03.exercise01;

import java.util.Scanner;

public class SolveQuadraticEquations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b  = scan.nextDouble();
		double c = scan.nextDouble();
		
		
		double delta = (b * b) - (4 * a * c);
		
		double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
		
		
		
		if (delta > 0) {
			System.out.println("The equation has two roots "+ root1 +" and " + root2);
		}
		else if (delta == 0) {
			System.out.println("The equation has one root " + root1);
		}
		else {
			System.out.println("The equation has no real roots");
		}
		scan.close();
		
	}

}
