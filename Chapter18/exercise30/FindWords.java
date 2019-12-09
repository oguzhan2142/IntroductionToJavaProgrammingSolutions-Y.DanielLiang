package exercise30;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindWords {

    public static int counter = 0;

    public static void main(String[] args) {

        String directoryPath = args[0];
        String word = args[1];

        File file = new File(directoryPath);

        getWordAmount(file, word);

        System.out.println(counter);
    }


    private static void getWordAmount(File file, String word) {

        if (file.isDirectory()) {
            File[] files = file.listFiles();

            for (int i = 0; i < files.length; i++) {

                if (files[i].isDirectory()) {
                    getWordAmount(files[i], word);
                } else {
                    counter += countWordsInAFile(files[i], word);
                }
            }

        } else {
            counter += countWordsInAFile(file, word);
        }
    }


    private static int countWordsInAFile(File file, String word) {

        int counter = 0;
        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {
                if (scanner.next().equals(word))
                    counter++;
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return counter;
    }
}
