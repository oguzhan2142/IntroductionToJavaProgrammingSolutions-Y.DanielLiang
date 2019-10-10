package Chapter07.exercise09;

import java.util.Scanner;

public class FindTheSmallestElement {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ten numbers: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		scan.close();
		System.out.println("The minimum number is " + min(array));

	}

	public static double min(double[] array) {

		for (int i = 0; i < array.length - 1; i++) {

			if (array[i] < array[i + 1]) {
				double temp = array[i + 1];
				array[i + 1] = array[i];
				array[i] = temp;

			}

		}

		return array[array.length - 1];
	}

}
