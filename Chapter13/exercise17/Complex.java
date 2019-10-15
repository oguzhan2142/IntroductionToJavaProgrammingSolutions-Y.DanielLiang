package Chapter13.exercise17;

public class Complex implements Cloneable {

	private double a;
	private double b;

	public Complex() {

		a = 0;
		b = 0;

	}

	public Complex(double a) {

		this.a = a;
		this.b = 0;

	}

	public Complex(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Complex add(Complex c) {

		double realPart = this.a + c.getRealPart();
		double imaginaryPart = this.b + c.getImaginaryPart();

		return new Complex(realPart, imaginaryPart);

	}

	public Complex subtract(Complex c) {
		double realPart = this.a - c.getRealPart();
		double imaginaryPart = this.b - c.getImaginaryPart();
		return new Complex(realPart, imaginaryPart);

	}

	public Complex multiply(Complex c) {
		double realPart = this.a * c.getRealPart() - this.b * c.getImaginaryPart();
		double imaginaryPart = this.b + c.getRealPart() - this.a * c.getImaginaryPart();

		return new Complex(realPart, imaginaryPart);
	}

	public Complex divide(Complex c) {
		double realPart = (this.a * c.getRealPart() + this.b * c.getImaginaryPart())
				/ (Math.pow(getRealPart(), 2) + Math.pow(getImaginaryPart(), 2));
		double imaginaryPart = (this.b * c.getRealPart() - this.a * c.getImaginaryPart())
				/ (Math.pow(getRealPart(), 2) + Math.pow(getImaginaryPart(), 2));

		return new Complex(realPart, imaginaryPart);
	}

	public double abs() {

		return Math.sqrt(a * a + b * b);

	}

	@Override
	public String toString() {
		if (b == 0) {
			return "" + a;
		}
		return "" + a + " " + b + "i";
	}

	public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

}
