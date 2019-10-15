package Chapter05.exercise28;

import java.util.Scanner;

public class DisplayTheFirstDaysOfEachMonth {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int year = scan.nextInt();
		int dayNum = scan.nextInt();

		scan.close();

		for (int i = 1; i <= 12; i++) {

			String month = "";
			String day = "";

			if (dayNum % 7 == 0) {
				day = "Sunday";
			} else if (dayNum % 7 == 1) {
				day = "Monday";
			}

			else if (dayNum % 7 == 2) {
				day = "Tuesday";
			} else if (dayNum % 7 == 3) {
				day = "Wednesday";
			} else if (dayNum % 7 == 4) {
				day = "Thursday";
			} else if (dayNum % 7 == 5) {
				day = "Friday";
			} else if (dayNum % 7 == 6) {
				day = "Saturday";
			}
			
			if ( i == 1 || i == 3  || i == 5 || i == 7 ||
					  i == 8 || i == 10 ||i == 12)
					dayNum += 31;
				else if (i == 4 || i == 6 || i == 9 || i == 11)
					dayNum += 30;
			
			switch (i) {
			case 1:
				month = "January";
				break;
			case 2:
				month = "February";
				break;
			case 3:
				month = "March";
				break;
			case 4:
				month = "April";
				break;
			case 5:
				month = "May";
				break;
			case 6:
				month = "June";
				break;
			case 7:
				month = "July";
				break;
			case 8:
				month = "August";
				break;
			case 9:
				month = "September";
				break;
			case 10:
				month = "October";
				break;
			case 11:
				month = "November";
				break;
			case 12:
				month = "December";
				break;
				
			
	

			}
			

			System.out.println(month + " 1, " + year + " is " + day);

		}

	}

}
