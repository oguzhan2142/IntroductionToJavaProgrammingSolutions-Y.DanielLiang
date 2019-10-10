package Chapter11.exercise07;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> list = new  ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		ShuffleArrayList.shuffle(list);
		
		System.out.println("\n\nAfter shuffle:");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}

}
