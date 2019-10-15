package Chapter06.exercise18;

import java.util.Scanner;

public class CheckPassword {

	public static void main(String[] args) {

		
		System.out.println("Enter password:");
		Scanner scan = new Scanner(System.in);
		String password = scan.next();
		
		scan.close();
		
		checkPassword(password);
		
		
	}

	public static void checkPassword(String password) {

		boolean isValid = true;
		boolean isLengthOK = true;
		boolean isOnlyLettersAndDigits = false;
		boolean isDigitCounterOk = true;
		int digitCounter = 0;

		if (password.length() < 8) {
			isLengthOK = false;
		}

		for (int i = 0; i < password.length(); i++) {

			char n = password.charAt(i);

			if ((n >= 'A' && n <= 'Z') || (n >= 'a' && n <= 'z') || (n >= '0' && n <= '9')) {
				isOnlyLettersAndDigits = true;
			} else {
				isOnlyLettersAndDigits = false;
				break;
			}

			if ((n >= '0' && n <= '9')) {
				digitCounter++;
			}

		}

		if (digitCounter < 2) {
			isDigitCounterOk = false;
		}
		
		isValid = isLengthOK && isOnlyLettersAndDigits && isDigitCounterOk;
		
		
		if (isValid) {
			System.out.println("Valid pw");
		}
		else {
			System.out.println("Invalid pw");
		}

	}

}
