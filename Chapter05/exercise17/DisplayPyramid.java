package Chapter05.exercise17;

import java.util.Scanner;

public class DisplayPyramid {

	public static void main(String[] args) {

		System.out.println("Enter the number of lines:");
		Scanner scan = new Scanner(System.in);

		int lines = scan.nextInt();

		scan.close();

		for (int i = lines; i > 0; i--) {

			for (int j = 1; j < i; j++) {

				System.out.print("  ");

			}
			for (int j = lines - (i - 1); j > 0; j--) {
				System.out.print(" " + j) ;
			}
			for (int j = 2; j < lines - i + 2; j++) {
				System.out.print(" " + j);
			}
			for (int j = 1; j < i; j++) {

				System.out.print("  ");

			}
			
			System.out.println();

		}

	}

}
