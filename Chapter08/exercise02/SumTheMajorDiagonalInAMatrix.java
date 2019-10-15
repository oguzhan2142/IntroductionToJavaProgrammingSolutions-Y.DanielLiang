package Chapter08.exercise02;

import java.util.Scanner;

public class SumTheMajorDiagonalInAMatrix {

	public static void main(String[] args) {
		double[][] matrix = new double[4][4];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a 4-by-4 matrix row by row:");

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = scan.nextDouble();
			}
		}
		scan.close();

		System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

	}

	public static double sumMajorDiagonal(double[][] m) {

		double sum = 0;
		for (int i = 0; i < m.length; i++) {
			sum += m[i][i];
		}

		return sum;

	}
}
