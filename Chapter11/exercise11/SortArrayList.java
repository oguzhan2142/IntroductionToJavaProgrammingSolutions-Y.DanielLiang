package Chapter11.exercise11;

import java.util.ArrayList;

public class SortArrayList {

	public static void sort(ArrayList<Integer> list) {

		for (int i = 0; i < list.size(); i++) {

			for (int j = 0; j < list.size(); j++) {

				if (list.get(i) < list.get(j)) {
					Integer temp1 = list.get(i);
					Integer temp2 = list.get(j);

					list.set(i, temp2);
					list.set(j, temp1);

				}

			}

		}

	}
}
