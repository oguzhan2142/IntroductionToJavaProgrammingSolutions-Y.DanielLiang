package Chapter07.exercise10;

import java.util.Scanner;

public class FindTheIndexOfTheSmallestElement {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ten numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		scan.close();

		System.out.println("Smallest index is " + indexOfSmallestElement(array));
	}

	public static int indexOfSmallestElement(double[] array) {

		int smallestIndex = 0;

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length - 1; i++) {

				if (array[j] < array[i + 1]) {
					if (array[smallestIndex] == array[j]) {
						break;
					}
					smallestIndex = j;
				} else {
					break;
				}

			}
		}

		return smallestIndex;
	}

}
