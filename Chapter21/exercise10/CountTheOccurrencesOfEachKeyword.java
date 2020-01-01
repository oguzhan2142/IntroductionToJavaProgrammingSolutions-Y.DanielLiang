package exercise10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CountTheOccurrencesOfEachKeyword {


    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("src/exercise10/test/test2.txt");


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

        Set<String> keywords = new HashSet<>(Arrays.asList(keywordString));

        Map<String, Integer> map = new HashMap<>();

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


            if (map.containsKey(word)) {
                int value = map.get(word);
                value++;
                map.put(word, value);
            } else {
                if (keywords.contains(word))
                    map.put(word, 1);
            }

        }


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }
    }

}
