package Chapter07.exercise19;

import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("enter ten integer:");

		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		
		System.out.println(isSorted(array));
		
		
		
		
		
	}

	public static boolean isSorted(int[] list) {

		for (int i = 0; i < list.length - 1; i++) {
			if (list[i] > list[i + 1]) {
				return false;
			}
		}

		return true;

	}
}
