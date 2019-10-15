package Chapter08.exercise11;

import java.util.Scanner;

public class NineHeadsAndTails {

	public static void main(String[] args) {

		System.out.println("Enter a number between 0 and 511:");
		Scanner scan = new Scanner(System.in);
		int possibilityNum = scan.nextInt();
		scan.close();
		
		printMatrix(toBinary(possibilityNum));
	}
	
	public static void printMatrix(String binary) {
		
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '0') {
				System.out.print("H ");
			}else {
				System.out.print("T ");
			}
			if ((i + 1) % 3 == 0 ) {
				System.out.println();
			}
		}
		
		
		
		
	}
	
	public static String toBinary(int number) {
		
		String binaryStr = "";
		do {
			binaryStr += (number % 2);
			number /=2;
			
			
		} while (number > 0);
		
		String reverse = "";
		
		for (int i = binaryStr.length() -1; i >= 0 ; i--) {
			reverse+= binaryStr.charAt(i);
		}
		
		if (reverse.length() < 9) {
			int howManyZeroWillAdd = 9 - reverse.length();
			String zeroStr = "";
			for (int i = 0; i < howManyZeroWillAdd; i++) {
				zeroStr += '0';
			}
			
			reverse = zeroStr + reverse;
		}
		
		
		return reverse;
	}
	
	
	
	

}
