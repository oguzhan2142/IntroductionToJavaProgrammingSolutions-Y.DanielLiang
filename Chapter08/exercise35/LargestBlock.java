package Chapter08.exercise35;

import java.util.Scanner;

public class LargestBlock {

	public static void main(String[] args) {

		System.out.println("Enter the number of rows in the matrix:");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		scan.close();

		int[][] block = new int[size][size];

		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length; j++) {
				block[i][j] = (int) (Math.random() * 2);
			}
		}

		for (int i = 0; i < block.length; i++) {
			for (int j = 0; j < block[i].length; j++) {
				System.out.print(block[i][j] + " ");
			}
			System.out.println();
		}

		int[] information = findLargestBlock(block);

		System.out.println(information[0]);
		System.out.println(information[1]);
		System.out.println(information[2]);

	}

	public static boolean isThereABlock(int[][] m, int row) {

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < row; j++) {

				if (m[i][j] != 1) {
					return false;
				}

			}
		}
		return true;

	}

	public static int[] findLargestBlock(int[][] m) {

		int[] largestBlock = new int[3];

		for (int row = m.length -1; row >= 0 ; row--) {

			if (isThereABlock(m, row)) {
			}
		}

		return null;
	}

}
