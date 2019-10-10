package Chapter10.exercise16;

import java.math.BigInteger;

public class Divisible2or3 {

	public static void main(String[] args) {

		String value = "1";

		for (int i = 0; i < 49; i++) {
			value += "0";
		}

		BigInteger dividedBigInteger = new BigInteger(value);

		BigInteger[] divisibleBigIntegers = new BigInteger[10];

		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger zero = new BigInteger("0");

		int index = 0;
		while (index <= divisibleBigIntegers.length - 1) {

			if (dividedBigInteger.remainder(two).equals(zero) || dividedBigInteger.remainder(three).equals(zero)) {
				divisibleBigIntegers[index++] = dividedBigInteger;
				dividedBigInteger = dividedBigInteger.add(new BigInteger("1"));
			}

			dividedBigInteger = dividedBigInteger.add(new BigInteger("1"));

		}

		for (int i = 0; i < divisibleBigIntegers.length; i++) {
			System.out.println(divisibleBigIntegers[i]);
		}

	}

}
