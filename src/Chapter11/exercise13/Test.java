package Chapter11.exercise13;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		System.out.println("Enter ten integer:");
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			list.add(scan.nextInt());
		}
		scan.close();
		
		
		RemoveDublicates.removeDuplicates(list);
		
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
