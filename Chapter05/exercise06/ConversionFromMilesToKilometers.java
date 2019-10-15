package Chapter05.exercise06;

public class ConversionFromMilesToKilometers {

	public static void main(String[] args) {

		
		System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
		for (int i = 1,j = 20 ; i < 11; i++, j +=5) {
			System.out.print(i + "\t" + (i * 1.609) + "\t\t|\t");
			System.out.println(j + "\t\t" + j/ 1.609 );
			
			
			
			
		}

	}

}
