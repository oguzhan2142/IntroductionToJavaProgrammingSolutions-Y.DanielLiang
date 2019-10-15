package Chapter11.exercise12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	
	public static void main(String[] args) {
		
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five integer:");
		ArrayList<Double> list = new ArrayList<Double>();
		
		
		for (int i = 0; i < 5; i++) {
			list.add(scan.nextDouble());
		}
		scan.close();
		
		
		System.out.println(SumArrayList.sum(list));
		
		
		
		
		
	}
}
