package Chapter05.exercise41;

import java.util.Scanner;

public class OccurrenceOfMaxNumbers {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num = 0;
		int counter = 0;
		int largest = 0;
		int counter2= 0 ;
		System.out.println("Enter numbers:");
		do {

			num = scan.nextInt();
			counter++;
			counter2++;
			if (num > largest) {
				largest = num;
				counter2 = 0;

			}
		} while (num != 0);

		System.out.println("The largest number is " + largest);
		System.out.println("The occurrence count of the largest number is " + (counter - counter2));
		scan.close();
	}

}
