package Chapter06.exercise20;

import java.util.Scanner;

public class CountTheLettersInAString {

	public static void main(String[] args) {

		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		scan.close();
		
		System.out.println("letter number in string is " + countLetters(str));
		
		
	}
	
	public static int countLetters(String s) {
		
		int counter = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char ch = s.charAt(i);
			
			if ( (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				counter++;
			}
			
		}
		
		
		return counter;
	}

}
