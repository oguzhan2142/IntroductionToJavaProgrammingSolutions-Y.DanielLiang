package Chapter05.exercise14;

import java.util.Scanner;

public class ComputeTheGreatestCommonDivisor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first integer:");
		int num1 = scan.nextInt();
		System.out.println("Enter first integer:");
		int num2 = scan.nextInt();
		scan.close();

		int gcd = 0;

		if (num1 < num2) {
			gcd = num1;
		} else {
			gcd = num2;
		}

		while (gcd > 1) {

			if (num1 % gcd == 0 && num2 % gcd == 0) {
				System.out.println("great common devisor is " + gcd); 
				break;
			}
			else {
				gcd--;
			}
			
		}

	}

}
