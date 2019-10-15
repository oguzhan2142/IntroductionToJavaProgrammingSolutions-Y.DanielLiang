package Chapter07.exercise28;

import java.util.Scanner;

public class Combinations {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ten integer:");
		int[] number = new int[10];

		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		scan.close();

		displayCombination(number);

	}

	public static void displayCombination(int[] number) {

		for (int i = 0; i < number.length; i++) {
			for (int j = i ; j < number.length; j++) {
				System.out.println("(" + number[i] + "," + number[j] + ")");
			}
		}

	}

}
