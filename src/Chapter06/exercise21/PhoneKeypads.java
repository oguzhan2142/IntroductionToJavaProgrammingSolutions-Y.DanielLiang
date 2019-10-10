package Chapter06.exercise21;

import java.util.Scanner;

public class PhoneKeypads {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String num = scan.nextLine();
		
		scan.close();
		
		String transformNum = "";
		
		for (int i = 0; i < num.length(); i++) {
			
			char ch = num.charAt(i);
			
			if (ch >= '0' && ch <= '9') {
				
				transformNum += ch;
				
			}else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				
				
				transformNum += getNumber(ch);
			
			}
			
			
			
		}
		
		System.out.println(transformNum);
		
	}

	public static int getNumber(char ch) {

		ch = Character.toUpperCase(ch);
		
		if (Character.isLetter(ch)) {

			if (ch == 'A' || ch == 'B' || ch == 'C') {
				return 2;
			} else if (ch == 'D' || ch == 'E' || ch == 'F') {
				return 3;

			} else if (ch == 'G' || ch == 'H' || ch == 'I') {
				return 4;
			} else if (ch == 'J' || ch == 'K' || ch == 'L') {
				return 5;

			} else if (ch == 'M' || ch == 'N' || ch == 'O') {
				return 6;

			} else if (ch == 'P' || ch == 'Q' || ch == 'R'
					|| ch == 'S') {
				return 7;

			} else if (ch == 'T' || ch == 'U' || ch == 'V') {
				return 8;

			} else if (ch == 'W' || ch == 'X' || ch == 'Y'
					|| ch == 'Z') {
				return 9;

			} 

		}
		return -1; 

	}
}
