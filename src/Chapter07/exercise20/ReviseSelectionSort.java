package Chapter07.exercise20;

import java.util.Scanner;

public class ReviseSelectionSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter ten integer:");

		double[] array = new double[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		scan.close();

		selectionSort(array);

		for (double i : array) {
			System.out.print(i + " ");
		}
	}

	public static void selectionSort(double[] array) {

		for (int i = 0; i < array.length; i++) {

			double currentMin = array[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < array.length; j++) {

				if (currentMin > array[j]) {
					currentMin = array[j];
					currentMinIndex = j;

				}

			}
			if (currentMinIndex != i) {
				array[currentMinIndex] = array[i];
				array[i] = currentMin;
			}

		}

	}

}
