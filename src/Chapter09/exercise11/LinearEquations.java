package Chapter09.exercise11;

import java.util.Scanner;

public class LinearEquations {

	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;

	public LinearEquations(double a, double b, double c, double d, double e, double f) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public boolean isSolvable() {

		if (a * d - b * c != 0) {
			return true;
		} else if (a * d - b * c == 0) {
			System.out.println("The equation has no solution");
		}
		return false;

	}

	public double getX() {

		double x = (e * d - b * f) / (a * d - b * c);
		return x;
	}

	public double getY() {

		double y = (a * f - e * c) / (a * d - b * c);
		return y;

	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getD() {
		return d;
	}

	public double getE() {
		return e;
	}

	public double getF() {
		return f;
	}

	public static void main(String[] args) {
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a,b,c,d,e,f:");
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double d = scan.nextDouble();
		double e = scan.nextDouble();
		double f = scan.nextDouble();
		scan.close();
		LinearEquations equation = new LinearEquations(a, b, c, d, e, f);
		
		System.out.println(equation.getX() + " " + equation.getY());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
