package Chapter04.exercise26;

import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {

		// Create a Scanner
		Scanner scan = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount in double, for example 11.56: ");
		String amount = scan.nextLine();
		scan.close();
		String beforePoint = null;
		String afterPoint = null;
		
		for (int i = 0; i < amount.length(); i++) {
			
			if (amount.charAt(i) == '.') {
				beforePoint = amount.substring(0, i);
				afterPoint = amount.substring(i + 1);
				break;
			}
		}
		
		int remainingAmount = Integer.parseInt(afterPoint);
		
		int numberOfQuarters = remainingAmount / 25 ;
		
		

		// Find the number of one dollars

		// Find the number of quarters in the remaining amount

		remainingAmount = remainingAmount % 25;

		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;

		// Find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;

		// Find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;

		System.out.println("Your amount " + amount + " consists of");
		System.out.println("		" + beforePoint + " dollars");
		System.out.println("		" + numberOfQuarters + " quarters");
		System.out.println("		" + numberOfDimes + " dimes");
		System.out.println("		" + numberOfNickels + " nickels");
		System.out.println("		" + numberOfPennies + " pennies");

	}

}
