package Chapter03.exercise26;

import java.util.Scanner;

public class UseTheOperators {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int takeAnInteger = scan.nextInt();
		boolean isDivisibleByFiveAndSix = takeAnInteger % 5 == 0 && takeAnInteger % 6 == 0;
		boolean isDivisibleByFiveOrSix = takeAnInteger % 5 == 0 || takeAnInteger % 6 == 0;
		boolean isDivisibleByFiveAndSixButNotBoth = (takeAnInteger % 5 == 0 || takeAnInteger % 6 == 0)
				&& !(takeAnInteger % 5 == 0 && takeAnInteger % 6 == 0);
		scan.close();

		System.out.println("Is 10 divisible by 5 and 6? " + isDivisibleByFiveAndSix);
		System.out.println("Is 10 divisible by 5 or 6? " + isDivisibleByFiveOrSix);
		System.out.println("Is 10 divisible by 5 or 6, but not both? " + isDivisibleByFiveAndSixButNotBoth);
	}

}
