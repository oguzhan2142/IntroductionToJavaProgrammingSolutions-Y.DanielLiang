package Chapter10.exercise19;

import java.math.BigInteger;
import java.util.ArrayList;

public class MersennePrime {

	public static void main(String[] args) {

		ArrayList<Integer> mersennePrimes = new ArrayList<Integer>();

		int p = 2;
		while (p <= 100) {

			if (isMersenne(p)) {
				mersennePrimes.add(p);
			}

			p++;
		}

		for (Integer integer : mersennePrimes) {
			System.out.println(integer);
		}

	}

	public static boolean isMersenne(int number) {

		BigInteger asd = new BigInteger(Integer.toString((int) (Math.pow(2, number) - 1)));

		if (isPrime(number) && isPrime(asd)) {

			return true;

		}

		return false;
	}

	public static boolean isPrime(int number) {

		for (int divisor = 2; divisor < ((number / 2) + 1); divisor++) {

			if (number % divisor == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrime(BigInteger number) {

		for (BigInteger divisor = new BigInteger("2"); divisor.compareTo(number.divide(new BigInteger("2"))
				.add(new BigInteger("1"))) == -1; divisor = divisor.add(new BigInteger("1"))) {

			if (number.remainder(divisor).equals(new BigInteger("0"))) {
				return false;
			}

		}

		return true;

	}

}
