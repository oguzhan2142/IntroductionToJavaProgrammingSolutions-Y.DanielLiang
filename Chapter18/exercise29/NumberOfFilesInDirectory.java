package exercise29;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfFilesInDirectory {
    public static void main(String[] args) {
        System.out.println("Enter a directory:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();

        File file = new File(path);

        if (!file.isDirectory()) {
            System.out.println("it is not a directory");
            System.exit(0);
        }

        int fileAmount = 0;

        ArrayList<File> files = new ArrayList<>();
        files.add(file);


        while (!files.isEmpty()) {

            File getFirst = files.get(0);

            File[] theFilesUnderDirectory = getFirst.listFiles();

            for (int i = 0; i < theFilesUnderDirectory.length; i++) {

                if (theFilesUnderDirectory[i].isDirectory())
                    files.add(theFilesUnderDirectory[i]);
                else
                    fileAmount++;
            }


            files.remove(getFirst);
        }


        System.out.println(fileAmount);


    }
}
