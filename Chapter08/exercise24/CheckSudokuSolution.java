package Chapter08.exercise24;

import java.util.Scanner;

public class CheckSudokuSolution {

	public static void main(String[] args) {

		int[][] sudoku = new int[9][9];

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter sudoku solution");
		
		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				sudoku[i][j] = scan.nextInt();
			}
		}
		scan.close();
		
		
		
		printSudoku(sudoku);

		
		if (isSolutionCorrect(sudoku)) {
			System.out.println("solution correct");
		}else {
			System.out.println("Solution not correct");
		}
		
		
	}

	public static void printSudoku(int[][] sudoku) {

		for (int i = 0; i < sudoku.length; i++) {
			for (int j = 0; j < sudoku[i].length; j++) {
				System.out.print(sudoku[i][j] + " ");

			}
			System.out.println();
		}

	}

	public static boolean isSolutionCorrect(int[][] sudoku) {

		return isAllColumnOk(sudoku) && isAllRowOK(sudoku) && isAllSmallBoxOK(sudoku);

	}

	public static boolean isAllSmallBoxOK(int[][] sudoku) {

		for (int smallBoxNumber = 1; smallBoxNumber < sudoku.length + 1; smallBoxNumber++) {
			for (int number = 1; number < sudoku.length + 1; number++) {

				if (!isNumberInSmallBox(sudoku, smallBoxNumber, number)) {
					return false;
				}
			}

		}

		return true;
	}

	public static boolean isAllColumnOk(int[][] sudoku) {
		
		for (int i = 0; i < sudoku.length; i++) {
			for (int number = 1; number < sudoku.length + 1; number++) {
				
				if (!isNumberInColumn(sudoku, i, number)) {
					return false;
				}
				
			}
		}
		
		return true;
		
	}
	
	public static boolean isAllRowOK(int[][] sudoku) {
		
		for (int j = 0; j < sudoku.length; j++) {
			
			for (int number = 0; number < sudoku[j].length; number++) {
				
				if (!isNumberInRow(sudoku[j], (number + 1))) {
					return false;
					
				}
				
			}
		}
		return true;
	}
	public static boolean isNumberInSmallBox(int[][] sudoku, int smallBoxNumber, int number) {

		int smallBoxRowIndex = 0;
		int smallBoxColumnIndex = 0;

		switch (smallBoxNumber) {
		case 1:
			smallBoxRowIndex = 0;
			smallBoxColumnIndex = 0;
			break;
		case 2:
			smallBoxRowIndex = 3;
			smallBoxColumnIndex = 0;
			break;
		case 3:
			smallBoxRowIndex = 6;
			smallBoxColumnIndex = 0;
			break;
		case 4:
			smallBoxRowIndex = 0;
			smallBoxColumnIndex = 3;
			break;
		case 5:
			smallBoxRowIndex = 3;
			smallBoxColumnIndex = 6;
			break;
		case 6:
			smallBoxRowIndex = 6;
			smallBoxColumnIndex = 6;
			break;
		case 7:
			smallBoxRowIndex = 0;
			smallBoxColumnIndex = 6;
			break;
		case 8:
			smallBoxRowIndex = 3;
			smallBoxColumnIndex = 6;
			break;
		case 9:
			smallBoxRowIndex = 6;
			smallBoxColumnIndex = 6;
			break;
		default:
			break;
		}

		for (int k = smallBoxRowIndex; k < smallBoxRowIndex + 3; k++) {
			for (int m = smallBoxColumnIndex; m < smallBoxColumnIndex + 3; m++) {
				if (sudoku[k][m] == number) {
					return true;
				}
			}
		}

		return false;
	}


	public static boolean isNumberInColumn(int[][] sudokuArray, int column, int number) {

		for (int j = 0; j < sudokuArray.length; j++) {

			if (sudokuArray[j][column] == number) {
				return true;
			}

		}

		return false;
	}

	public static boolean isNumberInRow(int[] array, int number) {

		for (int i = 0; i < array.length; i++) {
			if (number == array[i]) {
				return true;
			}
		}

		return false;

	}

}
