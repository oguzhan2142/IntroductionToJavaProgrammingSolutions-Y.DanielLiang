package exercise04;

import java.io.*;
import java.util.Scanner;

public class ConvertTextFileIntoUTF {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("Usage: Java CovertTextFileIntoUTF --source --target");
            System.exit(0);
        }

        File inputFile = new File(args[0]);
        File outputFile = new File(args[1]);

        try {
            Scanner scanner = new Scanner(inputFile);
            DataOutputStream output = new DataOutputStream(new FileOutputStream(outputFile));
            while (scanner.hasNext()) {

                output.writeUTF(scanner.nextLine());

            }
            long sizeTextFile = inputFile.length();
            long sizeBinaryFile = outputFile.length();


            System.out.println("Text File Size: " + sizeTextFile);
            System.out.println("Binary File Size: " + sizeBinaryFile);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
