package Chapter07.exercise05;

import java.util.Scanner;

public class PrintDistinctNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] number = new int[10];
		int numOfDistincNum = 0;

		for (int i = 0; i < number.length; i++) {

			int takeNum = scan.nextInt();
			boolean isInArray = false;
			for (int j = 0; j < number.length; j++) {

				if (takeNum == number[j]) {
					isInArray = true;
				}

			}
			if (isInArray) {
				continue;
			} else {

				number[i] = takeNum;
				numOfDistincNum++;
			}

		}
		scan.close();

		

		System.out.println("The number of distinct number is " + numOfDistincNum);
		System.out.println("The distinct numbers are: ");
		for (int i = 0; i < number.length; i++) {
			if (number[i] != 0) {
				System.out.print(number[i] + " ");
			}
		}

	}

}
