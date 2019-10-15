package Chapter13.exercise03;

import java.util.ArrayList;

public class SortArrayList {

	public static void sort(ArrayList<Number> list) {

		for (int i = 0; i < list.size() - 1; i++) {

			for (int j = i + 1; j < list.size(); j++) {

				if (list.get(i).doubleValue() > list.get(j).doubleValue()) {

					Number temp1 = list.get(i);
					Number temp2 = list.get(j);

					list.set(i, temp2);
					list.set(j, temp1);

				}

			}

		}

	}

}
