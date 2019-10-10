package Chapter11.exercise14;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five integers for list1:");
		ArrayList<Integer> list1 = new ArrayList<Integer>();

		for (int i = 0; i < 5; i++) {
			list1.add(scan.nextInt());
		}
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		System.out.println("Enter five integers for list2:");
		for (int i = 0; i < 5; i++) {
			list2.add(scan.nextInt());
		}
		scan.close();

		ArrayList<Integer> unionList = CombineTwoLists.union(list1, list2);

		for (int i = 0; i < unionList.size(); i++) {
			System.out.println(unionList.get(i));
		}

	}

}
