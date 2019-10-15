package Chapter10.exercise28;

public class MyStringBuilder2 {

	char[] chars;

	public char[] getChars() {
		return chars;
	}

	public MyStringBuilder2() {

	}

	public MyStringBuilder2(char[] chars) {

		this.chars = chars;

	}

	public MyStringBuilder2(String s) {

		chars = s.toCharArray();

	}

	public MyStringBuilder2 insert(int offset, MyStringBuilder2 s) {

		String insertedStr = "";

		for (int i = 0; i < offset; i++) {

			insertedStr += chars[i];
		}

		for (int i = 0; i < s.getChars().length; i++) {
			insertedStr += s.getChars()[i];
		}
		for (int i = offset; i < chars.length; i++) {
			insertedStr += chars[i];
		}

		return new MyStringBuilder2(insertedStr);

	}

	public MyStringBuilder2 reverse() {

		char[] reverse = new char[this.chars.length];

		for (int i = this.chars.length - 1; i >= 0; i++) {

			reverse[i] = this.chars[i];

		}

		return new MyStringBuilder2(reverse);
	}

	public MyStringBuilder2 subString(int begin) {

		String subStr = "";

		for (int i = begin; i < this.chars.length; i++) {

			subStr += chars[i];

		}

		return new MyStringBuilder2(subStr);

	}

	public MyStringBuilder2 toUpperCase() {

		for (int i = 0; i < this.chars.length; i++) {

			if (chars[i] >= 'A' && chars[i] <= 'Z') {

				chars[i] -= ('Z' - 'A' + 1);

			}

		}

		return new MyStringBuilder2(chars);

	}

	public String toString() {
		String x = "";
		for (int i = 0; i < chars.length; i++) {
			x += chars[i];
		}

		return x;
	}

	public static void main(String[] args) {

		MyStringBuilder2 myStr = new MyStringBuilder2("naberasd");

		myStr = myStr.insert(1, new MyStringBuilder2("AAAA"));
		System.out.println(myStr.toString());

	}
}
