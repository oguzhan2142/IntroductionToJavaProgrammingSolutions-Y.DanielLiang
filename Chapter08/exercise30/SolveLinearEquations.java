package Chapter08.exercise30;

import java.util.Scanner;

public class SolveLinearEquations {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		double[][] a = new double [2][2];
		double[] b = new double [2];
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scan.nextDouble();
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i] = scan.nextDouble();
		}
		scan.close();
		
		
		
		double[] root = linearEquation(a, b);
		
		for (int i = 0; i < root.length; i++) {
			System.out.println(root[i]);
		}
		
	}

	public static double[] linearEquation(double[][] a, double[] b) {
		
		
		if (a[0][0] * a[1][1] - a[0][1] * a[1][0] == 0) {
			System.out.println("The equation has no solution");
			return null;
		}
		
		double x = (b[0] * a[1][1] - b[1] * a[0][1]) / ( a[0][0] * a[1][1] - a[0][1] * a[1][0]); 
		double y = (b[1] * a[0][0] - b[0] * a[1][0]  ) / (a[0][0] * a[1][1] - a[0][1] * a[1][0]);
		
		double[] root = new double[2];
		root[0] = x;
		root[1] = y;
		return root;
		
	}
}
