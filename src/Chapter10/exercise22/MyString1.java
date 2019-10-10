package Chapter10.exercise22;

public class MyString1 {

	private char[] chars;

	public MyString1(char[] chars) {

		this.chars = chars;

	}

	public char charAt(int index) {

		return this.chars[index];

	}

	public int length() {

		return this.chars.length;

	}

	public MyString1 subString(int begin, int end) {

		char[] newArray = new char[end - begin + 1];

		for (int i = 0; i < newArray.length; i++) {

			newArray[i] = this.chars[begin + i];

		}
		MyString1 subString = new MyString1(newArray);
		return subString;
	}

	public MyString1 toLowerCase() {

		char[] lowerCaseLetters = new char[this.chars.length];

		for (int i = 0; i < this.chars.length; i++) {

			if (chars[i] >= 'A' && chars[i] <= 'Z') {
				lowerCaseLetters[i] = (char) ((int) chars[i] - ('a' - 'A'));
			} else {

				lowerCaseLetters[i] = chars[i];

			}

		}

		MyString1 newStr = new MyString1(lowerCaseLetters);
		return newStr;

	}


	public boolean equals(MyString1 s) {

		if (s.length() != chars.length) {
			return false;
		}

		for (int i = 0; i < s.length(); i++) {

			if (chars[i] != s.charAt(i)) {
				return false;
			}

		}
		return true;

	}

	public static MyString1 valueOf(int i) {

		String str = "" +i;
		char charArr[] = str.toCharArray();
		
		return new MyString1(charArr);
	}

	public static void main(String[] args) {

		char[] chararray = { 'A', 'l', 'i' };
		char[] chararray2 = { 'A', 'l', 'a' };
		MyString1 str = new MyString1(chararray);
		MyString1 str2 = new MyString1(chararray2);
		System.out.print(str.equals(str2));

	}

}
