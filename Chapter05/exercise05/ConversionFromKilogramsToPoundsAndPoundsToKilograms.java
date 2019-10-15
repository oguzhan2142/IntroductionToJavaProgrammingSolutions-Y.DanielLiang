package Chapter05.exercise05;

public class ConversionFromKilogramsToPoundsAndPoundsToKilograms {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds\t|\tPounds\tKilograms");
		for (int i = 1,j = 20; i < 200 ; i++,j+=5) {
			System.out.print(i + "\t\t" + (i * 1.609) + "\t|\t" );

			
				
				System.out.println(j + "\t" + (j / 2.2) );
			
		}

		
	}

}
