package exercise08;

import java.io.*;

public class UpdateCount {
    public static void main(String[] args) throws FileNotFoundException {

        int count = 0;
        File file = new File("src/exercise08/Exercise17_08.dat");
        try {

            FileInputStream inputStream = new FileInputStream(file);

            count = inputStream.read();
            FileOutputStream outputStream = new FileOutputStream(file);
            count++;
            outputStream.write(count);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

