package Chapter06.exercise27;

import Chapter06.exercise26.PalindromicPrime;

public class Emirp {

	public static void main(String[] args) {
		
		
		displayEmirps(100);

	}
	
	
	
	public static boolean isReversePrime(int num) {
		
		String toStr = Integer.toString(num);
		String reverseStr = "";
		
		for (int i = toStr.length() - 1; i >= 0; i--) {
			
			reverseStr += toStr.charAt(i);
					
			
		}
		
		int reverseNum = Integer.parseInt(reverseStr);
		
		
		if (PalindromicPrime.isPrime(reverseNum)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean isEmirp(int num) {
		
		if (!PalindromicPrime.isPalindrome(num) && isReversePrime(num) && PalindromicPrime.isPrime(num)) {
			return true;
		}
		return false;
		
	}
	public static void displayEmirps(int howMany) {
		
		int counter = 1;
		int number = 2;

		while (counter <= howMany) {

			if (isEmirp(number)) {
				System.out.print(number + " ");
				counter++;
				if (counter % 10 == 0) {
					System.out.println();
				}

			}

			number++;
		}
		
		
		
		
	}

}
