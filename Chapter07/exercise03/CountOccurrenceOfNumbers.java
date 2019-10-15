package Chapter07.exercise03;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {

	public static void main(String[] args) {

		System.out.println("Enter the integers between 1 and 100:");

		Scanner scan = new Scanner(System.in);

		int[] num = new int[100];

		num[0] = scan.nextInt();
		int i = 0;
		while (num[i] != 0) {
			num[++i] = scan.nextInt();
			if (num[i] >= 100 || num[i] < 0) {
				System.err.println("invalid input");
				System.exit(0);
			}

		}
		scan.close();
		int counter = 0;
		for (int j = 0; j < num.length; j++) {
			int selectedNum = num[j];
			if (selectedNum == 0) {
				break;
			}
			for (int l = 0; l < num.length; l++) {
				if (selectedNum == num[l]) {
					counter++;
				}

			}
			if (counter == 1) {
				System.out.println(selectedNum + " occurs 1 time");
			} else {
				System.out.println(selectedNum + " occurs " + counter + " times");
			}
			counter = 0;
		}

	}

}
