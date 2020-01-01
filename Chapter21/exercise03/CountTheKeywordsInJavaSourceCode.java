package exercise03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CountTheKeywordsInJavaSourceCode {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("src/exercise03/test/test2.txt");


        String[] keywordString = {"abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"};


        Set<String> keywordSet = new HashSet<>(Arrays.asList(keywordString));

        int count = 0;


        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {

            String word = scanner.next();

            if (word.equals("//")) {
                scanner.nextLine();
                continue;
            }
            if (word.equals("/*")) {
                while (!word.equals("*\\")) {
                    word = scanner.next();
                }
                continue;
            }


            if (keywordSet.contains(word))
                count++;

        }

        System.out.println("Keyword count is :" + count);

    }
}
