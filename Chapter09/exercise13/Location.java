package Chapter09.exercise13;

import java.util.Scanner;

public class Location {

	public int row;
	public int column;
	public double maxValue;
	
	public Location() {
		
		
		
	}
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}

	public int getRow() {
		return row;
	}
	public int getColumn() {
		return column;
	}
	public double getMaxValue() {
		
		return maxValue;
	}
	
	public static Location locateLargest(double[][] a) {

		double maxValue = a[0][0];
		int maxValueRow = 0;
		int maxValueColumn = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] > maxValue) {

					maxValue = a[i][j];
					maxValueRow = i;
					maxValueColumn = j;

				}

			}
		}

		return new Location(maxValueRow, maxValueColumn, maxValue);

	}
	
	
	
	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of rows and columns in array:");
		int row  = scan.nextInt();
		int column = scan.nextInt();
		
		System.out.println("enter array:");
		
		double [][] test = new double [row][column]; 
		
		for (int i = 0; i < test.length; i++) {
			for (int j = 0; j < test[i].length; j++) {
				test[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		
		Location location = new Location();
		
		location = Location.locateLargest(test);
		
		System.out.println("The location of the largest element is " + location.getMaxValue() + " at (" + location.getRow() + "," + location.getColumn() + ")");
		
	}
	
	
	

}
