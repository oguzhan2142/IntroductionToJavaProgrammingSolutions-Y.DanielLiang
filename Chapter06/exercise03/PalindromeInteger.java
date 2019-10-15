package Chapter06.exercise03;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {

		System.out.println("enter an integer:");
		Scanner scan = new Scanner(System.in);
		int takeInt = scan.nextInt();
		scan.close();
		
		System.out.println(takeInt + " Is palindrom? " + isPalindrome(takeInt));
		
		
	}
	
	public static int reverse(int number) {
		
		String toStr = "";
		
		toStr += number;
		String reverseStr = "";
		
		for (int i = toStr.length() - 1; i >= 0; i--) {
		
			reverseStr += toStr.charAt(i);
			
			
		}
		
		
		return Integer.parseInt(reverseStr);
		
		
	}
	
	
	public static boolean isPalindrome(int number) {
		
		if (number == reverse(number)) {
			return true;
		}
		
		
		return false;
		
	}

}
