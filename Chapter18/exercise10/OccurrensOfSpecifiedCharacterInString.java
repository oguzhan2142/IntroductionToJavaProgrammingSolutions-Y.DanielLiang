package exercise10;

import java.util.Scanner;

public class OccurrensOfSpecifiedCharacterInString {
    public static void main(String[] args) {

        System.out.println("enter a word and a character:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char a = scanner.next().charAt(0);
        scanner.close();

        System.out.println(count(str , a));
    }

    public static int count(String str, char a) {

        if (str.length() == 0)
            return 0;
        else if (str.charAt(str.length() - 1) == a)
            return 1 + count(str.substring(0, str.length() - 1), a);
        else
            return count(str.substring(0, str.length() - 1), a);
    }
}
