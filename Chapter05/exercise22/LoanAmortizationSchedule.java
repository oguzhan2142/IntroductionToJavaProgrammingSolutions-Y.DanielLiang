package Chapter05.exercise22;

import java.util.Scanner;

public class LoanAmortizationSchedule {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Payment# Interest Principal Balance
		System.out.println("Loan Amount:");
		double loanAmount = scan.nextDouble();
		System.out.println("Number of Years:");
		int numberOfYears = scan.nextInt();
		System.out.println("Annual Interest Rate:");
		double annualInterestRate = scan.nextDouble();
		scan.close();

		// Monthly Payment: 865.26
		// Total Payment: 10383.21
		double balance = loanAmount;
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount / (numberOfYears * 12);
		double interest;
		double principal;
		
		
		
		
		
		System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
		for (int i = 1; i <= numberOfYears * 12; i++) {
			interest = monthlyInterestRate * balance;
			principal = monthlyPayment - interest;
			balance = balance - principal;
			
			System.out.println(i + "\t\t" + interest + "\t\t" + principal + "\t\t" + balance);
		}

	}

}
