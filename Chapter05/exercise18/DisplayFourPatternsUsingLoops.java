package Chapter05.exercise18;

public class DisplayFourPatternsUsingLoops {

	public static void main(String[] args) {

		System.out.println("Pattern A\n");

		for (int i = 0; i < 6; i++) {
			for (int j = 1; j < i + 2; j++) {

				System.out.print(j + " ");

			}
			System.out.println();
		}

		System.out.println("\n\nPattern B\n");

		for (int f = 0; f < 6; f++) {
			for (int j = 1; j < 6 - f + 1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		System.out.println("\n\nPattern C\n");

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 6 - i; j++) {
				System.out.print("  ");
			}
			for (int j = i + 1; j > 0; j--) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

		System.out.println("\n\nPattern D\n");

		for (int i = 0; i < 6; i++) {

			for (int j2 = 0; j2 < i; j2++) {
				System.out.print("  ");
			}
			for (int j = 1; j < 7 - i; j++) {

				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
