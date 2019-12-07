package exercise14;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EncryptedFiles {
    public static void main(String[] args) {

        final int encryptionCode = 5;


        File source = new File("/Users/oguzhan/Chapter17/src/exercise14/file.txt");
        File target = new File("/Users/oguzhan/Chapter17/src/exercise14/EncryptedFile.txt");

        try {
            FileInputStream inputStream = new FileInputStream(source);
            FileOutputStream outputStream = new FileOutputStream(target);


            for (int i = 0; i < source.length(); i++) {

                byte b = (byte) (inputStream.read() + 5);
                outputStream.write(b);


            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
