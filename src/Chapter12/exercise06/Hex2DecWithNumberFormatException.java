package Chapter12.exercise06;

import java.util.Scanner;

public class Hex2DecWithNumberFormatException {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a hex number");
		String hex = scan.nextLine();
		scan.close();

		System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));

	}

	public static int hexToDecimal(String hex) throws NumberFormatException {

		int decimalValue = 0;

		for (int i = 0; i < hex.length(); i++) {

				
			char hexChar = hex.charAt(i);
			if ((hexChar >= 'A' && hexChar <= 'F') || (hexChar >= '0' && hexChar <='9')) {
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}else {
				
				throw new NumberFormatException("invalid format");
			}

		}
		return decimalValue;
	}

	public static int hexCharToDecimal(char ch) {
		if (ch >= 'A' && ch <= 'F') {
			return 10 + ch - 'A';
		} else {
			return ch - '0';
		}
	}

}
