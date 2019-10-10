package Chapter11.exercise04;

import java.util.ArrayList;

public class MaximumElementInArrayList {

	public static Integer max(ArrayList<Integer> list) {

		if (list.size() == 0 || list == null) {
			return null;

		}

		Integer max = list.get(0);
		for (int i = 0; i < list.size(); i++) {

			if (max < list.get(i)) {
				max = list.get(i);
			}

		}
		return max;

	}

}
