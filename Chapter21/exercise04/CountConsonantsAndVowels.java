package exercise04;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountConsonantsAndVowels {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File(args[0]);

        Set<Character> characterSet = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U'));
        Scanner scanner = new Scanner(file);
        int vovels = 0;
        int consonants = 0;

        while (scanner.hasNext()) {

            String nextWord = scanner.next();

            nextWord = nextWord.toUpperCase();
            for (int i = 0; i < nextWord.length(); i++) {

                char ch = nextWord.charAt(i);
                if ((ch <= 'Z' && ch >= 'A')) {

                    if (characterSet.contains(ch)) {
                        vovels++;
                    } else {
                        consonants++;
                    }

                }

            }
        }

        System.out.println("Vowels count is :" + vovels);
        System.out.println("consonants count is :" + consonants);

    }
}
