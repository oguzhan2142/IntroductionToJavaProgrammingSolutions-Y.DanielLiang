package Chapter06.exercise16;

public class NumberOfDaysInAYear {

	public static void main(String[] args) {

		
		for (int year = 2000 ; year < 2021; year++) {
			System.out.println(numberOfDaysInAYear(year));
		}
		
	}

	public static int numberOfDaysInAYear(int year) {

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

		if (isLeapYear) {
			return 366;
		}

		return 365;

	}

}
