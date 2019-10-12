package Chapter13.exercise21;

import java.util.Scanner;

import Chapter13.exercise14.Rational;

public class VertexFormEquations {
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter a,b,c:");
		Scanner scan =new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		scan.close();
		
		Rational ar = new Rational(a,1L);
		Rational br = new Rational(b,1L);
		Rational cr = new Rational(c,1L);
		
		Rational h = new Rational(-b,(2* a));
		Rational k ;
		Rational k1 = ar.multiply(h).multiply(h);
		Rational k2 = br.multiply(h);
		Rational k3 = cr;

		k1 = k1.add(k2);
		k = k1.add(k3);
		
		System.out.println("h is " + h + " k is " + k);
		
	}

}
