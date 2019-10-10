package Chapter02.exercise05;

import java.util.Scanner;

public class FinancialApplicationCalculateTips {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		
		double subtotal = scan.nextDouble(); 
		double gratuityRate = scan.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100.0);
		
		double total = subtotal + gratuity ;		
		
		System.out.println(gratuity);
		System.out.println(total);
		scan.close();
		
		
	}

}
