package Chapter11.exercise09;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestRowsAndColumns {

	public static void main(String[] args) {

		System.out.println("Enter the array size n:");

		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		scan.close();

		int[][] matrix = createMatrix(size);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}
		
		
		
		ArrayList<Integer> listRow = findLargestRowIndex(matrix);
		ArrayList<Integer> listColumn= findLargestColumnIndex(matrix);
		System.out.print("The largest row index:");
		for (int i = 0; i < listRow.size(); i++) {
			System.out.print(listRow.get(i)+ " ");
		}

		System.out.print("/nThe largest column index:");
		for (int i = 0; i < listColumn.size(); i++) {
			System.out.print(listColumn.get(i) + " ");
		}
	}

	public static ArrayList<Integer> findLargestRowIndex(int[][] matrix) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int maxOneInARow = 0;

		for (int i = 0; i < matrix.length; i++) {
			int oneAmount = 0;
			for (int j = 0; j < matrix.length; j++) {

				if (matrix[i][j] == 1) {
					oneAmount++;
				}

			}

			if (maxOneInARow < oneAmount) {
				maxOneInARow = oneAmount;
			}
		}
		
		
		
		for (int i = 0; i < matrix.length; i++) {
			int oneAmount = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 1) {
					oneAmount++;
				}
			}
			if (oneAmount == maxOneInARow) {
				list.add(i);
			}
			
		}
		
		
		return list;

	}
	
	public static ArrayList<Integer> findLargestColumnIndex(int[][] matrix) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		int maxOneInARow = 0;

		for (int i = 0; i < matrix.length; i++) {
			int oneAmount = 0;
			for (int j = 0; j < matrix.length; j++) {

				if (matrix[j][i] == 1) {
					oneAmount++;
				}

			}

			if (maxOneInARow < oneAmount) {
				maxOneInARow = oneAmount;
			}
		}
		
		
		
		for (int i = 0; i < matrix.length; i++) {
			int oneAmount = 0;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[j][i] == 1) {
					oneAmount++;
				}
			}
			if (oneAmount == maxOneInARow) {
				list.add(i);
			}
			
		}
		
		
		return list;

	}


	public static int[][] createMatrix(int n) {

		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {

				int randomNum = (int) (Math.random() * 2);

				matrix[i][j] = randomNum;

			}
		}
		return matrix;

	}

}
