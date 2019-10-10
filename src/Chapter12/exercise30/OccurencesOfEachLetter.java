package Chapter12.exercise30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class OccurencesOfEachLetter {

	public static void main(String[] args) throws FileNotFoundException {

		System.out.println("Enter a file name:");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		scan.close();
		fileName = "test.txt";

		File file = new File("src/Chapter12/exercise30/" + fileName);

		Scanner input = new Scanner(file);

		String getString = "";
		while (input.hasNext()) {

			String temp = input.next();
			getString += temp.toUpperCase();
		}
		input.close();

		int[][] letterAndItsAmount = giveNumberOfLetters(getString);

		
		for (int i = 0; i < letterAndItsAmount.length; i++) {
			System.out.println((char) letterAndItsAmount[i][0] + ":" + letterAndItsAmount[i][1]);
		}

	}

	private static int[][] giveNumberOfLetters(String getString) {

		int[][] letterAndItsAmount = new int['Z' - 'A' + 1][2];

		for (int i = 0; i < letterAndItsAmount.length; i++) {
			letterAndItsAmount[i][0] = (int) ('A' + i);
		}

		for (int i = 0; i < getString.length(); i++) {

			int index = getString.charAt(i) - 'A';

			letterAndItsAmount[index][1]++;

		}

		return letterAndItsAmount;
	}

}
