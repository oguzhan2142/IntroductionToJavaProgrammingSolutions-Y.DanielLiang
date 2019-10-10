package Chapter07.exercise15;

import java.util.Scanner;

public class EliminateDuplicates {

	public static void main(String[] args) {

		int[] array = new int[10];

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		for (int i : eliminateDuplicates(array)) {
			System.out.print(i + " ");
		}

	}

	public static int[] eliminateDuplicates(int[] list) {

		int[] distinct = new int[list.length];
		boolean isInNewArray = false;
		int returnArraySize = 0;
		for (int i = 0; i < distinct.length; i++) {

			isInNewArray = false;
			for (int j = 0; j < distinct.length; j++) {

				if (list[i] == distinct[j]) {
					isInNewArray = true;
				}
			}

			if (!isInNewArray) {
				distinct[returnArraySize] = list[i];
				returnArraySize++;
			}

		}

		int[] returnArray = new int[returnArraySize];
		for (int i = 0; i < returnArraySize; i++) {
			returnArray[i] = distinct[i];
		}

		return returnArray;

	}

}
