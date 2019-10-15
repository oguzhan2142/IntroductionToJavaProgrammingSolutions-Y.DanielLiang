package Chapter10.exercise17;

import java.math.BigInteger;

public class SquareNumbers {

	public static void main(String[] args) {

		BigInteger[] squareNumber = new BigInteger[10];

		long squareMaxValueOfLong = Long.MAX_VALUE;

		
		BigInteger number = new BigInteger(Long.toString(squareMaxValueOfLong));
		

		int index = 0;

		while (index < squareNumber.length ) {
			
			number = number.sqrt();
			number = number.add(new BigInteger("1"));
			number = number.multiply(number);
			squareNumber[index++] = number;
			
			
			
			
			
			
		}
		
		
		for (int i = 0; i < squareNumber.length; i++) {
			System.out.println(squareNumber[i]);
		}

	}

}
