package exercise23;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        scanner.close();

        System.out.println("dec value is " + bin2Dec(value));


    }

    public static int bin2Dec(String binaryString) {

        int result = 0;
        int lastIndes = binaryString.length() - 1;


        return bin2Dec(binaryString, result, lastIndes);


    }


    public static int bin2Dec(String binaryString, int result, int lastIndex) {

        if (lastIndex < 0)
            return result;


        if (binaryString.charAt(lastIndex) == '1') {
            result += (int) (Math.pow(2, binaryString.length() - lastIndex - 1));
            return bin2Dec(binaryString, result, lastIndex - 1);
        } else {
            return bin2Dec(binaryString, result, lastIndex - 1);
        }


    }
}
