package Chapter06.exercise12;

public class DisplayCharacters {

	public static void main(String[] args) {

		
		char ch1 = '1';
		char ch2 = 'Z';
		int numberPerLine = 10;
		
		printChars(ch1, ch2, numberPerLine);
		
		
		
		
		
		
	}

	public static void printChars(char ch1, char ch2, int numberPerLine) {

		int lineCounter = 1;

		for (int i = ch1; i <= ch2; i++) {

			System.out.print((char)i + " ");

			if (lineCounter % numberPerLine == 0) {
				System.out.println();
			}
			
			lineCounter++;

		}

	}

}
