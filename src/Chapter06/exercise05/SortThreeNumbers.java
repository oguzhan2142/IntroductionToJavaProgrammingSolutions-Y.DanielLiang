package Chapter06.exercise05;

import java.util.Scanner;

public class SortThreeNumbers {

	public static void main(String[] args) {

		System.out.println("Ebter three integer:");
		Scanner scan = new Scanner(System.in);
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double num3 = scan.nextDouble();
		scan.close();
		
		displaySortedNumbers(num1, num2, num3);
		
		
		
	}

	public static void displaySortedNumbers(double num1, double num2, double num3) {

		double largest = 0;
		double medium = 0;
		double smalest = 0;

		if (num1 > num2 && num1 > num2) {
			largest = num1;
			if (num2 > num3) {
				medium = num2;
				smalest = num3;
			} else {
				medium = num3;
				smalest = num2;
			}
		}

		if (num2 > num1 && num2 > num3) {
			largest = num2;
			if (num1 > num3) {
				medium = num1;
				smalest = num3;
			} else {
				medium = num3;
				smalest = num1;
			}
		}
		if (num3 > num1 && num3 > num2) {
			largest = num3;
			if (num1 > num2) {
				medium = num1;
				smalest = num2;
			} else {
				medium = num2;
				smalest = num1;
			}
		}

		System.out.println(smalest + " " + medium + " " + largest);

	}
}
