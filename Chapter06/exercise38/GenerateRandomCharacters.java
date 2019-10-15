package Chapter06.exercise38;

public class GenerateRandomCharacters {

	public static void main(String[] args) {
		
		print();

	}

	public static void print() {

		for (int i = 1; i <= 100; i++) {

			System.out.print(randomCharacter() + " ");
			if (i % 10 == 0) {
				System.out.println();
			}
			
		}
		for (int i = 1; i <= 100; i++) {

			System.out.print(randomDigit() + " ");
			if (i % 10 == 0) {
				System.out.println();
			}

		}

	}

	public static char randomCharacter() {

		int randomNum = (int) (Math.random() * ('Z' - 'A' + 1)) + 'A';

		return (char) randomNum;

	}

	public static char randomDigit() {

		int randomNum = (int) (Math.random() * ('9' - '0' + 1)) + '0';

		return (char) randomNum;

	}

}
