package exercise07;

import java.util.*;

public class CountOccurrenceOfWords {
    public static void main(String[] args) {


        String text = "Good morning. Have a good class. " +
                "Have a good visit. Have fun!";
// Create a TreeMap to hold words as key and count as value


        Map<String, Integer> map = new TreeMap<>();
        String[] words = text.split("[ \n\t\r.,;:!?(){]");


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


        Stack<Object> stack = new Stack<>();


        for (Map.Entry<String, Integer> entry : entrySet){
            stack.push(entry.getKey());
            stack.push(entry.getValue());
        }

        for (int i = 0; i < stack.size(); i++) {

            System.out.println(stack.pop() + "\t" + stack.pop());
        }






    }
}