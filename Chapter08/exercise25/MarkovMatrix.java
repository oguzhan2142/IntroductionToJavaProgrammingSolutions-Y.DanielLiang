package Chapter08.exercise25;

import java.util.Scanner;

public class MarkovMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] markovMatrix = new double[3][3];

		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int i = 0; i < markovMatrix.length; i++) {
			for (int j = 0; j < markovMatrix[i].length; j++) {

				markovMatrix[i][j] = scan.nextDouble();
			}
		}

		scan.close();

		boolean isMarkovMatrix = true;

		for (int column = 0; column < markovMatrix.length; column++) {

			if (giveSumOfColumn(markovMatrix, column) != 1) {

				isMarkovMatrix = false;

			}

		}
		if (isMarkovMatrix) {
			System.out.println("it is markov matrix");
		}else {
			System.out.println("it is not a markov matrix");
		}

	}

	public static double giveSumOfColumn(double[][] array, int column) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum += array[i][column];
		}

		return sum;
	}

}
