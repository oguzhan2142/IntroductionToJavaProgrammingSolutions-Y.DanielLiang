package Chapter01.exercise07;

public class ApproximatePI {

	
	
	
	
	public static void main(String[] args) {
		
		double result1 = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11);
		double result2 = 4 * (1.0 - 1/3 + 1/5 - 1/7 + 1/9 - 1/11 + 1/13);
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
