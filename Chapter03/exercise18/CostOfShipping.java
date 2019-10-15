package Chapter03.exercise18;

import java.util.Scanner;

public class CostOfShipping {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		double weight = scan.nextDouble();
		
		scan.close();
		
		
		
		if (weight > 0 && weight <= 1) {
			System.out.println("Cost is 3,5");
		}
		else if (weight > 1 && weight <= 3) {
			System.out.println("Cost is 5,5");
		}
		else if (weight > 3 && weight <= 10) {
			System.out.println("Cost is 8,5");
		}
		else if (weight > 10 && weight <= 20) {
			System.out.println("Cost is 10,5");
		}
		else if (weight > 50 ) {
			System.out.println("the package cannot be shipped.");
		}
		
	}

}
