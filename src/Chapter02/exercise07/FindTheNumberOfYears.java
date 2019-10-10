package Chapter02.exercise07;

import java.util.Scanner;

public class FindTheNumberOfYears {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int minutes = scan.nextInt();
							//hour-day-month-year
		int totalDay = minutes /(60 * 24);
		
		int year = totalDay / 365;
		int day = totalDay % 365 ;
		
		
		System.out.println(year);
		System.out.println(day);
		scan.close();
		
	}

}
