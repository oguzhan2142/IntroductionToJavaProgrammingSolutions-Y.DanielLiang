package exercise16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of an ASCII text file:");
        String name = scanner.next();
        scanner.close();

        int[] length = new int['Z' - 'A' + 1];

        try {

            File file = new File("/Users/oguzhan/Chapter17/src/exercise16/" + name);
            FileInputStream inputStream = new FileInputStream(file);
            Scanner fileScan = new Scanner(file);


            for (int i = 0; i < file.length(); i++) {


                int next = inputStream.read();
                if ((next >= 'A' && next <= 'Z') || (next >= 'a' && next <= 'z')) {
                    if (next > 'Z')
                        next -= ('a' - 'A');

                    length[next - 'A']++;
                }

            }

            for (int i = 0; i < length.length; i++) {

                System.out.println((char) ('A' + i) + ":" + length[i]);


            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
