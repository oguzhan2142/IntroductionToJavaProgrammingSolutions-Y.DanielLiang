package Chapter11.exercise14;

import java.util.ArrayList;

public class CombineTwoLists {

	public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {

		for (int i = 0; i < list2.size(); i++) {
			list1.add(list2.get(i));
		}

		return list1;

	}
}
