package Chapter03.exercise21;

import java.util.Scanner;

public class DayOfTheWeek {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("year:");
		int year = scan.nextInt();
		System.out.println("month:");
		int month = scan.nextInt();
		System.out.println("day of the month:");
		int dayOfMonth = scan.nextInt();
		
		if (month == 1) {
			month = 13;
			year--;
		}
		else if (month == 2) {
			month = 14;
			year--;
		}
		
		int dayOfWeek;
		
		
		scan.close();

		
		
		dayOfWeek = ((dayOfMonth) + ((26 * (month + 1)) / 10) + (year % 100) + ((year % 100) / 4) + ((year / 100) / 4) + (5 * (year / 100)) ) % 7 ;
		
		
		
		System.out.println(dayOfWeek);
		
		
		
		
		switch (dayOfWeek) {
		case 0:
			System.out.println("Saturday");
			break;
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		default:
			break;
		}



	}

}
