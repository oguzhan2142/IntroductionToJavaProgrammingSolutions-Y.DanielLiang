package Chapter05.exercise21;

import java.util.Scanner;

public class CompareLoansWithVariousInterestRates {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Loan Amount:");
		double loanAmount = scan.nextDouble();

		System.out.println("Number of years");
		int numOfYears = scan.nextInt();

		scan.close();


		System.out.println("Interest Rate\tMonthly Payment\tTotal Payment");
		for (double i = 0.05; i <= 0.081; i += 0.00125) {

			loanAmount = loanAmount * (1 + i);
			double  monthlyPayment = loanAmount / numOfYears / 12;
			
			System.out.println((i * 100) + "%\t" + monthlyPayment + "\t" + monthlyPayment * 12 * numOfYears);

		}

	}

}
