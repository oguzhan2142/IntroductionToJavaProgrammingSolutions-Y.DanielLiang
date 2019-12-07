package exercise07;

public class FibonacciSeries {
    public static int counter = 0;

    public static void main(String[] args) {
        fib(3);
        System.out.println(counter);

    }


    public static long fib(long index) {
        counter++;
        if (index == 0)
            return 0;
        else if (index == 1)
            return 1;
        else return fib(index - 1) + fib(index - 2);


    }
}
