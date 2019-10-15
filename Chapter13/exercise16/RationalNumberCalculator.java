package Chapter13.exercise16;

import Chapter13.exercise14.Rational;

public class RationalNumberCalculator {

	public static void main(String[] args) {
		
	
		
		String [] rat1 = args[0].split("/");
		String [] rat2 = args[2].split("/");
		
		
		
		Rational rational1 = new Rational(Long.parseLong(rat1[0]), Long.parseLong(rat1[1]));
		Rational rational2 = new Rational(Long.parseLong(rat2[0]), Long.parseLong(rat2[1]));
		
		
		Rational result = null ;
		switch (args[1].charAt(0)) {
		case '+':
			result = rational1.add(rational2);
			break;
		case '-':
			result = rational1.subtract(rational2);
			break;
		case '*':
			result = rational1.multiply(rational2);
			break;
		case '/':
			result = rational1.divide(rational2);
			break;
		default:
			break;
		}
		
		
		System.out.println(result.toString());
		
	}
	
	
}
