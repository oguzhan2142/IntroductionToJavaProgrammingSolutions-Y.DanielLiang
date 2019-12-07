package exercise05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class StoreObjectAndArraysInAFile {
    public static void main(String[] args) {


        int[] array = {1, 2, 3, 4, 5};
        Date date = new Date();
        double d = 5.5;


        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/exercise05/Exercise17_05.dat"));
            outputStream.writeObject(array);
            outputStream.writeObject(date);
            outputStream.writeDouble(d);


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
