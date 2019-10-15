package Chapter06.exercise24;

public class DisplayCurrentDateAndTime {

	public static void main(String[] args) {

		
		printCurrentDateAndTime();
		
		
		
		
	}
	
	public static void printCurrentDateAndTime() {
		
		printTime();
		printDate();
		
		
		
		
	}
	
	public static void printTime() {
		
		
		long totalMiliseconds = System.currentTimeMillis();
		long totalSeconds = totalMiliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.print(currentHour + ":" + currentMinute + ":" + currentSecond + "  ");
		
		
		
	}
	public static void printDate() {
		
		long totalMiliseconds = System.currentTimeMillis();
		long totalSeconds = totalMiliseconds / 1000;
		long totalMinutes = totalSeconds / 60;
		long totalHours = totalMinutes / 60;
		long totalDays = totalHours / 24;
		long totalMonths = totalDays / 30;
		long totalYears = totalMonths / 12;
				
		
		long currentYear = 1970 + totalYears;
		long currentMonth = totalMonths % 12;
		long currentDays = totalDays % 30;
		
		
		System.out.println(currentDays + "." + currentMonth + "." + currentYear);
		
	}

}
