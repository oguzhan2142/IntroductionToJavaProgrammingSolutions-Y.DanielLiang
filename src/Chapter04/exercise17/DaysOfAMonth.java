package Chapter04.exercise17;

import java.util.Scanner;

public class DaysOfAMonth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a year: ");

		int year = scan.nextInt();

		System.out.println("Enter a month: ");

		String month = scan.next();
		scan.close();
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);

		
		
		switch (month) {
		case "Jan":
			System.out.println("jan " + year + " has 31 days" );
			break;
		case "Feb":
			if (isLeapYear) {
				System.out.println("Feb " + year + " has 29 days" );
			}
			else {
				System.out.println("Feb " + year + " has 28 days" );
			}
			break;
		case "Mar":
			System.out.println("Mar " + year + " has 31 days" );
			break;
		case "Apr":
			System.out.println("Apr " + year + " has 30 days" );
			break;
		case "May":
			System.out.println("May " + year + " has 31 days" );
			break;
		case "Jun":
			System.out.println("Jun " + year + " has 30 days" );
			break;
		case "Jul":
			System.out.println("Jul " + year + " has 31 days" );
			break;
		case "Aug":
			System.out.println("Aug " + year + " has 31 days" );
			break;
		case "Sep":
			System.out.println("Sep " + year + " has 30 days" );
			break;
		case "Oct":
			System.out.println("Oct " + year + " has 31 days" );
			break;
		case "Nov":
			System.out.println("Nov " + year + " has 30 days" );
			break;
		case "Dec":
			System.out.println("Dec " + year + " has 31 days" );
			break;
		default:
			break;
		}
		
		
		
		
	}

}
