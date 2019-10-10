package Chapter08.exercise14;

import java.util.Scanner;

public class ExploreMatrix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size for the matrix:");
		int lengthOfSquareMatrix = scan.nextInt();
		scan.close();

		int[][] squareMatrix = new int[lengthOfSquareMatrix][lengthOfSquareMatrix];
		randomFillMatrix(squareMatrix);
		printMatrix(squareMatrix);

		printHowManyRowFillWithOneAndZero(squareMatrix);

		printHowManyColumnFillWithOneAndZero(squareMatrix);
		
		if (isAllElementInMajorDiagonalSame(squareMatrix)) {
			System.out.println("same numbers on major diagonal");
		}else {
			System.out.println("No same numbers on the major diagonal");
		}
		if (isAllElementInSubDiagonalSame(squareMatrix)) {
			System.out.println("same numbers on sub diagonal");
		}else {
			System.out.println("No same numbers on the sub diagonal");
		}

		
	}

	private static void printHowManyColumnFillWithOneAndZero(int[][] squareMatrix) {
		int[] columnZeroAndOne = getColumnZeroAndOne(squareMatrix);

		if (columnZeroAndOne[0] > 0 || columnZeroAndOne[1] > 0) {
			if (columnZeroAndOne[0] > 0) {
				
				System.out.println("All 0s on column " + columnZeroAndOne[0]);
			}else {
				
				System.out.println("All 1s on column" + columnZeroAndOne[1]);
			}

		} else {
			System.out.println("No same numbers on a row");
		}

		
		
		
		
	}

	private static void printHowManyRowFillWithOneAndZero(int[][] squareMatrix) {
		int[] rowsZeroAndOne = getRowsZeroAndOne(squareMatrix);

		if (rowsZeroAndOne[0] > 0 || rowsZeroAndOne[1] > 0) {
			if (rowsZeroAndOne[0] > 0) {

				System.out.println("All 0s on row " + rowsZeroAndOne[0]);
			} else {

				System.out.println("All 1s on row " + rowsZeroAndOne[1]);
			}

		} else {
			System.out.println("No same numbers on a column");
		}

	}

	public static int[] getColumnZeroAndOne(int[][] matrix) {

		int[] columnZeroAndOne = new int[2];

		for (int i = 0; i < columnZeroAndOne.length; i++) {

			if (isAllElementInColumnSame(matrix, i)) {

				if (matrix[0][i] == 0) {
					columnZeroAndOne[0]++;
				} else {
					columnZeroAndOne[1]++;
				}

			}

		}
		return columnZeroAndOne;

	}

	public static int[] getRowsZeroAndOne(int[][] matrix) {

		int[] rowsZeroAndOne = new int[2];

		for (int i = 0; i < rowsZeroAndOne.length; i++) {

			if (isAllElementInRowSame(matrix, i)) {

				if (matrix[i][0] == 0) {
					rowsZeroAndOne[0]++;
				} else {
					rowsZeroAndOne[1]++;
				}

			}

		}
		return rowsZeroAndOne;

	}
	public static boolean isAllElementInMajorDiagonalSame(int[][] matrix) {
	
		boolean isSame = matrix[0][0] == matrix[1][1];
		
		for (int i = 0; i < matrix.length - 1; i++) {
			isSame = isSame && (matrix[i][i] == matrix[i+ 1][i+ 1]);
		}
		return isSame;
	}
	
	public static boolean isAllElementInSubDiagonalSame(int[][] matrix) {
		
		boolean isSame = matrix[matrix.length -1][matrix.length -1] == matrix[matrix.length -2][matrix.length -2];
		
		for (int i = matrix.length -1; i >0; i--) {
			isSame = isSame && (matrix[i][i] == matrix[i -1][i-1]);
		}
		return isSame;
	}
	

	

	public static boolean isAllElementInColumnSame(int[][] matrix, int column) {
		boolean isSame = matrix[0][column] == matrix[1][column];

		for (int i = 0; i < matrix.length -1; i++) {
			isSame = isSame && (matrix[i][column] == matrix[i + 1][column]);
		}

		return isSame;
	}

	public static boolean isAllElementInRowSame(int[][] matrix, int row) {
		boolean isSame = matrix[row][0] == matrix[row][1];

		for (int i = 0; i < matrix.length -1; i++) {
			isSame = isSame && (matrix[row][i] == matrix[row][i + 1]);
		}

		return isSame;
	}

	public static void printMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static void randomFillMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				int randomNum = (int) (Math.random() * 2);

				matrix[i][j] = randomNum;

			}
		}

	}
}
