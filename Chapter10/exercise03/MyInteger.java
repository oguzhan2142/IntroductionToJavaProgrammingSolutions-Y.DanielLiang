package Chapter10.exercise03;

public class MyInteger {

	int value;

	public MyInteger(int value) {

		this.value = value;

	}

	public boolean isEven() {

		if (value % 2 == 0) {
			return true;
		}

		return false;

	}

	public boolean isOdd() {

		if (value % 2 != 0) {
			return true;
		}

		return false;

	}

	public boolean isPrime() {

		for (int i = 2; i < value / 2; i++) {

			if (value / i == 0) {
				return false;
			}

		}

		return true;

	}
	
	
	public static boolean isEven(int number) {

		if (number % 2 == 0) {
			return true;
		}

		return false;

	}

	public static boolean isOdd(int number) {

		if (number % 2 != 0) {
			return true;
		}

		return false;

	}

	public static boolean isPrime(int number) {

		for (int i = 2; i < number / 2; i++) {

			if (number / i == 0) {
				return false;
			}

		}

		return true;

	}
	
	
	public boolean equals(int value) {
		
		
		if (this.value == value) {
			return true;
		}
		
		return false;
		
		
		
		
	}

	
	
	
	public boolean equals(MyInteger myinteger) {
		
		
		if (myinteger.value == this.value) {
			return true;
		}
		
		return false;
		
		
		
		
	}
	
	
	
	public static int parseInt(char[] charArray) {
		
		int number = 0;
		
		for (int i = 0; i < charArray.length; i++) {
			
			number += (charArray[i] - '0');
			
			
			if (i == charArray.length - 1) {
				continue;
			}
			
			number *= 10;
		}
		
		return number;
		
	}
	
	public static int parseInt(String str) {
		
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			
			number += str.charAt(i) - '0';
			
			if (i == str.length() - 1) {
				continue;
			}
			number *=10;
		}
		
		return number;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		
		
	}
	
	
	

}
