package exercise31;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ReplaceWords {
    public static void main(String[] args) {
        String directoryPath = args[0];
        String oldWord = args[1];
        String newWord = args[2];


        replace(new File(directoryPath), oldWord, newWord);
    }


    private static void replace(File file, String oldWord, String newWord) {

        if (file.isDirectory()) {

            File[] files = file.listFiles();
            for (int i = 0; i < files.length; i++) {
                replace(files[i], oldWord, newWord);
            }
        } else {

            replaceWordInFile(file, oldWord, newWord);

        }
    }


    private static void replaceWordInFile(File file, String oldWord, String newWord) {
        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);


            while (scanner.hasNext()) {
                String nextStr = scanner.next();
                list.add(nextStr);
            }

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).equals(oldWord)) {
                    list.remove(list.get(i));
                    list.add(i, newWord);
                }
            }
            scanner.close();
            PrintWriter writer = new PrintWriter(new FileWriter(file));
            for (int i = 0; i < list.size(); i++) {
                writer.write(list.get(i) + " ");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
