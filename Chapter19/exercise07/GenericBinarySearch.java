package exercise07;

public class GenericBinarySearch {
    public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

        int low = 0;
        int high = list.length - 1;
        int mid = (low + high) / 2;

        while (low <= mid) {
            if (list[mid].compareTo(key) > 0) {
                high = mid - 1;
                mid = (high + low) / 2;
            } else if (list[mid].compareTo(key) == 0) {
                return mid;
            } else if (list[mid].compareTo(key) < 0) {
                low = mid + 1;
                mid = (high + low) / 2;
            }
        }

        return -1;
    }
}
