package Chapter10.exercise27;

public class MyStringBuilder1 {

	private String string;

	public MyStringBuilder1(String s) {

		this.string = s;

	}

	public String getString() {
		return this.string;
	}

	public MyStringBuilder1 append(MyStringBuilder1 s) {

		return new MyStringBuilder1(this.string + s.getString());

	}

	public MyStringBuilder1 append(int i) {

		String x = this.string + "" + i;
		return new MyStringBuilder1(x);

	}

	public int length() {

		return this.string.length();

	}

	public char charAt(int index) {

		return this.string.charAt(index);

	}

	public MyStringBuilder1 toLowerCase() {
		String lowerCase = "";

		for (int i = 0; i < this.string.length(); i++) {
			if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
				lowerCase += (char) (string.charAt(i) + ('a' - 'A'));
			} else {
				lowerCase += string.charAt(i);
			}
		}

		return new MyStringBuilder1(lowerCase);
	}
	
	public MyStringBuilder1 subString(int begin , int end) {
		
		String subStr = "";
		
		for (int i = begin; i <= end; i++) {
			subStr += string.charAt(i);
		}
		
		return new MyStringBuilder1(subStr);
		
	}
	public String toString() {
		return string;
	}

	public static void main(String[] args) {

		MyStringBuilder1 asd = new MyStringBuilder1("OGUZ");

		asd = asd.subString(1, 2);
		System.out.println(asd.toString());
	}

}
