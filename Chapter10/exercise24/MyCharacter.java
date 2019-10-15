package Chapter10.exercise24;

public class MyCharacter {

	private char charValue;

	public MyCharacter(char value) {

		this.charValue = value;
	
	}

	public MyCharacter toUpperCase() {
		
		this.charValue = (char)(this.charValue - ('a' - 'A'));
		
		return new MyCharacter(charValue);
		
	}

	public String toString() {
		String str = "" + this.charValue;
		return str;

	}

	public static void main(String[] args) {

		MyCharacter x = new MyCharacter('c');
		
		System.out.println(x.toUpperCase().toString());
		
	}

}
