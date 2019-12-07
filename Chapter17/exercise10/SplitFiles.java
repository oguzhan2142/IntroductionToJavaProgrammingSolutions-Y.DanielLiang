package exercise10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFiles {
    public static void main(String[] args) throws IOException {


        if (args.length != 2)
            System.out.println("Usage:java SplitFiles -source -number of pieces");


        File source = new File(args[0]);
        int numberOfPieces = Integer.parseInt(args[1]);
        File[] files = new File[numberOfPieces];

        int sizeOfPieces = (int) (source.length() / (double) numberOfPieces);

        for (int i = 0; i < files.length; i++) {

            String path = "/Users/oguzhan/Chapter17/src/exercise10/pieces" + (i + 1) + ".dat";
            files[i] = new File(path);


            try {

                FileOutputStream outputStream = new FileOutputStream(files[i]);
                FileInputStream inputStream = new FileInputStream(source);

                byte[] b = new byte[sizeOfPieces];
                inputStream.skip(i * sizeOfPieces);
                inputStream.read(b);
                outputStream.write(b);


            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


}
