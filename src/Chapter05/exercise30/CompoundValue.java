package Chapter05.exercise30;

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
				
		System.out.println("enter an amount:");
		double totalMoney = scan.nextDouble();
		System.out.println("enter annual interest rate:");
		double annualInterestRate = scan.nextDouble();
		System.out.println("enter months:");
		int month = scan.nextInt();
		scan.close();
		
		double monthlyInterestRate = annualInterestRate / 1200;
		
		
		for (int i = 0; i < month; i++) {
			
			totalMoney += 100;
			totalMoney = totalMoney * (monthlyInterestRate + 1 );
			
		}
		
		System.out.println(totalMoney);
		
		
	}

}
