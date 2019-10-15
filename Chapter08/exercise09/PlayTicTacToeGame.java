package Chapter08.exercise09;

import java.util.Scanner;

public class PlayTicTacToeGame {

	public static void main(String[] args) {

		game();

	}

	public static void game() {

		boolean isGameOver = false;
		boolean[][] playerX = new boolean[3][3];
		boolean[][] playerO = new boolean[3][3];

		Scanner scan = new Scanner(System.in);
		while (!isGameOver) {
			
			int row ;
			int column;
			
			do {

				System.out.println("Enter a row (0, 1, or 2) for player X:");
				row = scan.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player X");
				column = scan.nextInt();

				if (isSpotEmpty(playerX, row, column)) {
					playerX[row][column] = true;
				}
				if (!playerX[row][column]) {
					System.err.println("point is not empty");
				}
			} while (!playerX[row][column]);
			
			printGameTable(playerX, playerO);
			isGameOver = isWin(playerX);
			if (isGameOver) {
				System.out.println("player X wins");
				continue;
			}
			
			do {
				System.out.println("Enter a row (0, 1, or 2) for player O:");
				row = scan.nextInt();
				System.out.println("Enter a column (0, 1, or 2) for player O");
				column = scan.nextInt();
				if (isSpotEmpty(playerO, row, column) && isSpotEmpty(playerX, row, column)) {
					playerO[row][column] = true;
				}
				if (!playerO[row][column]) {
					System.err.println("point is not empty");
				}
				
			} while (!playerO[row][column]);
			

			printGameTable(playerX, playerO);
			isGameOver = isWin(playerO);
			if (isGameOver) {
				System.out.println("player O wins");
				continue;
			}

		}
		scan.close();

	}

	public static boolean isWin(boolean player[][]) {

		boolean result = true;

		for (int i = 0; i < player.length; i++) {

			result = result && player[i][i];

		}
		if (result) {
			return result;
		}
		
		result = true;
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player.length; j++) {
				result = result && player[i][j];
			}
			if (result) {
				return result;
			}
			result = true;
		}
		
		for (int i = 0; i < player.length; i++) {
			for (int j = 0; j < player.length; j++) {
				result = result && player[j][i];
			}
			if (result) {
				return result;
			}
			result = true;
		}

		return false;

	}

	public static boolean isSpotEmpty(boolean[][] player, int row, int column) {

		if (player[row][column] == false) {
			return true;
		}
		return false;

	}

	public static void printGameTable(boolean playerX[][], boolean playerO[][]) {

		for (int i = 0; i < playerO.length; i++) {
			System.out.println("-------------");
			System.out.print("|");

			for (int j = 0; j < playerO.length; j++) {
				if (playerX[i][j]) {
					System.out.print(" X |");
				} else if (playerO[i][j]) {
					System.out.print(" O |");
				} else {
					System.out.print("   |");
				}

			}
			System.out.println();
		}
		System.out.println("-------------");

	}

}
