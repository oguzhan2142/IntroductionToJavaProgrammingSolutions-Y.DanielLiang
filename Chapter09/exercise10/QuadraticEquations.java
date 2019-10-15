package Chapter09.exercise10;

import java.util.Scanner;

public class QuadraticEquations {

	private double a;
	private double b;
	private double c;

	public QuadraticEquations(double a, double b, double c) {

		this.a = a;
		this.b = b;
		this.c = c;

	}

	public double getDiscriminant() {

		return b * b - 4 * a * c;

	}

	public double getRoot1() {
		if (getDiscriminant() < 0) {
			return 0;
		}

		return (-b + Math.sqrt(getDiscriminant())) / (2 * a);

	}

	public double getRoot2() {
		if (getDiscriminant() < 0) {
			return 0;
		}
		return (-b - Math.sqrt(getDiscriminant())) / (2 * a);

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

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter a,b,c of equation:");
		double a = scan.nextDouble();
		double b= scan.nextDouble();
		double c = scan.nextDouble();
		scan.close();
		
		
		QuadraticEquations equation = new QuadraticEquations(a, b, c);
		
		
		if (equation.getDiscriminant() > 0 ) {
			System.out.println(equation.getRoot1() + "," + equation.getRoot2());
		}else if (equation.getDiscriminant() == 0) {
			System.out.println(equation.getRoot1());
		}else {
			System.out.println("The equation has no roots");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
