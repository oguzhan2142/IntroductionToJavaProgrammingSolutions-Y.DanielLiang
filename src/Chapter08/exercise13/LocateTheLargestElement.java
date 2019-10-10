package Chapter08.exercise13;

import java.util.Scanner;

public class LocateTheLargestElement {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows and columns of the array:");

		int row = scan.nextInt();
		int column = scan.nextInt();

		double[][] takenArray = new double[row][column];

		System.out.println("Enter the array:");

		for (int i = 0; i < takenArray.length; i++) {
			for (int j = 0; j < takenArray[i].length; j++) {
				takenArray[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		int [] array = locateLargest(takenArray);
		

		System.out.println("The location of the largest element is at " + array[0] +","+ array[1]);

	}

	public static int[] locateLargest(double[][] a) {

		int[] largestRowAndColumn = {0,0};
		double largestElement = a[largestRowAndColumn[0]][largestRowAndColumn[1]]; 
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length ; j++) {

				if (a[i][j] > largestElement) {
					largestRowAndColumn[0] = i;
					largestRowAndColumn[1] = j;
					largestElement = a[i][j];
				}

			}
		}

		return largestRowAndColumn;

	}

}
