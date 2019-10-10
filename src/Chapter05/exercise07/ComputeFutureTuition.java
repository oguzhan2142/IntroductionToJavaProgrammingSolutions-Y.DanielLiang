package Chapter05.exercise07;

public class ComputeFutureTuition {

	public static void main(String[] args) {

		
	float tuition = 10000;	
	float [] tenYears = new float [10];
	float totalCostOfFourYears = 0;
	
	for (int i = 0; i < 10; i++) {
		
		tenYears[i] = tuition;
		tuition *= 1.05;
		
	}
	
	for (int i = 0; i < tenYears.length; i++) {
		System.out.println((i + 1) + ". year: " + tenYears[i]);
	}
	
	for (int i = 0; i < 4; i++) {
		totalCostOfFourYears += tenYears[i];
	}
	
	System.out.println("\nTotal cost of four years:" + totalCostOfFourYears);
	
		
	}

}
