package exercise10.test;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Test {


    public static void main(String[] args) {
        File file = new File(args[0]);


        Map<String, Integer> map = new HashMap<>();

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                String key = scanner.next();

                if (map.containsKey(key)) {
                    Integer value = map.get(key);
                    value++;
                    map.put(key, value);
                } else {
                    map.put(key, 1);

                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        Set<Map.Entry<String, Integer>> entries = map.entrySet();


        Set<String> result = new HashSet<>();
        for (Map.Entry<String, Integer> entry : entries) {

            if (entry.getValue() == 1) {
                result.add(entry.getKey());
            }


        }

        System.out.println(result);
    }


}
