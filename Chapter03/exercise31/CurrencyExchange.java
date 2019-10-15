package Chapter03.exercise31;

import java.util.Scanner;

public class CurrencyExchange {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from dollars to RMB: ");
		double exchangeRate = scan.nextDouble();
		System.out.println("1.dollars to RMB\n2.RMB to dollars");
		int chooise = scan.nextInt();
		System.out.println("Enter the money amount:");
		double moneyAmount = scan.nextDouble();
		double modifiedAmount;
		scan.close();
		
		switch (chooise) {
		case 1:
			modifiedAmount =moneyAmount * exchangeRate;
			System.out.println(moneyAmount + " dollars is " + modifiedAmount + " yuan");
			break;
		case 2:
			modifiedAmount = moneyAmount / exchangeRate;
			System.out.println(moneyAmount +" yuan is " + modifiedAmount + " dollars");
			break;
		default:
			System.out.println("invalid enterence");
		
		}
		
		
		
	}

}
