package Chapter06.exercise26;

public class PalindromicPrime {

	public static void main(String[] args) {

		printNumbers(100);

	}

	public static void printNumbers(int n) {

		int counter = 1;
		int number = 2;

		while (counter <= n) {

			if (isPalindrome(number) && isPrime(number)) {
				System.out.print(number + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}

			}

			number++;
		}

	}

	public static boolean isPalindrome(int num) {

		String numToStr = Integer.toString(num);

		for (int i = 0; i < numToStr.length(); i++) {

			if (numToStr.charAt(i) != numToStr.charAt(numToStr.length() - i - 1)) {
				return false;
			}

		}
		return true;

	}

	public static boolean isPrime(int num) {

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;

	}

}
