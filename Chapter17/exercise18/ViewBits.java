package exercise18;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ViewBits {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a file name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        scanner.close();

        FileInputStream inputStream = new FileInputStream("/Users/oguzhan/Chapter17/src/exercise18/" + name);
        int b;
        while ((b = inputStream.read()) != -1) {

            System.out.println(getBits(b));

        }

    }

    public static String getBits(int value) {

        String s = "";


        s += (value % 2 == 0 ? "0" : "1");

        for (int i = 1; i < 8; i++) {


            value = value >> 1;
            s += (value % 2 == 0 ? "0" : "1");

        }

        return s;
    }

}
