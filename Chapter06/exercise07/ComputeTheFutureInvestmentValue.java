package Chapter06.exercise07;

import java.util.Scanner;

public class ComputeTheFutureInvestmentValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("investment amount:");
		double investmentAmount = scan.nextDouble();
		System.out.println("annual interest rate:");
		double annualInterestRate = scan.nextDouble();
		scan.close();

		System.out.println("years      future value" );
		for (int years = 1; years < 31; years++) {
			System.out.print(years + "  	" + futureInvestmentValue(investmentAmount, annualInterestRate, years));
			System.out.println();
		}
		
		
	}

	public static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years) {

		double monthlyInterestRate = annualInterestRate / (12 * 100);
		double futureInvestmentValue;

		futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));

		return futureInvestmentValue;

	}
}
