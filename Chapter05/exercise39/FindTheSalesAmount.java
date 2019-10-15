package Chapter05.exercise39;

public class FindTheSalesAmount {

	public static void main(String[] args) {


		int GOAL = 30000;
		final int BASE_SALARY = 5000;
		double salesAmount = 1;
		double balance = 0;

		while (balance < (GOAL - BASE_SALARY)) {

			if (salesAmount <= 5000) {

				balance += (1 * 0.08);

			} else if (salesAmount > 5000 && salesAmount <= 10000) {

				balance += (1 * 0.10);

			} else {
				balance += (1 * 0.12);
			}

			salesAmount += 1;

		}

		System.out.println(salesAmount);


	}

}
