package exercise13;

public class FindTheLargestNumberInArray {
    public static void main(String[] args) {

        int[] test = {1 ,2 ,3, 4, 5,12, 123, 6,3,12,34,55,3,3 };

        System.out.println(largest(test));

    }


    private static int largest(int[] array) {

        return largest(array, array.length - 1, array[array.length - 1]);

    }

    private static int largest(int[] array, int lastIndex, int max) {


        if (lastIndex < 0)
            return max;

        else if (max > array[lastIndex])
            return largest(array, lastIndex - 1, max);
        else
            return largest(array, lastIndex - 1, array[lastIndex]);


    }
}
