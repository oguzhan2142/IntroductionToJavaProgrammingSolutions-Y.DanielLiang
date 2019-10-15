package Chapter05.exercise33;

public class PerfectNumber {

	public static void main(String[] args) {

		boolean isPerfectNum = false;

		for (int number = 1; number < 10000; number++) {

			int divisorSum = 0;
			int divisor = 1;
			while (divisor < number) {

				if (number % divisor == 0) {
					divisorSum += divisor;
				}

				divisor++;

			}

			if (divisorSum == number) {
				isPerfectNum = true;
			}

			if (isPerfectNum) {
				System.out.println(number + " ");
			}

			isPerfectNum = false;
		}

	}
}
