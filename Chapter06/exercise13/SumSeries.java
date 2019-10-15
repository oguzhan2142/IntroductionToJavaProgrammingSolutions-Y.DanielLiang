package Chapter06.exercise13;

public class SumSeries {

	public static void main(String[] args) {

		System.out.println("i m(i)" );
		System.out.println("___________");
		for (int i = 1; i < 21; i++) {
			
			
			System.out.println(i + " " + sumSeries(i));
			
		}
		
		
		
		
		
	}
	
	
	
	
	
	public static double sumSeries(int i) {
		
		
		double sum = 0;
		
		for (double n = 1; n <= i; n++) {
			
			sum += n / ( n + 1);
		}
		
		
		return sum;
		
	}

}
