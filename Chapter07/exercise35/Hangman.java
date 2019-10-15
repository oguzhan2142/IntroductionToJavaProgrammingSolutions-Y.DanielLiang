package Chapter07.exercise35;

import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		game();

	}

	public static void game() {

		String[] words = { "table", "java", "water", "library", "movie" };
		boolean isGameOver = false;
		char[] choosenWord = pickARandomWord(words).toCharArray();
		char[] asterisk = new char[choosenWord.length];
		for (int i = 0; i < asterisk.length; i++) {
			asterisk[i] = '*';
		}
		int missedCounter = 0;
		Scanner scan = new Scanner(System.in);
		
		
		
		
		while (!isGameOver) {
			System.out.println("Enter a letter in word ");
			printCharArray(asterisk);
			char getLetter = scan.next().charAt(0);

			if (isLetterInChoosenWord(getLetter, choosenWord)) {

				updateAsterisk(choosenWord, asterisk, getLetter);

			} else {
				missedCounter++;
			}
			isGameOver = checkAllLetterFound(asterisk);
			
			if (isGameOver) {
				printAfterGameOver(missedCounter, choosenWord);
				System.out.println("Do you want another game?");
				char answer = scan.next().charAt(0);
				isGameOver = anotherGame(answer);
				choosenWord = pickARandomWord(words).toCharArray();
				asterisk = new char[choosenWord.length];
				for (int i = 0; i < asterisk.length; i++) {
					asterisk[i] = '*';
				}
				missedCounter = 0;
			}
			
		}
		scan.close();

	}

	public static boolean anotherGame( char answer) {
		
		if (answer == 'y' || answer == 'Y') {
			return false;
		}else {
			return true;
		}
		
		
	}
	
	public static void printAfterGameOver(int missedCounter, char[] choosenWord) {

		System.out.print("The word is ");
		printCharArray(choosenWord);
		System.out.println(".You missed " + missedCounter + " time");

	}

	public static boolean checkAllLetterFound(char[] asterisk) {

		for (int i = 0; i < asterisk.length; i++) {
			if (asterisk[i] == '*') {

				return false;
			}
		}
		return true;

	}

	public static void updateAsterisk(char[] choosenWord, char[] asterisk, char letter) {

		for (int i = 0; i < choosenWord.length; i++) {

			if (choosenWord[i] == letter) {
				asterisk[i] = letter;
			}

		}

	}

	public static boolean isLetterInChoosenWord(char letter, char[] choosenWord) {

		for (int i = 0; i < choosenWord.length; i++) {
			if (choosenWord[i] == letter) {
				return true;
			}
		}
		return false;

	}

	public static String pickARandomWord(String[] wordsArray) {

		int randomIndex = (int) (Math.random() * wordsArray.length);

		return wordsArray[randomIndex];

	}

	public static void printCharArray(char[] asteriskArray) {

		for (int i = 0; i < asteriskArray.length; i++) {
			System.out.print(asteriskArray[i]);
		}

	}

}
