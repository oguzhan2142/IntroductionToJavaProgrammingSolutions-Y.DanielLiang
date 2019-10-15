package Chapter11.exercise04;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		System.out.println("enter integer until type 0");

		Scanner scan = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		Integer x = scan.nextInt();

		while (x != 0) {

			list.add(x);
			x = scan.nextInt();

		}
		scan.close();

		
		Integer largest = MaximumElementInArrayList.max(list);
		System.out.println(largest);
		
	}

}
