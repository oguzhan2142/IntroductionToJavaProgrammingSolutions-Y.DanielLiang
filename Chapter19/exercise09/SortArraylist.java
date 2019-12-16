package exercise09;

import java.util.ArrayList;

public class SortArraylist {
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {

        for (int i = 0; i < list.size(); i++) {
            E obj = list.get(i);
            for (int j = 0; j < list.size(); j++) {
                E obj2 = list.get(j);
                if (obj.compareTo(obj2) > 0) {
                    list.set(i, obj2);
                    list.set(j, obj);
                }
            }

        }


    }

}
