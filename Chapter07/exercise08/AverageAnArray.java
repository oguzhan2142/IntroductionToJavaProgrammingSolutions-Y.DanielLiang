package Chapter07.exercise08;

import java.util.Scanner;

public class AverageAnArray {

	public static void main(String[] args) {
		
		double[] array = new double[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ten double values:");
		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
			
		}
		scan.close();
		
		System.out.println(average(array));
		
		

	}

	public static int average(int[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}

	public static double average(double[] array) {

		double sum = 0;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		return sum / array.length;

	}
}
