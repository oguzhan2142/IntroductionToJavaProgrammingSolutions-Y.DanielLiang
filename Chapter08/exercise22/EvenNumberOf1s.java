package Chapter08.exercise22;

public class EvenNumberOf1s {

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}

		displayTheMatrix(matrix);

		if (isEveryRowAndEveryColumnHaveAnEvenNumberOfOnes(matrix)) {
			System.out.println("every row and every column have an even number of 1s.");
		} else {
			System.out.println("every row and every column haven`t an even number of 1s.");
		}

	}

	public static boolean isEveryRowAndEveryColumnHaveAnEvenNumberOfOnes(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter % 2 != 0) {
				return false;
			}

		}

		for (int i = 0; i < matrix.length; i++) {
			int oneCounter = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[j][i] == 1) {
					oneCounter++;
				}

			}
			if (oneCounter % 2 != 0) {
				return false;
			}

		}

		return true;
	}

	public static void displayTheMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
