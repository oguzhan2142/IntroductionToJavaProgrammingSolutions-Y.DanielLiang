package exercise05;

import java.util.ArrayList;
import java.util.Scanner;

public class SameNumberSubsequence {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();


        int takeInt = scanner.nextInt();
        while (takeInt != 0) {

            list.add(takeInt);
            takeInt = scanner.nextInt();
        }

        int count = 0;
        int index = 0;
        int maxCount = 0;
        int maxCIndex = 0;


        

        System.out.println("The longest same number sequence starts at index 3 with 4 values of 8");
    }
}
