package Chapter10.exercise14;

import java.util.GregorianCalendar;
import java.util.Locale;

public class MyDate {

	int year;
	int month; // 0 for january
	int day;

	public MyDate() {

		GregorianCalendar calendar = new GregorianCalendar(Locale.ENGLISH);

		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);

	}
	
	
	public MyDate (long elapsedTime) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		
		
	}
	
	
	public MyDate(int year , int month , int day) {
		
		this.year = year;
		this.month = month;
		this.day = day;
		
		
	}
	
	public void setDate(long elapsedTime) {
		
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTimeInMillis(elapsedTime);
		
		year = calendar.get(GregorianCalendar.YEAR);
		month = calendar.get(GregorianCalendar.MONTH);
		day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
		
		
		
		
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public static void main(String[] args) {

		MyDate date = new MyDate(34355555133101l);

		
		
		System.out.println(date.getYear() + " " + date.getMonth() + " " + date.getDay());

	}

}
