package exercise03;

import java.util.ArrayList;

public class DistinctElementsInArraylist {

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

        ArrayList<E> nonDuplicatedList = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            E o = list.get(i);
            if (!nonDuplicatedList.contains(o)) {
                nonDuplicatedList.add(o);
            }
        }
        return nonDuplicatedList;
    }

}
