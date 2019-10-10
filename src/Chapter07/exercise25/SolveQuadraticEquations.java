package Chapter07.exercise25;

import java.util.Scanner;

public class SolveQuadraticEquations {

	public static void main(String[] args) {

		double[] eqn = new double[3];
		double[] roots = new double[2];
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a,b,c of equation:");
		for (int i = 0; i < eqn.length; i++) {
			eqn[i] = scan.nextDouble();
		}
		scan.close();
		
		int numOfRoots = solveQuadratic(eqn, roots);
		System.out.println("number of roots:" + numOfRoots);

		for (int i = 0; i < roots.length; i++) {
			System.out.println("root " + (i+1) + ":" + roots[i]);
		}
	}

	public static int solveQuadratic(double[] eqn, double[] roots) {

		double a = eqn[0];
		double b = eqn[1];
		double c = eqn[2];

		double delta = (b * b) - (4 * a * c);

		double root1 = (-b + Math.pow(delta, 0.5)) / (2 * a);
		double root2 = (-b - Math.pow(delta, 0.5)) / (2 * a);
		
		roots[0] = root1;
		roots[1] = root2;

		if (delta > 0) {
			return 2;
		} else if (delta == 0) {
			return 1;
		} else {
			return 0;
		}

	}

}
