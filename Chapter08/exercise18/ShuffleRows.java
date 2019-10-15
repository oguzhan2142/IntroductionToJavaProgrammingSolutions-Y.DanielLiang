package Chapter08.exercise18;

public class ShuffleRows {

	public static void main(String[] args) {

		int[][] m = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 }, { 9, 10 } };

		shuffle(m);

		for (int i = 0; i < m.length; i++) {
			System.out.print("(");
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + ",");
			}
			System.out.print(") ");

		}

	}

	public static void shuffle(int[][] m) {

		for (int j = 0; j < m.length; j++) {

			int randomIndex = (int) (Math.random() * m.length);
			int[] temp = m[j];
			m[j] = m[randomIndex];
			m[randomIndex] = temp;

		}

	}

}
