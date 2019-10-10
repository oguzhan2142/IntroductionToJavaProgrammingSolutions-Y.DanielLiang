package Chapter04.exercise09;

import java.util.Scanner;

public class FindTheUnicodeOfACharacter {

	public static void main(String[] args) {

		System.out.println("Enter a character: ");
		
		Scanner scan = new Scanner(System.in);
		
		char character =  scan.next().charAt(0);
		scan.close();
		
		System.out.println((int)character);
	}

}
