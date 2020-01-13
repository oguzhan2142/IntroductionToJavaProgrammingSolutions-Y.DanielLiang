package exercise01;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumConsecutiveIncreasinglyOrderedSubstring {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a character squence:");
        String s;
        s = scanner.next();


        ArrayList<Character>[] lists = new ArrayList[s.length()];


        for (int i = 0; i < s.length(); i++) {

            lists[i] = new ArrayList<>();
            lists[i].add(s.charAt(i));

            for (int j = i + 1; j < s.length(); j++) {

                if (s.charAt(j) > lists[i].get(lists[i].size() - 1))
                    lists[i].add(s.charAt(j));

            }

        }


        int maxSizeIndex = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[maxSizeIndex].size() < lists[i].size())
                maxSizeIndex = i;

        }


        System.out.println(lists[maxSizeIndex]);

    }


}
