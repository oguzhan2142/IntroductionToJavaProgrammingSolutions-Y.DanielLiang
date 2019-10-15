package Chapter03.exercise15;

import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {

		// Generate a lottery number
		//int lottary = (int) (Math.random() * 899) + 100;
		int lottary = 123;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick three digits: ");
		//int guess = input.nextInt();
		int guess = 321;
		input.close();

		// Get digits from lottery
		int lotteryDigit1 = lottary / 100;
		int lottaryDigit2 = lottary / 10 % 10;
		int lotteryDigit3 = lottary % 10;
		// Get digits from guess
		int guessDigit1 = guess / 100;
		int guessDigit2 = guess / 10 % 10;
		int guessDigit3 = guess % 10;

		System.out.println("The lottery number is " + lottary);
		// Check the guess

		int[] lottaryArray = { lotteryDigit1, lottaryDigit2, lotteryDigit3 };
		int[] guessArray = { guessDigit1, guessDigit2, guessDigit3 };

		int sameDigitCounter = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (guessArray[j] == lottaryArray[i]) {
					sameDigitCounter++;
					break;
				}
			}
		}
		
		System.out.println("same digit " + sameDigitCounter);
		if (guess == lottary)
			System.out.println("Exact match: you win $10,000");
		else if (sameDigitCounter == 3 && (guess != lottary))
			System.out.println("Match all digits: you win $3,000");

		else if (sameDigitCounter ==1)
			System.out.println("Match one digit: you win $1,000");

	}

}



