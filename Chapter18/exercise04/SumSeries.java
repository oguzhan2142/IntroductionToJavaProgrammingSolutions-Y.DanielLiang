package exercise04;

public class SumSeries {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            System.out.println("for index " + i + " : " + m(i));


        }


    }


    private static double m(double i) {

        if (i == 1)
            return 1;
        else
            return 1 / i + m(i - 1);


    }
}
