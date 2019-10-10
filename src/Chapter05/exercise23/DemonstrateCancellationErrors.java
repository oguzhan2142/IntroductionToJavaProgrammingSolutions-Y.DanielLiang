package Chapter05.exercise23;

public class DemonstrateCancellationErrors {

	public static void main(String[] args) {

		double result = 0;
		
		for (double i = 1; i <= 50001; i+=2) {
			
			result += (i/ (i + 2));
			
		}
		System.out.println(result);
		
		result = 0;
		for (double i = 50000; i >= 1; i -= 2) {
			result += (i/ (i + 2));
		}
		
		System.out.println(result);
		
		
	}

}
