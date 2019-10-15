package Chapter06.exercise02;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {

	public static void main(String[] args) {

		System.out.println("Enter an integer:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();

		System.out.println(sumDigits(number));

	}

	public static int sumDigits(long n) {

		int sum = 0;

		do {
			sum += (n % 10);
			n /= 10;

		} while (n != 0);

		return sum;
	}

}
