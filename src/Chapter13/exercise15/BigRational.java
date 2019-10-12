package Chapter13.exercise15;

import java.math.BigInteger;

public class BigRational extends Number implements Comparable<BigRational> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigInteger numerator = new BigInteger("0");
	private BigInteger denominator = new BigInteger("1");

	public BigRational() {
	}

	public BigRational(BigInteger numerator, BigInteger denominator) {

		BigInteger gcd = gcd(numerator, denominator);

		this.numerator = numerator.divide(gcd);
		this.denominator = denominator.divide(gcd);

	}

	public static BigInteger gcd(BigInteger numerator, BigInteger denominator) {

		BigInteger gcd = new BigInteger("1");

		BigInteger divisor = new BigInteger("1");

		while ((divisor.compareTo(numerator) == -1 || divisor.compareTo(numerator) == 0)
				&& (divisor.compareTo(denominator) == -1 || divisor.compareTo(denominator) == 0)) {

			if (numerator.remainder(divisor).equals(new BigInteger("0"))
					&& denominator.remainder(divisor).equals(new BigInteger("0"))) {
				gcd = divisor;
			}

			divisor = divisor.add(new BigInteger("1"));
		}

		return gcd;
	}

	public BigRational add(BigRational secBigRat) {

		BigInteger n = numerator.multiply(secBigRat.getDenominator())
				.add(denominator.multiply(secBigRat.getNumerator()));
		BigInteger d = denominator.multiply(secBigRat.getDenominator());

		return new BigRational(n, d);
	}

	public BigRational subtract(BigRational secBigRat) {

		BigInteger n = numerator.multiply(secBigRat.getDenominator())
				.subtract((denominator.multiply(secBigRat.getNumerator())));
		BigInteger d = denominator.multiply(secBigRat.getDenominator());

		return new BigRational(n, d);
	}

	public BigRational multiply(BigRational secondRational) {

		BigInteger n = numerator.multiply(secondRational.numerator);
		BigInteger d = denominator.multiply(secondRational.denominator);

		return new BigRational(n, d);

	}

	public BigRational divide(BigRational secondRational) {

		BigInteger n = numerator.multiply(secondRational.getDenominator());
		BigInteger d = denominator.multiply(secondRational.getNumerator());

		return new BigRational(n, d);

	}

	@Override
	public String toString() {

		if (denominator.intValue() == 1) {
			return numerator.toString();
		} else {
			return numerator.toString() + "/" + denominator.toString();

		}

	}

	@Override
	public boolean equals(Object secBigRat) {

		if (this.subtract((BigRational) secBigRat).getNumerator().equals(new BigInteger("0"))) {
			return true;
		}

		return false;
	}

	@Override
	public int compareTo(BigRational o) {

		return this.subtract(o).getNumerator().compareTo(new BigInteger("0"));
	}

	public BigInteger getNumerator() {
		return numerator;
	}

	public BigInteger getDenominator() {
		return denominator;
	}

	@Override
	public int intValue() {
		return (int) doubleValue();
	}

	@Override
	public long longValue() {
		return (long) doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) doubleValue();
	}

	@Override
	public double doubleValue() {
		return (numerator.doubleValue() / denominator.doubleValue());
	}

}
