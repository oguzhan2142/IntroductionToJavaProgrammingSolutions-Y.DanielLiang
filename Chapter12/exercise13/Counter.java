package Chapter12.exercise13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Counter {

	public static void main(String[] args) throws FileNotFoundException {

		if (args.length != 1) {
			System.err.println("usage : java Counter filename");
			System.exit(0);
		}

		File file = new File(args[0]);

		Scanner input = new Scanner(file);

		int lineCounter = 0;
		int wordCounter = 0;
		int characterCounter = 0;
		while (input.hasNext()) {

			String str = input.nextLine();
			System.out.println(countWordInLine(str));
			wordCounter += countWordInLine(str);
			characterCounter += countCharactersInLine(str);
			lineCounter++;
		}
		input.close();
		System.out.println("Characters:" + characterCounter);
		System.out.println("Words:" + wordCounter);
		System.out.println("Lines:" + lineCounter);
	}

	public static int countWordInLine(String line) {
		int counter = 0;
		boolean whiteSpaceChecker = true;
		if (!line.isEmpty()) {

			for (int i = 0; i < line.length(); i++) {

				char ch = line.charAt(i);

				if (Character.isWhitespace(ch)) {
					counter++;
					whiteSpaceChecker = false;
				}

			}
			if (countCharactersInLine(line) > 0 && whiteSpaceChecker ) {
				counter++;
			}
		}
		return counter;
	}

	public static int countCharactersInLine(String line) {

		int counter = 0;
		for (int i = 0; i < line.length(); i++) {
			char ch = line.charAt(i);
			ch = Character.toLowerCase(ch);
			if ((ch >= 'a' && ch <= 'z')) {
				counter++;
			}

		}
		return counter;

	}

}
