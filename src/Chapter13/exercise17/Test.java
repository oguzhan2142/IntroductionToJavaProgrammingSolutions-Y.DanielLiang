package Chapter13.exercise17;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first complex number");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		Complex c1 = new Complex(a, b);
		
		System.out.println("Enter the second complex number");
		a = scan.nextDouble();
		b = scan.nextDouble();
		
		Complex c2 = new Complex(a, b);
		
		scan.close();
		
		System.out.println( c1.toString() + " + " + c2.toString() + " = " + c1.add(c2).toString());
		System.out.println( c1.toString() + " - " + c2.toString() + " = " + c1.subtract(c2).toString());
		System.out.println( c1.toString() + " * " + c2.toString() + " = " + c1.multiply(c2).toString());
		System.out.println( c1.toString() + " / " + c2.toString() + " = " + c1.divide(c2).toString());
		
		
		System.out.println( "|" + c1.toString() + "| = " + c1.abs() );
		
		
	}

}
