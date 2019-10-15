package Chapter04.exercise15;

import java.util.Scanner;

public class PhoneKeyPads {

	public static void main(String[] args) {

		System.out.println("Enter a letter: ");

		Scanner scan = new Scanner(System.in);

		char letter = scan.next().charAt(0);
		scan.close();
		letter = Character.toUpperCase(letter);

		if (Character.isLetter(letter)) {

			if (letter == 'A' || letter == 'B' || letter == 'C') {
				System.out.println("The corresponding number is 2");
			} else if (letter == 'D' || letter == 'E' || letter == 'F') {
				System.out.println("The corresponding number is 3");

			} else if (letter == 'G' || letter == 'H' || letter == 'I') {
				System.out.println("The corresponding number is 4");

			} else if (letter == 'J' || letter == 'K' || letter == 'L') {
				System.out.println("The corresponding number is 5");

			} else if (letter == 'M' || letter == 'N' || letter == 'O') {
				System.out.println("The corresponding number is 6");

			} else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
				System.out.println("The corresponding number is 7");

			}else if (letter == 'T' || letter == 'U' || letter == 'V') {
				System.out.println("The corresponding number is 8");

			}else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
				System.out.println("The corresponding number is 9");

			}
			else {
				System.out.println(letter + " is an invalid input");
			}

		} else {
			System.out.println(letter + " is an invalid input");
		}

	}

}
