package Chapter06.exercise31;

import java.util.Scanner;

public class CreditCardNumberValidation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter your card number:");
		long getNum = scan.nextLong();
		scan.close();
		
		if (isValid(getNum)) {
			System.out.println(getNum + " is valid");
		}else {
			System.out.println(getNum + " is invalid");

		}
		
		
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {

		boolean isSumOfOddAndEvenOK = false;
		boolean isLengthOk = false;
		boolean isStartedWithValidNum = false;
		int sum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);

		if (sum % 10 == 0) {
			isSumOfOddAndEvenOK = true;
			;
		} else {
			isSumOfOddAndEvenOK = false;
		}

		if (getSize(number) >= 13 && getSize(number) <= 16) {
			isLengthOk = true;
		} else {
			isLengthOk = false;
		}

		if (getPrefix(number, 1) == 4 || getPrefix(number, 1) == 5 || getPrefix(number, 6) == 4
				|| getPrefix(number, 2) == 37) {
			isStartedWithValidNum = true;
		} else {
			isStartedWithValidNum = false;
		}

		return isLengthOk && isStartedWithValidNum && isSumOfOddAndEvenOK;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {

		String str = Long.toString(number);
		int sumOfEvenPlace = 0;

		for (int i = str.length() - 2; i >= 0; i -= 2) {

			String toInt = "";
			toInt += str.charAt(i);
			int add = Integer.parseInt(toInt);
			sumOfEvenPlace += getDigit(add);

		}

		return sumOfEvenPlace;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */

	// double it if its two digits sum of two digits
	public static int getDigit(int number) {

		number *= 2;

		if (number > 9) {

			String toStr = Integer.toString(number);
			String getDigit1 = "";
			String getDigit2 = "";
			getDigit1 += toStr.charAt(0);
			getDigit2 += toStr.charAt(1);
			int digit1 = Integer.parseInt(getDigit1);
			int digit2 = Integer.parseInt(getDigit2);

			return digit1 + digit2;

		} else {

			return number;

		}

	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {

		String str = Long.toString(number);
		int sumOfOddPlace = 0;

		for (int i = str.length() - 1; i >= 0; i -= 2) {

			String toInt = "";
			toInt += str.charAt(i);
			int add = Integer.parseInt(toInt);
			sumOfOddPlace += add;

		}

		return sumOfOddPlace;

	}

	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {

		String dStr = Integer.toString(d);
		String numStr = Long.toString(number);

		for (int i = 0; i < dStr.length(); i++) {
			if (dStr.charAt(i) != numStr.charAt(i)) {
				return false;
			}

		}

		return true;
	}

	/** Return the number of digits in d */
	public static int getSize(long d) {

		String toStr = Long.toString(d);

		return toStr.length();

	}

	/**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {

		String toStr = Long.toString(number);
		String getDigits = "";

		for (int i = 0; i < k; i++) {
			getDigits += toStr.charAt(i);
		}

		long prefixNum = Long.parseLong(getDigits);

		return prefixNum;
	}
}
