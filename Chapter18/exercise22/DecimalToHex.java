package exercise22;

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        scanner.close();

        System.out.println("hex value is " + dec2Hex(value));


    }


    public static String dec2Hex(int value) {
        String result = "";
        return dec2Hex(value, result);
    }

    public static String dec2Hex(int value, String result) {

        int reminderInt = value % 16;

        String reminder = reminderInt >= 10 ? String.valueOf((char) ('A' + reminderInt % 10)) : String.valueOf(reminderInt);

        if (value % 16 == 0) {
            return reminder + result;
        } else {
            return dec2Hex(value / 16, reminder + result);
        }

    }
}
