package exercise04;

public class GenericLinearSearch {
    public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;

    }
}
