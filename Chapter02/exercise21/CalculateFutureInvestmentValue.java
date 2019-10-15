package Chapter02.exercise21;

import java.util.Scanner;

public class CalculateFutureInvestmentValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double investmentAmount = scan.nextDouble();
		double annualInterestRate = scan.nextDouble();
		double numOfYears = scan.nextDouble();

		double futureInvestmentValue;

		futureInvestmentValue = investmentAmount * Math.pow((1 + annualInterestRate / (100 * 12) ), (numOfYears * 12));

		System.out.println(futureInvestmentValue);
		scan.close();

	}

}
