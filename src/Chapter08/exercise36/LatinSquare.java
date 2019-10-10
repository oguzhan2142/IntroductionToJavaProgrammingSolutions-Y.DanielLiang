package Chapter08.exercise36;

import java.util.Scanner;

public class LatinSquare {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number n:");
		int sizeOfArray = scan.nextInt();

		char[][] latinSquare = new char[sizeOfArray][sizeOfArray];

		for (int i = 0; i < latinSquare.length; i++) {
			for (int j = 0; j < latinSquare[i].length; j++) {
				latinSquare[i][j] = scan.next().charAt(0);
			}
		}
		scan.close();

		if (!isInputsValid(latinSquare)) {
			System.err.println("Invalid input");
		}

		displayLatinSquare(latinSquare);

		if (isColumnOk(latinSquare) && isRowsOk(latinSquare)) {
			System.out.println("The input array is latin square");
		} else {
			System.out.println("Wrong input letters must be from A to " +(char)('A' + sizeOfArray - 1));
		}

	}

	public static boolean isColumnOk(char[][] m) {

		char[] validCharacter = new char[m.length];

		for (int i = 0; i < validCharacter.length; i++) {

			validCharacter[i] = (char) ('A' + i);
		}

		for (int columnNum = 0; columnNum < m[0].length; columnNum++) {

			for (int i = 0; i < validCharacter.length; i++) {

				if (!isCharacterInColumn(m, columnNum, validCharacter[i])) {
					return false;
				}

			}

		}

		return true;

	}

	public static boolean isCharacterInColumn(char[][] m, int columnNum, char c) {

		for (int j = 0; j < m.length; j++) {
			if (m[columnNum][j] == c) {
				return true;
			}
		}

		return false;

	}

	public static boolean isRowsOk(char[][] m) {

		char[] validCharacter = new char[m.length];

		for (int i = 0; i < validCharacter.length; i++) {

			validCharacter[i] = (char) ('A' + i);
		}

		for (int rowNum = 0; rowNum < m[0].length; rowNum++) {

			for (int i = 0; i < validCharacter.length; i++) {

				if (!isCharacterInRow(m, rowNum, validCharacter[i])) {
					return false;
				}

			}

		}

		return true;

	}

	public static boolean isCharacterInRow(char[][] m, int rowNumber, char c) {

		for (int j = 0; j < m.length; j++) {
			if (m[j][rowNumber] == c) {
				return true;
			}
		}

		return false;
	}

	public static void displayLatinSquare(char[][] m) {

		System.out.println("\n\n");
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isInputsValid(char[][] latinSquare) {

		char[] validCharacter = new char[latinSquare.length];

		for (int i = 0; i < validCharacter.length; i++) {

			validCharacter[i] = (char) ('A' + i);
		}

		for (int i = 0; i < validCharacter.length; i++) {
			for (int j = 0; j < validCharacter.length; j++) {

				for (int p = 0; p < validCharacter.length; p++) {

					if (!isCharacterInArray(latinSquare, validCharacter[p])) {
						return false;
					}

				}

			}
		}

		return true;
	}

	public static boolean isCharacterInArray(char[][] m, char c) {

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {

				if (m[i][j] == c) {
					return true;
				}

			}
		}
		return false;

	}

}
