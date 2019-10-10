package Chapter06.exercise28;

import Chapter06.exercise26.PalindromicPrime;

public class MersennePrime {

	public static void main(String[] args) {

		System.out.println("p\t2^p –1");
		System.out.println("_______________________");
		for (int number = 2; number <= 31; number++) {
			
			if (isMersennePrime(number)) {
				System.out.println(number + "\t" + ((int)Math.pow(2, number) - 1));
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	public static boolean isMersennePrime(int num) {
		
		if (PalindromicPrime.isPrime(num)) {
			num = (int)Math.pow(2, num) - 1 ;
			if (PalindromicPrime.isPrime(num)) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}

}
