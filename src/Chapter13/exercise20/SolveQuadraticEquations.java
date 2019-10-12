package Chapter13.exercise20;

import java.util.Scanner;

import Chapter13.exercise17.Complex;

public class SolveQuadraticEquations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();

		double delta = (b * b) - (4 * a * c);
		if (delta > 0 || delta == 0) {

			double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
			double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
			if (delta > 0) {
				System.out.println("The equation has two roots " + root1 + " and " + root2);

			} else {

				System.out.println("The equation has one root " + root1);
			}

		} else {

			Complex root1 = new Complex(-b / (2 * a), Math.pow(-delta, 0.5)/ (2 * a));
			Complex root2 = new Complex(-b / (2 * a), Math.pow(-delta, 0.5)/ (2 * a));
			
			System.out.println("The roots are " + root1 + " and " + root2);

		}

	}

}
