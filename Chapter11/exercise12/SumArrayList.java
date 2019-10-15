package Chapter11.exercise12;

import java.util.ArrayList;

public class SumArrayList {
	
	
	
	public static double sum(ArrayList<Double> list) {
		
		double sum = 0;
		
		
		for (int i = 0; i < list.size(); i++) {
			
			sum += list.get(i);
		} 
	
		return sum;
	}
	
	

}
