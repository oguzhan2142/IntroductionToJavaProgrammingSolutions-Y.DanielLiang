package exercise10;

import java.util.ArrayList;

public class LargestElementInArraylist {
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        E max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (max.compareTo(list.get(i)) < 0)
                max = list.get(i);
        }
        return max;
    }

}
