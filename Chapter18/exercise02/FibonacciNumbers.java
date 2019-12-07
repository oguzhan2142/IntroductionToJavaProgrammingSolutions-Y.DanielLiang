package exercise02;

import java.util.Scanner;

public class FibonacciNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int index = scanner.nextInt();
        System.out.println("result:" + computeFib(index));

    }


    private static int computeFib(int index) {

        int sum = 0;
        int beforeIndex = 1;
        int beforeBeforeIndex = 0;

        if (index == 0)
            return beforeBeforeIndex;
        else if (index == 1)
            return beforeIndex;


        for (int i = 2; i <= index; i++) {

            sum =  beforeIndex + beforeBeforeIndex;
            beforeBeforeIndex = beforeIndex;
            beforeIndex = sum;

        }


        return sum;
    }

}


