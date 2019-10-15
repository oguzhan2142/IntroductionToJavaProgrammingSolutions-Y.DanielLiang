package Chapter05.exercise31;

import java.util.Scanner;

public class ComputeCDValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("Enter the initial deposit amount:");
		double amount = scan.nextDouble();
		System.out.println("Enter annual percentage yield:");
		double annualPercentageYield = scan.nextDouble() / 100;
		System.out.println("Enter maturity period (number of months):");
		int months = scan.nextInt();
		scan.close();

		double monthlyPercentageYield = annualPercentageYield / 12;

		System.out.println("Month\tCD Value");
		for (int i = 0; i < months; i++) {

			amount = amount * (1 + monthlyPercentageYield);
			System.out.println((i + 1) + "\t" + amount);

		}

	}

}
