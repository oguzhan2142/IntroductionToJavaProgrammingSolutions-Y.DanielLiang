package Chapter05.exercise43;

public class Combinations {

	public static void main(String[] args) {

		int counter = 0;

		for (int number = 1; number < 8; number++) {

			for (int i = 1; i < 8; i++) {

				if (number == i) {
					continue;
				}

				counter++;
			}

		}
		System.out.println("The total number of all combinations is " + counter / 2);

	}

}
