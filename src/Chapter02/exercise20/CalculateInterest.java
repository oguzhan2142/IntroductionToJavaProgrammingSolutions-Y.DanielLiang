package Chapter02.exercise20;

import java.util.Scanner;

public class CalculateInterest {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		
		double interestRate = scan.nextDouble();
		double balance = scan.nextDouble();
		
		
		System.out.println(balance * interestRate / 1200);
		
		
		
		scan.close();
		
	}

}
