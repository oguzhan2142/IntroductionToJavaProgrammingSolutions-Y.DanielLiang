package Chapter13.exercise02;

import java.util.ArrayList;

public class ShuffleArrayList {

	public static void shuffle(ArrayList<Number> list) {

		for (int i = 0; i < list.size(); i++) {
			int randomIndex = (int) Math.random() * list.size();
			Number temp = list.get(i);
			Number temp2 = list.get(randomIndex);

			list.set(randomIndex, temp);
			list.set(i, temp2);

		}

	}

}
