package exercise24;

import java.util.Scanner;

public class HexToDecimal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();
        scanner.close();

        System.out.println("dec value is " + hex2Dec(value));
    }


    public static int hex2Dec(String hexString) {

        int lastIndex = hexString.length() - 1;
        int result = 0;

        return hex2Dec(hexString, result, lastIndex);


    }

    public static int hex2Dec(String hexString, int result, int lastIndex) {


        if (lastIndex < 0)
            return result;

        char numberInLast = hexString.charAt(lastIndex);

        if (numberInLast >= '1' && numberInLast <= '9') {

            result += (numberInLast - '0' ) * Math.pow(16, hexString.length() - lastIndex - 1);
            return hex2Dec(hexString, result, lastIndex - 1);

        } else {

            result += (numberInLast - 'A' + 10) * Math.pow(16, hexString.length() - lastIndex - 1);
            return hex2Dec(hexString , result , lastIndex - 1);
        }


    }
}
