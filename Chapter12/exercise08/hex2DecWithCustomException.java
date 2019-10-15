package Chapter12.exercise08;

public class hex2DecWithCustomException {

	public static void main(String[] args) {
		
			System.out.println(hexToDecimal("Ar11"));

	}
	public static int hexToDecimal(String hex) throws HexFormatException  {

		int decimalValue = 0;

		for (int i = 0; i < hex.length(); i++) {

				
			char hexChar = hex.charAt(i);
			if ((hexChar >= 'A' && hexChar <= 'F') || (hexChar >= '0' && hexChar <='9')) {
				decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
			}else {
				
				throw new HexFormatException();
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
