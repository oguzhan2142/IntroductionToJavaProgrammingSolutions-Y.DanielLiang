package Chapter05.exercise32;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		input.close();
		// Get digits from lottery
		int lotteryDigit1 = (int) (Math.random() * 10); ;
		int lotteryDigit2 = 0;
		
		while (lotteryDigit2 == lotteryDigit1) {
			lotteryDigit2 = (int) (Math.random() * 10);
		}
		
		String str = "" + lotteryDigit1 + lotteryDigit2;
		int lottery = Integer.parseInt(str);
		
		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;

		System.out.println("The lottery number is " + lottery);
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else
			System.out.println("Sorry, no match");

	}

}
