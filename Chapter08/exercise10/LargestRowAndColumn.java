package Chapter08.exercise10;

public class LargestRowAndColumn {

	public static void main(String[] args) {

		int[][] matrix = new int[4][4];
		int largestRowIndex = 0;
		int largestColumnIndex = 0;
		int largestRow = 0;
		int largestColumn = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			int sumOfRow = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				sumOfRow += matrix[i][j];

			}
			if (sumOfRow > largestRow) {
				largestRow = sumOfRow;
				largestRowIndex = i;
			}

		}
		
		for (int i = 0; i < matrix.length; i++) {
			int sumOfColumn = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				sumOfColumn += matrix[j][i];

			}
			if (sumOfColumn > largestColumn) {
				largestColumn = sumOfColumn;
				largestColumnIndex = i;
			}

		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println("The largest row index:" + largestRowIndex);
		System.out.println("The largest column index:" + largestColumnIndex);

	}

}
