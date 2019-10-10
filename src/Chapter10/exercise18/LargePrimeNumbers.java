package Chapter10.exercise18;

import java.math.BigInteger;

public class LargePrimeNumbers {

	public static void main(String[] args) {

		BigInteger number = new BigInteger(Long.toString(Long.MAX_VALUE));
		number = number.add(new BigInteger("1"));

		BigInteger[] primeNumber = new BigInteger[5];

		BigInteger divisor = new BigInteger("2");
		int index = 0;
		while (index < primeNumber.length) {

			boolean isPrime = true;

			while (divisor.compareTo(number.divide(new BigInteger("2"))) == -1) {

				if (number.remainder(divisor).equals(new BigInteger("0"))) {
					isPrime = false;
				}

				divisor = divisor.add(new BigInteger("1"));
			}

			if (isPrime) {
				primeNumber[index++] = number;
			}

		}

		for (int i = 0; i < primeNumber.length; i++) {
			System.out.println(primeNumber[i]);
		}

	}

}
