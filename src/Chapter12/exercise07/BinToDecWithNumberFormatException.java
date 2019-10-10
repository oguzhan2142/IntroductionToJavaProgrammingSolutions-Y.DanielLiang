package Chapter12.exercise07;

public class BinToDecWithNumberFormatException {

	public static void main(String[] args) {

		System.out.println(binToDec("112"));
	}

	public static int binToDec(String binaryString) throws NumberFormatException {

		int decimal = 0;

		for (int i = 0; i < binaryString.length(); i++) {
			if (binaryString.charAt(i) != '0' && binaryString.charAt(i) != '1') {
				throw new NumberFormatException("Invalid Binary Number");
			}
		}
		
		for (int i = binaryString.length() -1, pow = 0; i >= 0; i--, pow++) {

			decimal += ((int) (binaryString.charAt(i) - '0') * Math.pow(2, pow));

		}

		return decimal;
	}
}
