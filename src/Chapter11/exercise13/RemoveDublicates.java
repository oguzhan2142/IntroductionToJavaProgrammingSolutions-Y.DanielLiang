package Chapter11.exercise13;

import java.util.ArrayList;

public class RemoveDublicates {

	
	
	public static void removeDuplicates(ArrayList<Integer> list) {
		
		
		for (int i = 0; i < list.size() -1 ; i++) {
			for (int j = i + 1; j < list.size()  ; j++) {
				
				if (list.get(i).equals(list.get(j))) {
					list.remove(j);
					
				}
				
				
			}
		}
		
		
	}
	
	
	
	
	
}
