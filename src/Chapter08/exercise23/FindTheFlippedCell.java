package Chapter08.exercise23;

import java.util.Scanner;


public class FindTheFlippedCell {

	public static void main(String[] args) {

		int[][] matrix = new int[6][6];

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				matrix[i][j] = scan.nextInt();
			}
		}

		scan.close();

		printFlippedPoint(matrix);
	}

	public static void printFlippedPoint(int[][] matrix) {

		int row = findViolatedRow(matrix);
		int column = findViolatedColumn(matrix);

		System.out.println("The flipped cell is at (" + row + "," + column + ") ");

	}

	public static int findViolatedColumn(int[][] matrix) {

		int column = 0;
		for (int i = 0; i < matrix.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[j][i] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter % 2 != 0) {
				column = i;
			}

		}

		return column;

	}

	public static int findViolatedRow(int[][] matrix) {

		int row = 0;

		for (int i = 0; i < matrix.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter % 2 != 0) {
				row = i;
			}

		}

		return row;
	}

}
