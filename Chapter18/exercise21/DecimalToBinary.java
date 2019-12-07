package exercise21;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        System.out.println("hex value is " + dex2Bin(value));

    }


    public static String dex2Bin(int value) {
        String result = "";
        return dex2Bin(value, result);

    }


    public static String dex2Bin(int value, String result) {

        if (value / 2 == 0)
            return (value % 2) + result;
        else
            return dex2Bin(value / 2, (value % 2) + result); // Recursive call
    }


}
