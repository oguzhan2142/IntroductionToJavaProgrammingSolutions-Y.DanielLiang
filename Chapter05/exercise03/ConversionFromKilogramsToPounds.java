package Chapter05.exercise03;

public class ConversionFromKilogramsToPounds {

	public static void main(String[] args) {

		System.out.println("Kilograms\tPounds");
		for (int i = 1; i < 200; i++) {
			System.out.println(i + "\t" + (((i * 2.2) * 10) % 10000) / 10);
		}
		
	}

}
