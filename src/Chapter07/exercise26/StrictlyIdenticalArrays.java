package Chapter07.exercise26;

import java.util.Scanner;

public class StrictlyIdenticalArrays {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array1 = new int[6];
		int[] array2 = new int[6];
		System.out.println("Enter first array:");
		for (int i = 0; i < array1.length; i++) {
			array1[i] = scan.nextInt();
		}
		System.out.println("Enter second array");
		for (int i = 0; i < array2.length; i++) {
			array2[i] = scan.nextInt();
		}
		scan.close();
		
		if (equals(array1, array2)) {
			System.out.println("Two lists are strictly identical");
		}else {
			System.out.println("Two lists are not strictly identical");
		}
		

	}

	public static boolean equals(int[] list1, int[] list2) {

		if (list1.length != list2.length) {
			return false;
		}
		for (int i = 0; i < list2.length; i++) {
			if (list1[i] != list2[i]) {
				return false;
			}
		}
		return true;

	}

}
