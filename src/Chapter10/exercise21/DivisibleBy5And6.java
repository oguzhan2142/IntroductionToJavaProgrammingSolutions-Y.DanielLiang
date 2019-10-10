package Chapter10.exercise21;

import java.math.BigInteger;

public class DivisibleBy5And6 {

	public static void main(String[] args) {

		BigInteger x = new BigInteger(Long.toString(Long.MAX_VALUE)).add(new BigInteger("1"));
		BigInteger[] divisibleNumbers = new BigInteger[10];

		int index = 0;

		while (index < divisibleNumbers.length) {

			if (isDivisibleWithBigInteger(x, 5) || isDivisibleWithBigInteger(x, 6)) {
				divisibleNumbers[index++] = x;
				x = x.add(new BigInteger("1"));

			} else {
				x = x.add(new BigInteger("1"));
			}

		}

		for (int i = 0; i < divisibleNumbers.length; i++) {

			System.out.println(divisibleNumbers[i]);
		}

	}

	public static boolean isDivisibleWithBigInteger(BigInteger bigInteger, int divisor) {

		if (bigInteger.remainder(new BigInteger(Integer.toString(divisor))).equals(new BigInteger("0"))) {

			return true;

		}
		return false;

	}

}
