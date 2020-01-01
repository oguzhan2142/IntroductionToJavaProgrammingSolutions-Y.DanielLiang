package exercise08;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CountTheOccurrencesOfWordsInTextFile {
    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("src/exercise08/test.txt");

        Scanner scanner = new Scanner(file);

        String text = "";
        while (scanner.hasNext()) {

            text += scanner.nextLine();

        }


        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){/]");


        for (int i = 0; i < words.length; i++) {
            String key = words[i].toLowerCase();
            if (key.length() > 0) {
                if (!map.containsKey(key)) {
                    map.put(key, 1);

                } else {
                    int value = map.get(key);
                    value++;
                    map.put(key, value);

                }
            }

        }


        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();


        // Get key and value from each entry


        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println(entry.getValue() + "\t" + entry.getKey());
        }


    }
}
