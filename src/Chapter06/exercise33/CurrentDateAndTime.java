package Chapter06.exercise33;

public class CurrentDateAndTime {

	public static void main(String[] args) {
		getTime();
		getDate();

	}

	public static void getTime() {

		long elapsedMillis = System.currentTimeMillis();

		long totalSecond = elapsedMillis / 1000;
		long totalMinutes = totalSecond / 60;
		long totalHours = totalMinutes / 60;

		long currentSecond = totalSecond % 60;
		long currentMinutes = totalMinutes % 60;
		long currentHours = totalHours % 24;

		System.out.println(currentHours + ":" + currentMinutes + ":" + currentSecond);

	}

	public static void getDate() {

		// 1 01 1970
		long elapsedMillis = System.currentTimeMillis();
		long totalSecond = elapsedMillis / 1000;
		long totalMinutes = totalSecond / 60;
		long totalHours = totalMinutes / 60;
		long totalDays = totalHours / 24;
		
		String date = "";
		int year = 1970;
		boolean isLeapYear = false;

		if (year % 4 == 0) {
			isLeapYear = true;
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}

			}
		}

		while (totalDays >= 365) {

			if (isLeapYear) {
				totalDays -= 366;
				year++;
			} else {
				totalDays -= 365;
				year++;
			}

		}
		
		int january = 31;
		int february = isLeapYear ? 29: 28;
		int march = 31;
		int april = 30;
		int may = 31;
		int june = 30;
		int july = 31;
		int august = 31;
		int september = 30;
		int october = 31;
		int november = 30;
		int december = 31;
		
		
		
		if (totalDays - january > 0) {
			totalDays = totalDays - january ;
			date = "Jan " ;
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - february > 0) {
			totalDays = totalDays - february ;
			date = "Feb ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - march > 0) {
			totalDays = totalDays - march ;
			date = "Mar ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - april > 0) {
			totalDays = totalDays - april ;
			date = "Apr ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - may > 0) {
			totalDays = totalDays - may ;
			date = "May ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - june > 0) {
			totalDays = totalDays - june ;
			date = "Jun ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - july > 0) {
			totalDays = totalDays - july ;
			date = "Jul ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - august > 0) {
			totalDays = totalDays - august ;
			date = "Aug ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - september > 0) {
			totalDays = totalDays - september ;
			date = "Sep ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - october > 0) {
			totalDays = totalDays - october ;
			date = "Oct ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - november > 0) {
			totalDays = totalDays - november ;
			date = "Nov ";
			date += totalDays;
			date += (" " + year);
		}
		if (totalDays - december > 0) {
			totalDays = totalDays - december ;
			date = "Dec ";
			date += totalDays;
			date += (" " + year);
		}
		
		
		
		System.out.println(date);
	}

}
