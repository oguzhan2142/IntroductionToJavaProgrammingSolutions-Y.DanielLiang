package Chapter11.exercise07;

import java.util.ArrayList;

public class ShuffleArrayList {

	
	
	
	public static void shuffle(ArrayList<Integer> list) {
		
		
		for (int i = 0; i < list.size(); i++) {
			
			int randomIndex = (int)(Math.random() * list.size());
			
			 Integer temp = list.get(randomIndex); 
			 Integer temp2 = list.get(i);
			 list.set(i, temp);
			 list.set(randomIndex, temp2);
			
		}
		
		
	}
}
