package Chapter02.exercise08;

import java.util.Scanner;

public class CurrentTime {

	public static void main(String[] args) {

		long miliSec = System.currentTimeMillis();

		int totalSec = (int) (miliSec / 1000);
		int totalMin = totalSec / 60;
		int totalHour = totalMin / 24;

		int sec = totalSec % 60;
		int min = totalMin % 60;
		int hour = totalHour % 24;
		
		Scanner scan = new Scanner(System.in);
		
		int GMT = scan.nextInt();
		
		System.out.println((hour + GMT)  + ":" + min + ":" + sec);
		
		scan.close();
		
		

	}

}
