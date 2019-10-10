package Chapter11.exercise17;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		
		System.out.println("Enter an integer m:");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		
		System.out.println("The smallest number n for m*n to be a perfect square  is " +findSmallestNumForPerfectSquare(number));
		System.out.println("m * n is " + (findSmallestNumForPerfectSquare(number) * number) );
		

	}
	
	public static int findSmallestNumForPerfectSquare(int n) {
		
		ArrayList<Integer> listOfMissingNumbers = findMissingNumbersForPerfectSquare(n);
		int smallestNumber = 1;
		for (int i = 0; i < listOfMissingNumbers.size(); i++) {
			smallestNumber *= listOfMissingNumbers.get(i);
		}
		return smallestNumber;
	}

	public static ArrayList<Integer> findMissingNumbersForPerfectSquare(int n) {

		ArrayList<Integer> smallestFactors = getSmallestFactors(n);
		ArrayList<Integer> missingNumbers = new ArrayList<Integer>();

		for (int i = 0; i < smallestFactors.size() ; i++) {
			int countNum = 0;
			if (i != 0 && smallestFactors.get(i).equals(smallestFactors.get(i - 1))) {
				continue;
			}
			for (int j = 0; j < smallestFactors.size(); j++) {

				if (smallestFactors.get(i) == smallestFactors.get(j)) {
					countNum++;
				}

			}
			if (countNum % 2 != 0) {
				missingNumbers.add(smallestFactors.get(i));
			}
		}

		return missingNumbers;

	}

	public static ArrayList<Integer> getSmallestFactors(int n) {

		ArrayList<Integer> smallestFactors = new ArrayList<Integer>();

		int divisor = 2;
		while (n > 1) {

			if (n % divisor == 0) {
				n /= divisor;
				smallestFactors.add(divisor);
				continue;
			}

			divisor++;

		}

		return smallestFactors;

	}

}
