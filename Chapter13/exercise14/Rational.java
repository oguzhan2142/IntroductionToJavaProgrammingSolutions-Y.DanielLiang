package Chapter13.exercise14;

public class Rational extends Number implements Comparable<Rational> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long[] r = new long[2];

	public Rational() {

		r[0] = 0;
		r[1] = 1;

	}

	public Rational(long numerator, long denominator) {

		long gcd = gcd(numerator, denominator);

		r[0] = (denominator > 0 ? 1 : -1) * numerator / gcd;
		r[1] = Math.abs(denominator) / gcd;
	}

	private static long gcd(long n, long d) {

		long n1 = Math.abs(n);
		long n2 = Math.abs(d);

		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	public Rational add(Rational secondRational) {

		long n = r[0] * secondRational.getR()[1] + r[1] * secondRational.getR()[0];

		long d = r[1] * secondRational.getR()[1];

		return new Rational(n, d);

	}

	public Rational subtract(Rational secondRational) {
		long n = r[0] * secondRational.getR()[1] - r[1] * secondRational.getR()[0];

		long d = r[1] * secondRational.getR()[1];

		return new Rational(n, d);
	}

	public Rational multiply(Rational secondRational) {

		long n = r[0] * secondRational.getR()[0];
		long d = r[1] * secondRational.getR()[1];

		return new Rational(n, d);

	}

	public Rational divide(Rational secondRational) {

		long n = r[0] * secondRational.getR()[1];
		long d = r[1] * secondRational.getR()[0];

		return new Rational(n, d);

	}

	@Override
	public String toString() {

		if (r[1] == 1) {
			return r[0] + "";
		} else {
			return r[0] + "/" + r[1];
		}

	}

	@Override
	public boolean equals(Object obj) {

		if ((this.subtract((Rational) (obj))).getR()[0] == 0) {

			return true;

		}

		return false;
	}

	public long[] getR() {
		return r;
	}

	public void setR(long[] r) {
		this.r = r;
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
		return r[0] * 1.0 / r[1];
	}

	@Override
	public int compareTo(Rational o) {

		if (this.subtract(o).getR()[0] > 0) {
			return 1;
		} else if (this.subtract(o).getR()[0] < 0) {
			return -1;
		} else {
			return 0;
		}

	}

}
