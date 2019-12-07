package exercise06;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreLoanObject {
    public static void main(String[] args) throws IOException {


        Loan[] loans = new Loan[5];
        for (int i = 0; i < loans.length; i++) {
            loans[i] = new Loan();
        }

        try {

        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/exercise06/Exercise17_06.dat"));

            for (int i = 0; i < loans.length; i++) {

                outputStream.writeObject(loans[i]);

            }


        }catch (FileNotFoundException e){
            e.printStackTrace();
        }



    }
}


