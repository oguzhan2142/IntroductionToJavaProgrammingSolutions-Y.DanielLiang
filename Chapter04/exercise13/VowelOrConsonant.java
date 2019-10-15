package Chapter04.exercise13;

import java.util.Scanner;

public class VowelOrConsonant {

	public static void main(String[] args) {

		System.out.println("Enter a letter: ");

		Scanner scan = new Scanner(System.in);

		char character = scan.next().charAt(0);

		scan.close();

		boolean isVovel = character == 'A' || character == 'a' || character == 'E' || character == 'e'
				|| character == 'I' || character == 'i' || character == 'O' || character == 'o';

		if ((character >= 'A' && character <= 'Z') || (character >= 'a' && character <= 'z')) {
			
			if (isVovel) {
				System.out.println(character + " is a vovel");
			} else {
				System.out.println(character +" is a consonant");
			}
			
		}
		else {
			System.out.println(character + " is an invalid input");
		}
	}

}
