package Chapter03.exercise12;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 3 digit number");
		int number = scan.nextInt();
		scan.close();
		
		if (number / 100 == number % 10) {
			System.out.println(number + " is a palindrome");
		}
		else {
			System.out.println(number + " is not a panlindrome");
		}
		
		
	}

}
