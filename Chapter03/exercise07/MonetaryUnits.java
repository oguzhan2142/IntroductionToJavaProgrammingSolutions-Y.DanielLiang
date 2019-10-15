package Chapter03.exercise07;

import java.util.Scanner;

public class MonetaryUnits {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double amount = scan.nextDouble();

		int remainingAmount = (int)(amount * 100);

		int numberOfDollars = remainingAmount / 100;
		remainingAmount %= 100;

		int numberOfQuarters = remainingAmount / 25;
		remainingAmount %= 25;

		int numberOfDimes = remainingAmount / 10;
		remainingAmount %= 10;

		int numberOfNickels = remainingAmount / 5;
		remainingAmount %= 5;

		int numberOfPennies = remainingAmount;

		// Display results
		System.out.println("Your amount " + amount + " consists of");
		System.out.println(" " + numberOfDollars + 
			(numberOfDollars == 1 ? " dollar" : " dollars"));
		System.out.println(" " + numberOfQuarters + 
			(numberOfQuarters == 1 ? " quarter" : " quarters"));
		System.out.println(" " + numberOfDimes +
			(numberOfDimes == 1 ? " dime" : " dimes")); 
		System.out.println(" " + numberOfNickels +
			(numberOfNickels == 1 ? " nickel" : " nickels"));
		System.out.println(" " + numberOfPennies +
			(numberOfPennies == 1 ? " pennie" : " pennies"));
		
		
		scan.close();
	}

}
