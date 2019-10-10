package Chapter05.exercise27;

public class DisplayLeapYears {

	public static void main(String[] args) {

		int counter = 0;
		boolean isLeap = false;

		for (int i = 101; i <= 2100; i++) {

			if (i % 4 == 0) {
				isLeap = true;
				if (i % 100 == 0) {
					if (i % 400 == 0) {
						isLeap = true;
					} else {
						isLeap = false;
					}

				}
			}

			if (isLeap) {
				counter++;
				System.out.print(i + " ");
			}

			if (counter % 10 == 0) {
				System.out.println();
			}
			isLeap = false;

		}

	}

}
