package Chapter08.exercise01;

import java.util.Scanner;

public class SumElementsColumnByColumn {

	public static void main(String[] args) {
		double [][] matrix = new double[3][4]; 
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matrix row by row:");
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		
		for (int i = 0; i < matrix[0].length; i++) {
			System.out.println("Sum of the elements at column " + i + " is " + sumColumn(matrix, i) );
		}
		
		
	}
	public static double sumColumn(double[][] m, int columnIndex) {
		
		double sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			sum += m[i][columnIndex];
		}
		
		return sum;
		
	}

}
