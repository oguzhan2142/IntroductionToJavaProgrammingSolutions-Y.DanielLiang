package Chapter07.exercise34;

import java.util.Scanner;

public class SortCharactersInAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("enter a string to order");

		String str = scan.next();
		scan.close();
		System.out.println(sort(str));

	}

	public static String sort(String s) {

		char[] toCharArray = s.toCharArray();
		String toString = "";

		for (int j = 0; j < toCharArray.length; j++) {

			for (int i = 0; i < toCharArray.length - 1; i++) {

				if (toCharArray[i] > toCharArray[i + 1]) {

					char temp = toCharArray[i + 1];
					toCharArray[i + 1] = toCharArray[i];
					toCharArray[i] = temp;

				}

			}
		}

		for (int i = 0; i < toCharArray.length; i++) {
			toString += toCharArray[i];
		}

		return toString;
	}

}
