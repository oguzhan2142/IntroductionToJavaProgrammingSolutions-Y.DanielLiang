package exercise01;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        String integer = scanner.next();
        System.out.println("result:" + factorial(new BigInteger(integer)));


    }


    public static BigInteger factorial(BigInteger value){

        if (value.equals(new BigInteger("0")))
            return new BigInteger("1");

        else
            return value.multiply(factorial(value.subtract(new BigInteger("1"))));
    }


}
