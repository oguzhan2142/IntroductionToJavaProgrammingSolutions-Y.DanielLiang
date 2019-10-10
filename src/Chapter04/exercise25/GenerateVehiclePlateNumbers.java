package Chapter04.exercise25;

public class GenerateVehiclePlateNumbers {

	public static void main(String[] args) {

		
		char [] letters = new char [3];
		int [] digits = new int[4];
		
		for (int i = 0; i < letters.length; i++) {
			
			letters[i] = (char)((int)(Math.random() * ('Z' - 'A' + 1 )) + 'A');
			
		}
		
		for (int i = 0; i < digits.length; i++) {
			
			digits[i] = (int) (Math.random() * 10)  ;
			
		}
		
		for (int i = 0; i < letters.length; i++) {
			System.out.print(letters[i]);
		}
		for (int i = 0; i < digits.length; i++) {
			System.out.print(digits[i]);
		}
	}

}
