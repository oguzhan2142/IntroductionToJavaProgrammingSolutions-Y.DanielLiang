package Chapter04.exercise08;

import java.util.Scanner;

public class FindTheCharacterOfAnASCIICode {

	public static void main(String[] args) {

		
		System.out.println("Enter an ASCII code:");
		
		Scanner scan = new Scanner(System.in);
		
		int asciiCode = scan.nextInt();
		scan.close();
		
		if (asciiCode >= 0 && asciiCode <= 127 ) {
			
			System.out.println("The character for ASCII code " + asciiCode + " is " + (char)asciiCode);
		}
		else {
			System.err.println("invalid enterence");
		}
		
	}

}
