package Chapter03.exercise14;

import java.util.Scanner;

public class HeadsOrTails {

	public static void main(String[] args) {

		System.out.println("1.heads or 2.tails: ");
		Scanner scan = new Scanner(System.in);

		int chooise = scan.nextInt();

		scan.close();

		int randomNum = (int) (Math.random() * 2) + 1;
		System.out.println(randomNum);

		if (chooise == randomNum) {
			System.out.println("correct");

		} else if (chooise != randomNum) {
			System.out.println("incorrect");
		} else {
			System.err.println("unexpected chooise");
		}

	}

}
