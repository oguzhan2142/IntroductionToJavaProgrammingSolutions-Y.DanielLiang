package Chapter05.exercise46;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		String str = scan.next();
		
		scan.close();
		
		String newStr = "";
		
		
		
		
		for (int i = str.length()  - 1; i >= 0 ; i--) {
			
			newStr += str.charAt(i);
			
			
		}
		
		
		
		
		System.out.println("The reversed string is " + newStr);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
