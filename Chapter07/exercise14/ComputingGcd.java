package Chapter07.exercise14;

import java.util.Scanner;

public class ComputingGcd {

	public static void main(String[] args) {
		int[] array = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter an array: ");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextInt();
		}
		scan.close();

		System.out.println("gcd is " + gcd(array));

	}

	public static int gcd(int... numbers) {

		int gcd = 0;
		boolean isGcd = true;
		int numbersMax = 0;

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > numbersMax) {
				numbersMax = numbers[i];

			}

		}

		for (int divisor = 1; divisor <= numbersMax; divisor++) {

			isGcd = true;

			for (int index = 0; index < numbers.length; index++) {

				if (numbers[index] % divisor != 0) {
					isGcd = false;
				}

			}
			if (isGcd) {
				gcd = divisor;
			}

		}

		return gcd;

	}
}
