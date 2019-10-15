package Chapter07.exercise31;

import java.util.Scanner;

public class MergeTwoSortedLists {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter list1:");
		int list1Length = scan.nextInt();
		int[] list1 = new int[list1Length];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = scan.nextInt();
		}
		System.out.println("Enter list2:");
		int list2Length = scan.nextInt();
		int[] list2 = new int[list2Length];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = scan.nextInt();
		}
		scan.close();
		
		
		int[] mergedList = merge(list1, list2);

		for (int i = 0; i < mergedList.length; i++) {
			System.out.print(mergedList[i] + " ");
		}
		
	}

	public static int[] merge(int[] list1, int[] list2) {

		int[]mergedList = new int[list1.length + list2.length];
		
		
		for (int i = 0; i < list1.length; i++) {
			mergedList[i] = list1[i];
		}
		for (int i = list1.length; i <list1.length + list2.length; i++) {
			mergedList[i] = list2[i - list1.length];
		}
		
		for (int i = 0; i < mergedList.length - 1; i++) {
			for (int j = 0; j < mergedList.length - 1; j++) {
				if (mergedList[j] > mergedList[j + 1]) {
					int temp = mergedList[j + 1];
					mergedList[j+1] = mergedList[j];
					mergedList[j] = temp;
				}
			
			}
		}
		
		
		return mergedList;
		
	}

}
