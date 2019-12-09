package exercise28;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class NonrecursiveDirectorySize {

    public static void main(String[] args) {

        System.out.println("Enter a directory:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();


        File file = new File(path);


        ArrayList<File> files = new ArrayList<>();


        files.add(file);

        long size = 0;

        while (!files.isEmpty()) {


            File firstFileInList = files.get(0);


            if (firstFileInList.isDirectory()) {

                File[] underDirectory = firstFileInList.listFiles();
                for (int i = 0; i < underDirectory.length; i++) {

                    if (underDirectory[i].isDirectory())
                        files.add(underDirectory[i]);
                    else
                        size += underDirectory[i].length();
                }
            } else {

                size += firstFileInList.length();

            }


            files.remove(firstFileInList);
        }


        System.out.println("Size:" + size);
    }


}
