package Chapter08.exercise29;

import java.util.Scanner;

public class IdenticalArrays {

	public static void main(String[] args) {

		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3];

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter list1: ");
		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter list2: ");
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				m2[i][j] = scan.nextInt();
			}
		}

		scan.close();
		if (equals(m1, m2)) {
			System.out.println("Two arrays are identical");
		} else {
			System.out.println("Two arrays are not identical");
		}

	}

	public static boolean equals(int[][] m1, int[][] m2) {

		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m2[i].length; j++) {
				if (!isNumberInArray(m2, m1[i][j])) {
					return false;
				}
			}
		}
		return true;

	}

	public static boolean isNumberInArray(int[][] array, int number) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (number == array[i][j]) {
					return true;
				}
			}
		}

		return false;
	}

}
