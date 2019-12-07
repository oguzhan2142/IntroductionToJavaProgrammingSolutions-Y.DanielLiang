package exercise03;

import java.util.Scanner;

public class ComputeGreatestCommonDivisorUsingRecursion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("result:" + gcd(m ,n));


    }



    private static int gcd (int m , int n){
        if (m % n == 0)
            return n;
        else
            return gcd(n , m % n);

    }
}
