package Chapter11.exercise11;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		for (int i = 0; i < 5; i++) {
			
			list.add(scan.nextInt());
			
		}
		scan.close();
		
		
		SortArrayList.sort(list);

		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
	}
	
}
