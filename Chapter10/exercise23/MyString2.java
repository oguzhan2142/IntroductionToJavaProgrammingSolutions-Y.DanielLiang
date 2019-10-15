package Chapter10.exercise23;

public class MyString2 {

	private String string;

	public MyString2(String s) {

		this.string = s;

	}

	public String getStr() {
		return string;
	}

	public int compare(String s) {
		
		
		return this.string.length() - s.length();
		
	}

	public MyString2 subString(int begin) {

		String modifiedStr = "";

		for (int i = begin; i < this.string.length(); i++) {

			modifiedStr += this.string.charAt(i);

		}

		return new MyString2(modifiedStr);

	}

	public MyString2 toUpperCase() {

		String constructorString = "";

		for (int i = 0; i < this.string.length(); i++) {

			if (string.charAt(i) <= 'z' && string.charAt(i) >= 'a') {

				constructorString += (char) ((int)string.charAt(i) - ('a' - 'A' ));

			} else {

				constructorString += string.charAt(i);
			}

		}
		return new MyString2(constructorString);

	}

	public char[] toChars() {

		char[] toChar = new char[string.length()];

		for (int i = 0; i < string.length(); i++) {

			toChar[i] = string.charAt(i);

		}
		return toChar;
	}
	
	
	public static MyString2 valueOf(boolean b) {
		
		if (b) {
			return new MyString2("True");
		}
		
		return new MyString2("False");
		
	}

	public static void main(String[] args) {

		
		
		MyString2 myStr = new MyString2("Hello World");
		
		
		System.out.println(myStr.toUpperCase().getStr());
		
		
		
	}

}
