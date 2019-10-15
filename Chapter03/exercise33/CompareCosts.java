package Chapter03.exercise33;

import java.util.Scanner;

public class CompareCosts {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1");
		double weight1 = scan.nextDouble();
		double cost1 = scan.nextDouble();
		
		System.out.println("Enter weight and price for package 2");
		double weight2 = scan.nextDouble();
		double cost2 = scan.nextDouble();
		
		
		scan.close();
		
		if ((cost1 / weight1) < (cost2 / weight2)) {
			System.out.println("Package 1 is better");
		}
		else if ((cost1 / weight1) > (cost2 / weight2)){
			System.out.println("Package 2 is better");
		}
		else {
			System.out.println("Two packages have the same price");
		}
		
		
	}

}
