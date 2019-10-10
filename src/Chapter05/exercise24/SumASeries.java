package Chapter05.exercise24;

public class SumASeries {

	public static void main(String[] args) {

		double result = 0;
		for (double i = 1; i <= 97; i +=2) {
			
			result += i / (i + 2);
			
			
		}
		
		System.out.println(result);
		
	}

}
