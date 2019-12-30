package exercise20;

import java.io.File;
import java.util.Scanner;
import java.util.Stack;

public class NonrecursiveDirectorySize {

    public static void main(String[] args) {

        System.out.println("Enter a directory:");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        scanner.close();


        File file = new File(path);


        Stack<File> stack = new Stack<>();

        stack.push(file);

        long size = 0;

        while (!stack.isEmpty()) {


            File firstFileInList = stack.pop();


            if (firstFileInList.isDirectory()) {

                File[] underDirectory = firstFileInList.listFiles();

                for (int i = 0; i < underDirectory.length; i++) {

                    if (underDirectory[i].isDirectory())
                        stack.push(underDirectory[i]);
                    else
                        size += underDirectory[i].length();
                }
            } else {

                size += firstFileInList.length();
            }
        }


        System.out.println("Size:" + size);
    }


}
