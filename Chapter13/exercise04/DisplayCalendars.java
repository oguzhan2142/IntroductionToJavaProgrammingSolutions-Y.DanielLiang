package Chapter13.exercise04;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendars {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.err.println("usage: java DisplayCalendars -month -year");
			 System.exit(0);
		}

		
		printMonth(Integer.parseInt(args[1]), Integer.parseInt(args[0]));
	}

	public static void printMonth(int year, int month) {

		printMonthTitle(year, month);
		printMonthBody(year, month);

	}

	public static void printMonthTitle(int year, int month) {

		String[] giveMonth = {"January" , "February" , "March" , "April" , "May" , "June" , "July" , "August" ,"September","October","November","December" };
		
		System.out.printf("	"+giveMonth[month] +" " +year);
		System.out.println("\n-----------------------------");
		System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

	}

	public static void printMonthBody(int year, int month) {

		Calendar gc = new GregorianCalendar(year, month, 1);
		for (int i = 1; i < gc.get(Calendar.DAY_OF_WEEK); i++) 
			System.out.printf("%4s" , "");

		while (gc.get(Calendar.DATE) <
				gc.getActualMaximum(Calendar.DATE)) {

				if (gc.get(Calendar.DAY_OF_WEEK) == 7)
					System.out.printf("%4d\n", gc.get(Calendar.DATE));
				else
					System.out.printf("%4d", gc.get(Calendar.DATE));

				// Add a day
				gc.add(Calendar.DATE, 1);
			}
			System.out.printf("%4d\n", gc.get(Calendar.DATE));
		

	}

}
