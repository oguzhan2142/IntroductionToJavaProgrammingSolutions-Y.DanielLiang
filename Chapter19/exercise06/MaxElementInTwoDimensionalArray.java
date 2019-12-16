package exercise06;

public class MaxElementInTwoDimensionalArray {
    public static <E extends Comparable<E>> E max(E[][] list) {
        E maxElement = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {

                if (list[i][j].compareTo(maxElement) > 0)
                    maxElement = list[i][j];

            }
        }
        return maxElement;
    }
}
