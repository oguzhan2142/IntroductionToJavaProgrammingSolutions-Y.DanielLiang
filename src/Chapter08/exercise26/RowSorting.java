package Chapter08.exercise26;

import java.util.Scanner;

public class RowSorting {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double[][] m = new double[3][3];
		System.out.println("Enter a 3-by-3 matrix row by row:");

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		double [][] sortedArray = sortRows(m);
		
		System.out.println("Original array:");
		printArray(m);
		System.out.println("Sorted array:");
		printArray(sortedArray);
		
		
		
	}
	
	public static void printArray(double[][] array){
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
	

	public static double[][] sortRows(double[][] m) {

		double[][] sortedArray = new double[m.length][m[0].length];

		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				sortedArray[i][j] = m[i][j];
			}
		}

		for (int i = 0; i < sortedArray.length; i++) {
			for (int j = 0; j < sortedArray[i].length; j++) {

				for (int k = 0; k < sortedArray[i].length - 1; k++) {

					if (sortedArray[i][k] > sortedArray[i][k + 1]) {

						double temp = sortedArray[i][k + 1];
						sortedArray[i][k + 1] = sortedArray[i][k];
						sortedArray[i][k] = temp;

					}

				}

			}
		}
		return sortedArray;
	}
}
