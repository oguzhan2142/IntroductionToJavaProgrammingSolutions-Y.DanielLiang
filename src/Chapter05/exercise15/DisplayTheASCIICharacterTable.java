package Chapter05.exercise15;

public class DisplayTheASCIICharacterTable {

	public static void main(String[] args) {

		
		int i = '!';
		
		while (i <= '~') {
			
			System.out.print((char)i + " ");
			
			if ((i -2) % 10 == 0 ) {
				
				System.out.println();
				
			}
			i++;
		}
		
		
	}

}
