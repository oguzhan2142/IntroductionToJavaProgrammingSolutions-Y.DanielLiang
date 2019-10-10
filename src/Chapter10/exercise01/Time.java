package Chapter10.exercise01;

public class Time {

	private int hour;
	private int minute;
	private int second;

	public Time() {

		long totalSec = System.currentTimeMillis() / 1000;
		long totalMin = totalSec / 60;
		long totalHours = totalMin / 60;

		hour = (int) (totalHours % 24);
		minute = (int) (totalMin % 60);
		second = (int) (totalSec % 60);

	}
	
	public Time(long elapsedTime) {

		long totalSec = elapsedTime / 1000;
		long totalMin = totalSec / 60;
		long totalHours = totalMin / 60;

		hour = (int) (totalHours % 24);
		minute = (int) (totalMin % 60);
		second = (int) (totalSec % 60);
		
		
	}

	public Time(int hour, int minute, int second) {

		this.hour = hour;
		this.minute = minute;
		this.second = second;

	}

	public void elapsedTime(long elapseTime) {

		long totalSec = elapseTime / 1000;
		long totalMin = totalSec / 60;
		long totalHours = totalMin / 60;

		hour = (int) (totalHours % 24);
		minute = (int) (totalMin % 60);
		second = (int) (totalSec % 60);

	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public String toString() {
		
		return hour + ":" + minute + ":" + second;
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		Time time1 = new Time();
		Time time2 = new Time(555550000);
		
		
		System.out.println(time1.toString());
		System.out.println(time2.toString());
		
		
		
		
	}
	
	
	
	
	
	
}
