package Chapter05.exercise50;

import java.util.Scanner;

public class CountUppercaseLetters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		String str = scan.nextLine();
		int uppercaseCounter = 0 ;
		scan.close();
		
		
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				uppercaseCounter++;
			}
			
		}
		
		System.out.println("The number of uppercase letters is " + uppercaseCounter);
		
	}

}
