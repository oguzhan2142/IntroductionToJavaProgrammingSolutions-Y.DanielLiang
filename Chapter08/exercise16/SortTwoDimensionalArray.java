package Chapter08.exercise16;

public class SortTwoDimensionalArray {

	public static void main(String[] args) {

		int[][] array = { { 4, 2 }, { 1, 7 }, { 4, 5 }, { 1, 2 }, { 1, 1 }, { 4, 1 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("  ");
		}

		System.out.println();
		sort(array);

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.print("  ");
		}

	}

	public static void sort(int m[][]) {

		for (int i = 0; i < m.length; i++) {

			for (int j = 0; j < m.length - 1; j++) {

				if (m[j][0] > m[j + 1][0]) {

					int temp = m[j + 1][0];
					m[j + 1][0] = m[j][0];
					m[j][0] = temp;

					int temp2 = m[j + 1][1];
					m[j + 1][1] = m[j][1];
					m[j][1] = temp2;

				}else if (m[j][0] == m[j + 1][0]) {
					if (m[j][1] > m[j + 1][1]) {
						
						int temp = m[j + 1][0];
						m[j + 1][0] = m[j][0];
						m[j][0] = temp;

						int temp2 = m[j + 1][1];
						m[j + 1][1] = m[j][1];
						m[j][1] = temp2;
						
						
						
					}
				}
			}

		}

	}

}
