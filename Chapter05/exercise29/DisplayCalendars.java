package Chapter05.exercise29;

import java.util.Scanner;

public class DisplayCalendars {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		int firstDayOfYear = scan.nextInt();

		int numberOfDaysInMonth = 0;
		scan.close();
		int howManySpace = firstDayOfYear;
		String monthStr = "";

		for (int i = 1; i < 12; i++) {

			switch (i) {
			case 1:
				numberOfDaysInMonth = 31;
				monthStr = "January";
				break;
			case 2:
				numberOfDaysInMonth = 28;
				monthStr = "February";
				break;
			case 3:
				numberOfDaysInMonth = 31;
				monthStr = "March";
				break;
			case 4:
				numberOfDaysInMonth = 30;
				monthStr = "April";
				break;
			case 5:
				numberOfDaysInMonth = 31;
				monthStr = "May";
				break;
			case 6:
				numberOfDaysInMonth = 30;
				monthStr = "June";
				break;
			case 7:
				numberOfDaysInMonth = 31;
				monthStr = "July";
				break;
			case 8:
				numberOfDaysInMonth = 31;
				monthStr = "August";
				break;
			case 9:
				numberOfDaysInMonth = 30;
				monthStr = "September";
				break;
			case 10:
				numberOfDaysInMonth = 31;
				monthStr = "October";
				break;
			case 11:
				numberOfDaysInMonth = 30;
				monthStr = "November";
				break;
			case 12:
				numberOfDaysInMonth = 31;
				monthStr = "December";
				break;

			default:
				break;
			}

			System.out.println("\t\t  " + monthStr + " " + year);
			System.out.println("---------------------------------------------------");
			System.out.printf("%s	%s	%s	%s	%s	%s	%s\n", "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat");

			firstDayOfYear %= 7;

			int spaceCounter = 0;

			for (int j2 = 0; j2 < howManySpace; j2++) {
				System.out.print("    \t");
				spaceCounter++;
			}

			for (int j = 1; j < numberOfDaysInMonth; j++) {

				System.out.printf("%2d  \t", j);

				if ((j + howManySpace) % 7 == 0) {
					System.out.println();
				}

			}
			howManySpace = 35 - spaceCounter - numberOfDaysInMonth;

			System.out.println();
			System.out.println();

		}

	}

}
