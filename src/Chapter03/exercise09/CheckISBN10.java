package Chapter03.exercise09;

import java.util.Scanner;

public class CheckISBN10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] array = new int[9];
		int checksum = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = scan.nextInt();

		}
		scan.close();

		for (int i = 0; i < array.length; i++) {
			checksum += (array[i] * (i + 1));
		}

		checksum %= 11;
		
		if (checksum == 10) {
			
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
			}
		
			System.out.print("X");
		}
		else {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]);
			}
			System.out.print(checksum);
		}
		
	}

}
