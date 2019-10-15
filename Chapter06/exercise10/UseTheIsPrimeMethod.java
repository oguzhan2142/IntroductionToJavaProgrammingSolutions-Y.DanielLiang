package Chapter06.exercise10;

public class UseTheIsPrimeMethod {

	public static void main(String[] args) {

		for (int number = 2; number < 10000; number++) {

			if (isPrime(number)) {
				System.out.println(number);
			}

		}

	}

	public static boolean isPrime(int number) {
		for (int divisor = 2; divisor <= number / 2; divisor++) {

			if (number % divisor == 0) {
				return false;
			}
		}

		return true; // Number is prime 40 }
	}
}