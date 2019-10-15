package Chapter05.exercise25;

public class ComputePI {

	public static void main(String[] args) {

		
		double PI = 0;
		
		
		
		for (int i = 10000 ; i <= 1000000 ; i+= 10000) {
			
			for (int j = -1 ; j <= i; j++) {
				
				PI += Math.pow(-1, j + 1) / (2 * j - 1);
				
			}
			
			PI *= 4;
			
			System.out.println("PI for " + i + " is " + PI);
			PI = 0;
		}
		
	}

}
