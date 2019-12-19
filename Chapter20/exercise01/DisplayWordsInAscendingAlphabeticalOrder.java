package exercise01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class DisplayWordsInAscendingAlphabeticalOrder {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();


        try {

            Scanner scanner = new Scanner(new File(args[0]));

            while (scanner.hasNext()) {
                words.add(scanner.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.compareTo(o2) > 0)
                    return 1;
                else if (o1.compareTo(o2) < 0)
                    return -1;
                else
                    return 0;
            }
        });

        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }

    }

}
