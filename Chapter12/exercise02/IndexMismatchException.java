package Chapter12.exercise02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IndexMismatchException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean continueInput = true;
		int num1 = 0;
		int num2 = 0;

		do {

			try {

				System.out.println("Enter two integers:");
				num1 = scan.nextInt();
				num2 = scan.nextInt();
				continueInput = false;

			} catch (InputMismatchException ex) {

				System.out.println("Incorrect input");
				scan.nextLine();

			}

		} while (continueInput);

		scan.close();
		System.out.println("sum of " + num1 + "+" + num2 + "=" + (num1 + num2));

	}

}
