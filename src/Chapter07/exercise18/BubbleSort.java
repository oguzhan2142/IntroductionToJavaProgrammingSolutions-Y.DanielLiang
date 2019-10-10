package Chapter07.exercise18;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("enter ten integer:");

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		for (int j = 0; j < array.length; j++) {

			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;

				}

			}

		}
		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
