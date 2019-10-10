package Chapter07.exercise22;

public class EightQueens {

	public static void main(String[] args) {

		game();

	}

	public static void game() {

		int[] indexOfEachRow = new int[8];
		int currentIndex = 0;
		while (currentIndex < 8) {

			int randomIndex = (int) (Math.random() * 8) + 1;

			if (isInArray(indexOfEachRow, randomIndex) || isSameDiagonal(indexOfEachRow, currentIndex, randomIndex)) {
				continue;
			}

			indexOfEachRow[currentIndex++] = randomIndex;

		}

		displayGame(indexOfEachRow);

	}
	
	public static void displayGame(int[] indexOfEachRow) {
		
		for (int i = 0; i <8; i++) {
			
			
			for (int j = 0; j < indexOfEachRow[i] - 1; j++) {
				System.out.print("| |");
			}
			
			System.out.print("|Q|");
			
			for (int j = 0; j < 8 - indexOfEachRow[i]; j++) {
				System.out.print("| |");
			}
			
			System.out.println();
		}
		
		
	}

	public static boolean isInArray(int[] array, int number) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;

	}

	public static boolean isSameDiagonal(int[] array, int currentIndex, int randomIndex) {
		if (currentIndex != 0) {

			if (Math.abs(array[currentIndex - 1] - randomIndex) == 1) {
				return true;
			}
		}

		return false;

	}

}
