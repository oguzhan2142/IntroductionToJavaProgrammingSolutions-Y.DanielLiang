package Chapter08.exercise20;

import java.util.Scanner;

public class ConnectFour {

	public static void main(String[] args) {

		game();

	}

	public static void game() {

		char[][] gameBoard = new char[6][7];
		initializeGameBoard(gameBoard);
		boolean isGameContinue = true;
		Scanner scan = new Scanner(System.in);
		int column;

		while (isGameContinue) {

			System.out.println("Drop a yellow disk at column (0–6):");
			column = scan.nextInt();
			yellowPlayerPlayed(gameBoard, column);
			displayGameBoard(gameBoard);
			isGameContinue = !isYellowPlayerWon(gameBoard);
			if (isYellowPlayerWon(gameBoard)) {
				System.out.println("yellow player won");
				continue;
			}
			System.out.println("Drop a red disk at column (0–6):");
			column = scan.nextInt();
			redPlayerPlayed(gameBoard, column);
			displayGameBoard(gameBoard);
			isGameContinue = !isRedPlayerWon(gameBoard);
			if (isRedPlayerWon(gameBoard)) {
				System.out.println("Red player won");
				continue;
			}
		}

		scan.close();
	}

	public static boolean isRedPlayerWon(char[][] gameBoard) {

		boolean isAnySameFourColorInARow = false;
		boolean isAnySameFourColorInAColumn = false;
		boolean isAnySameFourColorInADiagonal = false;

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length - 3; j++) {
				if (gameBoard[i][j] == 'R' && gameBoard[i][j + 1] == 'R' && gameBoard[i][j + 2] == 'R'
						&& gameBoard[i][j + 3] == 'R') {
					isAnySameFourColorInARow = true;
				}

			}
		}
		for (int i = 0; i < gameBoard.length ; i++) {
			for (int j = 0; j < gameBoard[i].length - 4; j++) {
				if (gameBoard[j][i] == 'R' && gameBoard[j + 1][i] == 'R' && gameBoard[j + 2][i] == 'R'
						&& gameBoard[j + 3][i] == 'R') {
					isAnySameFourColorInAColumn = true;
				}

			}
		}
		
		for (int i = 0; i < gameBoard.length - 3; i++) {
			if (gameBoard[i][i] == 'R' && gameBoard[i+ 1][i+ 1] == 'R' && gameBoard[i+2][i+2] == 'R' && gameBoard[i+3][i+3] == 'R') {
				isAnySameFourColorInADiagonal = true;
			}
		}

		return isAnySameFourColorInAColumn || isAnySameFourColorInARow || isAnySameFourColorInADiagonal;

	}
	public static boolean isYellowPlayerWon(char[][] gameBoard) {

		boolean isAnySameFourColorInARow = false;
		boolean isAnySameFourColorInAColumn = false;
		boolean isAnySameFourColorInADiagonal = false;

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length - 3; j++) {
				if (gameBoard[i][j] == 'Y' && gameBoard[i][j + 1] == 'Y' && gameBoard[i][j + 2] == 'Y'
						&& gameBoard[i][j + 3] == 'Y') {
					isAnySameFourColorInARow = true;
				}

			}
		}
		for (int i = 0; i < gameBoard.length ; i++) {
			for (int j = 0; j < gameBoard[i].length - 4; j++) {
				if (gameBoard[j][i] == 'Y' && gameBoard[j + 1][i] == 'Y' && gameBoard[j + 2][i] == 'Y'
						&& gameBoard[j + 3][i] == 'Y') {
					isAnySameFourColorInAColumn = true;
				}

			}
		}
		
		for (int i = 0; i < gameBoard.length - 3; i++) {
			if (gameBoard[i][i] == 'R' && gameBoard[i+ 1][i+ 1] == 'R' && gameBoard[i+2][i+2] == 'R' && gameBoard[i+3][i+3] == 'R') {
				isAnySameFourColorInADiagonal = true;
			}
		}

		return isAnySameFourColorInAColumn || isAnySameFourColorInARow || isAnySameFourColorInADiagonal;

	}

	public static void yellowPlayerPlayed(char[][] gameBoard, int choise) {

		int avaibleRow = giveEmptyRow(gameBoard, choise);
		gameBoard[avaibleRow][choise] = 'Y';

	}

	public static void redPlayerPlayed(char[][] gameBoard, int choise) {

		int avaibleRow = giveEmptyRow(gameBoard, choise);
		gameBoard[avaibleRow][choise] = 'R';

	}

	public static int giveEmptyRow(char[][] gameBoard, int column) {

		for (int i = gameBoard.length - 1; i >= 0; i--) {

			if (gameBoard[i][column] == ' ') {
				return i;
			}

		}
		return -1;

	}

	public static void initializeGameBoard(char[][] gameBoard) {

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {
				gameBoard[i][j] = ' ';
			}
		}

	}

	public static void displayGameBoard(char[][] gameBoard) {

		for (int i = 0; i < gameBoard.length; i++) {
			for (int j = 0; j < gameBoard[i].length; j++) {

				System.out.print("|" + gameBoard[i][j] + "|");
			}
			System.out.println();
		}

	}
}
