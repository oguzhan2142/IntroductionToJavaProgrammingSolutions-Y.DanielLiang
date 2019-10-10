package Chapter09.exercise05;

import java.util.GregorianCalendar;

public class UseTheGregorianCalenderClass {

	public static void main(String[] args) {

		GregorianCalendar gc = new GregorianCalendar();

		System.out.print(gc.get(GregorianCalendar.YEAR) + " ");
		System.out.print(gc.get(GregorianCalendar.MONTH) + " ");
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));

		gc.setTimeInMillis(1234567898765L);

		System.out.print(gc.get(GregorianCalendar.YEAR) + " ");
		System.out.print(gc.get(GregorianCalendar.MONTH) + " ");
		System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH));

	}

}
