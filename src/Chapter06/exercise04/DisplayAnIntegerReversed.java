package Chapter06.exercise04;

import java.util.Scanner;

public class DisplayAnIntegerReversed {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer:");
		int num = scan.nextInt();
		scan.close();
		reverse(num);
		
		
		
		
		
		
		
	}
	public static void reverse(int number) {
		
		String toStr = "";
		
		toStr += number;
		String reverseStr = "";
		
		for (int i = toStr.length() - 1; i >= 0; i--) {
		
			reverseStr += toStr.charAt(i);
			
			
		}
		
		System.out.println(reverseStr);
		
		
	}
}
