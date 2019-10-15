package Chapter07.exercise32;

import java.util.Scanner;

public class PartitionOfAList {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter list:");
		int listLength = scan.nextInt();
		int[] list = new int[listLength];
		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		scan.close();

		System.out.println("After the partition, the list is ");
		partition(list);
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}

	}

	public static int partition(int[] list) {
		int pivotIndex = 0;
		boolean continueLoop = true;

		while (continueLoop) {

			for (int i = 0; i < list.length - 1; i++) {
				int pivot = list[pivotIndex];
				if (pivot > list[i + 1]) {
					int temp = list[i + 1];
					list[i + 1] = list[pivotIndex];
					list[pivotIndex] = temp;
					pivotIndex = i + 1;

				}
			}
			int firstPivotIndex = pivotIndex;
			for (int i = list.length - 1; i >= 0; i--) {
				int pivot = list[pivotIndex];
				if (pivot < list[i]) {
					int temp = list[i];
					list[i] = list[pivotIndex];
					list[pivotIndex] = temp;
					pivotIndex = i;

				}
			}
			int secondPivotIndex = pivotIndex;

			continueLoop = firstPivotIndex != secondPivotIndex;
					
			
		}

		return pivotIndex;
	}

}
