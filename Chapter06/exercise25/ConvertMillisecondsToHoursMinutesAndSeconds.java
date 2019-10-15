package Chapter06.exercise25;

public class ConvertMillisecondsToHoursMinutesAndSeconds {

	public static void main(String[] args) {

		System.out.println(convertMillis(5500));
		System.out.println(convertMillis(100000));
		System.out.println(convertMillis(555550000));
		
		
		
	}

	
	public static String convertMillis(long millis) {
		
		String display = "";
		
		long totalSecond = millis / 1000;
		long totalMinutes = totalSecond / 60;
		long totalHours = totalMinutes / 60;
		
		long currentSecond = totalSecond % 60;
		long currentMinutes = totalMinutes % 60;
		
		
		display += totalHours;
		display += ":";
		display += currentMinutes;
		display += ":";
		display += currentSecond;
				
		
		
		return display;
		
	}
}
