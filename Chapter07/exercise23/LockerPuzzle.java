package Chapter07.exercise23;

public class LockerPuzzle {

	public static void main(String[] args) {

		game();
	}

	public static void game() {

		boolean[] locker = new boolean[100];

		for (int i = 0; i < locker.length; i++) {

			locker[i] = true;

		}

		for (int i = 0; i < locker.length -1; i++) {
			locker[i + 1] = false;
		}

		for (int student = 3; student <= locker.length; student++) {

			for (int j = student; j < locker.length; j += student) {

				if (locker[j - 1] == true) {
					locker[j - 1] = false;
				} else {
					locker[j - 1] = true;
				}

			}

		}

		displayResult(locker);

	}

	public static void displayResult(boolean[] locker) {

		for (int i = 0; i < locker.length; i++) {
			System.out.print(locker[i] + " ");
		}

	}

}
