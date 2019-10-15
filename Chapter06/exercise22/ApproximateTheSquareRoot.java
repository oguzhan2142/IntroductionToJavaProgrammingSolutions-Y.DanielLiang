package Chapter06.exercise22;

import java.util.Scanner;

public class ApproximateTheSquareRoot {

	public static void main(String[] args) {

		System.out.println("Enter n for square:");
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		scan.close();
		
		System.out.println(sqrt(n));
		
		
	}

	public static double sqrt(long n) {

		double lastGuess = 1;
		double  nextGuess = (lastGuess + n / lastGuess) / 2;

		while (Math.abs(nextGuess - lastGuess) < 0.0001) {

			nextGuess = (lastGuess + n / lastGuess) / 2;

		}
		
		
		lastGuess = nextGuess;
		return nextGuess = (lastGuess + n / lastGuess) / 2;

		//return nextGuess;

	}
}
