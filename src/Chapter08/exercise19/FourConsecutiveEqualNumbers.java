package Chapter08.exercise19;

import java.util.Scanner;

public class FourConsecutiveEqualNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter row number of array:");
		int row = scan.nextInt();
		System.out.println("enter column number of array:");
		int column = scan.nextInt();
		scan.close();

		int[][] array = new int[row][column];
		

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					int randomNumber = (int) (Math.random() * 4);
					array[i][j] = randomNumber;
				}
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.print(array[i][j] + " ");
				}
				
				System.out.println();
			}
			
			System.out.println(isConsecutiveFour(array));

		}


	public static boolean isConsecutiveFour(int[][] array) {

		if (isConsecutiveFourInAnyColumn(array) || isConsecutiveFourInAnyRows(array) || isConsecutiveFourInAnyDiagonal(array)) {

			return true;

		}
		return false;
	}

	public static boolean isConsecutiveFourInAnyRows(int[][] array) {

		boolean isThereConsecutiveFour = false;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length - 3; j++) {

				int checkedValue = array[i][j];
				if (array[i][j + 1] == checkedValue && array[i][j + 2] == checkedValue
						&& array[i][j + 3] == checkedValue) {

					isThereConsecutiveFour = true;

				}

			}

		}

		return isThereConsecutiveFour;
	}

	public static boolean isConsecutiveFourInAnyColumn(int[][] array) {

		boolean isThereConsecutiveFour = false;

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length - 3; j++) {

				int checkedValue = array[j][i];
				if (array[j + 1][i] == checkedValue && array[j + 2][i] == checkedValue
						&& array[j + 3][i] == checkedValue) {

					isThereConsecutiveFour = true;

				}

			}

		}

		return isThereConsecutiveFour;
	}

	public static boolean isConsecutiveFourInAnyDiagonal(int[][] array) {

		boolean isThereConsecutiveFour1 = false;
		boolean isThereConsecutiveFour2 = false;
		for (int j = 0; j < array.length - 3; j++) {

			int checkedValue = array[j][j];
			if (array[j + 1][j + 1] == checkedValue && array[j + 2][j + 2] == checkedValue
					&& array[j + 3][j + 3] == checkedValue) {
				isThereConsecutiveFour1 = true;

			}

		}
		
		for (int j = array.length - 4; j >= 0; j--) {

			int checkedValue = array[j][j];
			if (array[j + 1][j + 1] == checkedValue && array[j + 2][j + 2] == checkedValue
					&& array[j + 3][j + 3] == checkedValue) {
				isThereConsecutiveFour2 = true;

			}

		}

		return isThereConsecutiveFour1 || isThereConsecutiveFour2;
	}
}
