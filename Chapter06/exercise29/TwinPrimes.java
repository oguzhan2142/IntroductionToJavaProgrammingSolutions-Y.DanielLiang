package Chapter06.exercise29;

import Chapter06.exercise26.PalindromicPrime;

public class TwinPrimes {

	public static void main(String[] args) {

		
		for (int i = 3; i < 1000; i++) {
			
			
			if (isTwinPrimes(i, i+2)) {
				System.out.println("(" + i + "," + (i+2) + ")");
			}
			
		}
		
		
	}

	public static boolean isTwinPrimes(int num1, int num2) {

		if (Math.abs(num1 - num2) == 2) {

			if (PalindromicPrime.isPrime(num1) && PalindromicPrime.isPrime(num2)) {
				return true;
			}

		}

		return false;
	}

}
