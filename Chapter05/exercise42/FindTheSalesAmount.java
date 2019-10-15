package Chapter05.exercise42;

import java.util.Scanner;

public class FindTheSalesAmount {

	public static void main(String[] args) {

		
		int GOAL = 30000;
		final int BASE_SALARY = 5000;
		double salesAmount = 1;
		double balance = 0;

		Scanner scan  = new Scanner(System.in);
		
		System.out.println("How many money do you want to save");
		GOAL = scan.nextInt();
		scan.close();
		
		for ( salesAmount = 1; balance <(GOAL - BASE_SALARY); salesAmount++) {
			

			if (salesAmount <= 5000) {

				balance += (1 * 0.08);

			} else if (salesAmount > 5000 && salesAmount <= 10000) {

				balance += (1 * 0.10);

			} else {
				balance += (1 * 0.12);
			}

			
			
		}
		
		
		

		System.out.println(salesAmount);
		
		
		
		
		
	}

}
