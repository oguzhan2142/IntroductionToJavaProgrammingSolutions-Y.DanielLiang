package Chapter13.exercise18;

import java.math.BigInteger;

import Chapter13.exercise15.BigRational;

public class UseTheRationalClass {

	public static void main(String[] args) {

		
		BigRational sum = new BigRational(new BigInteger("0") , new BigInteger("1"));
		
		for (long i = 1; i <= 100; i++) {
			
			BigRational rat = new BigRational(new BigInteger(Long.toString(i)) , new BigInteger(Long.toString(i + 1)));
			sum = sum.add(rat);
		}
		
		
		System.out.println(sum);
		
		
		
		
		
	}

}
