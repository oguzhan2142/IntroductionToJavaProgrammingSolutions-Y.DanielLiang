package Chapter05.exercise49;

import java.util.Locale;
import java.util.Scanner;

public class CountVowelsAndConsonants {

	public static void main(String[] args) {

		
		int vowels = 0;
		int consonants = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		scan.close();
		
		
		str = str.toLowerCase(Locale.ENGLISH);
		for (int i = 0; i < str.length(); i++) {
			
			char check = str.charAt(i);
			
			
			if (check == ' ') {
				continue;
			}
			
			if (check == 'a' || check == 'e' || check == 'i' || check == 'o' || check == 'u') {
				vowels++;
			} else {
				consonants++;
			}
			
		}
		System.out.println(str);
		System.out.println("The number of vowels is " + vowels);
		System.out.println("The number of consonants is " + consonants);
		
		
	}

}
