package Chapter03.exercise05;

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int today = scan.nextInt();
		String todaysName = "";
		
		switch (today) {
		case 0:
			todaysName = "Sunday";
			break;
		case 1:
			todaysName = "Monday";
			break;
		case 2:
			todaysName = "Tuesday";
			break;
		case 3:
			todaysName = "Wednesday";
			break;
		case 4:
			todaysName = "Thursday";
			break;
		case 5:
			todaysName = "Friday";
			break;
		case 6:
			todaysName = "Saturday";
			break;
		default:
			System.err.println("enter number between 0-6");
		}
		
		int daysElapsedSinceToday = scan.nextInt();
		String futureDay = "";
		
		today = today + daysElapsedSinceToday;
		today %= 7;

		switch (today) {
		case 0:
			futureDay = "Sunday";
			break;
		case 1:
			futureDay = "Monday";
			break;
		case 2:
			futureDay = "Tuesday";
			break;
		case 3:
			futureDay = "Wednesday";
			break;
		case 4:
			futureDay = "Thursday";
			break;
		case 5:
			futureDay = "Friday";
			break;
		case 6:
			futureDay = "Saturday";
			break;
		default:
			System.err.println("enter number between 0-6");
		}
		
		System.out.println("Today is "+ todaysName + " and the future day is " + futureDay);
		
	}

	
	}
