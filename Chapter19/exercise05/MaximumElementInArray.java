package exercise05;

public class MaximumElementInArray {
    public static <E extends Comparable<E>> E max(E[] list) {

        E maxElement = list[0];

        for (int i = 1; i < list.length; i++) {
            if (maxElement.compareTo(list[i]) < 0)
                maxElement = list[i];
        }
        return maxElement;
    }
}
