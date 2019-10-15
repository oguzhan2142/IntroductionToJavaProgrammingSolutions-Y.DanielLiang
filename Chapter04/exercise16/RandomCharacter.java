package Chapter04.exercise16;

public class RandomCharacter {

	public static void main(String[] args) {

		
			
			int ch = (int) (Math.random() * ('Z' - 'A' + 1)) + 'A';
			System.out.println((char)ch);
		
		
	}

}
