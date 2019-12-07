package exercise15;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DecryptedFiles {

    public static void main(String[] args) {

        File encriptedFIle = new File("/Users/oguzhan/Chapter17/src/exercise15/EncryptedFile.txt");
        File decryptedFile = new File("/Users/oguzhan/Chapter17/src/exercise15/DecryptedFile.txt");

        try {
            FileInputStream inputStream = new FileInputStream(encriptedFIle);
            FileOutputStream outputStream = new FileOutputStream(decryptedFile);


            for (int i = 0; i < encriptedFIle.length(); i++) {

                byte b = (byte) (inputStream.read() - 5);
                outputStream.write(b);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
