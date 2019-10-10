package Chapter02.exercise13;

import java.util.Scanner;

public class CompoundValue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double savingAmount = scan.nextDouble();
		double monthlyInterestRate = 0.05 / 12 ;
		double total = savingAmount * (1 + monthlyInterestRate);
		
		for (int i = 0; i < 5; i++) {
			
		total = (savingAmount + total) * (1 + monthlyInterestRate) ;	
		
			
			
		}
		
		System.out.println(total);
		scan.close();
		
	}

}
