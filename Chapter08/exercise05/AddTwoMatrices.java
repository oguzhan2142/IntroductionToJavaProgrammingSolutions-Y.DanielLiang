package Chapter08.exercise05;

import java.util.Scanner;

public class AddTwoMatrices {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[][] matrix1 = new double[3][3];
		double[][] matrix2 = new double[3][3];

		System.out.println("Enter matrix1:");
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				matrix1[i][j] = scan.nextDouble();
			}
		}
		System.out.println("Enter matrix2:");
		for (int i = 0; i < matrix2.length; i++) {
			for (int j = 0; j < matrix2[i].length; j++) {
				matrix2[i][j] = scan.nextDouble();
			}
		}
		scan.close();

		double[][] sumOfTwoMatrix = addMatrix(matrix1, matrix2);

		for (int i = 0; i < sumOfTwoMatrix.length; i++) {
			for (int j = 0; j < sumOfTwoMatrix[i].length; j++) {

				System.out.print(sumOfTwoMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static double[][] addMatrix(double[][] a, double[][] b) {

		double[][] sumMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < sumMatrix.length; i++) {

			for (int j = 0; j < sumMatrix[i].length; j++) {

				sumMatrix[i][j] = a[i][j] + b[i][j];

			}

		}

		return sumMatrix;
	}

}
