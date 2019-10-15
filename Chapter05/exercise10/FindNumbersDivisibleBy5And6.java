package Chapter05.exercise10;

public class FindNumbersDivisibleBy5And6 {

	public static void main(String[] args) {

		for (int i = 100; i < 1001; i++) {
			
			if (i % 5 ==0 && i % 6 == 0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
	}

}
