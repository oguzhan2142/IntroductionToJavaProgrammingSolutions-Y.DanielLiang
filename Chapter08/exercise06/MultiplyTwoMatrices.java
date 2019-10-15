package Chapter08.exercise06;

import java.util.Scanner;

public class MultiplyTwoMatrices {

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

		double[][] multiplyOfTwoMatrix = multiplyMatrix(matrix1, matrix2);

		for (int i = 0; i < multiplyOfTwoMatrix.length; i++) {
			for (int j = 0; j < multiplyOfTwoMatrix[i].length; j++) {

				System.out.printf(multiplyOfTwoMatrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {

		double[][] multiplyMatrix = new double[a.length][a[0].length];

		for (int i = 0; i < multiplyMatrix.length; i++) {
			for (int j = 0; j < multiplyMatrix[i].length; j++) {

				multiplyMatrix[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
				
			}
		}

		return multiplyMatrix;

	}

}
