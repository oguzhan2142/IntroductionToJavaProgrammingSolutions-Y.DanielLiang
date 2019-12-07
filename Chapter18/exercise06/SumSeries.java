package exercise06;

public class SumSeries {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println("for index " + i + " : " + m(i));
        }


    }

    private static double m(double index) {

        if (index == 0)
            return 0;

        else
            return (index / (index + 1)) + m(index - 1);

    }
}
