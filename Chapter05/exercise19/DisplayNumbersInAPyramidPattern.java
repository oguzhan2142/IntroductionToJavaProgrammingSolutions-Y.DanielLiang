package Chapter05.exercise19;

public class DisplayNumbersInAPyramidPattern {

	public static void main(String[] args) {

		final int rows = 8;

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < rows - i; j++) {
				System.out.print("    ");
			}

			int k = 1;
			for (int j = 1; j < i + 1; j++) {
				System.out.printf("%4d",k);
				k *= 2;
			}

			System.out.printf("%4d" , k);


			
			int l = 1;
			for (int j = 1; j < i ; j++) {
				l *= 2;
			}
			
			for (int j = 1; j < i + 1; j++) {
				
				
				System.out.printf("%4d",l);
				l/=2;
				
			}
			

			System.out.println();
		}

	}

}
