package Chapter05.exercise26;

public class ComputeE {

	public static void main(String[] args) {

		
		double e = 0;
		
		for (int n = 10000; n <= 100000; n += 10000) {
			
			for (double i = 1; i < n; i++) {
				int fact = 1;
				
				for (double j = 1; j <= i; j++) {
					fact *= j;
				}
				
				e += (i/fact);
				
			}
			
			
			System.out.println(e);
			e = 0;
		}
		
		
		
		
	}

}
