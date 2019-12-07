package exercise07;

import exercise06.Loan;

import java.io.*;

public class RestoreObjectsFromFile {
    public static void main(String[] args) throws IOException {


        exercise06.Loan[] loans = new exercise06.Loan[5];
        for (int i = 0; i < loans.length; i++) {
            loans[i] = new Loan((i * 2) , i + 2,1000 * i);
        }

        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("src/exercise07/Exercise17_07.dat"));

            for (int i = 0; i < loans.length; i++) {

                outputStream.writeObject(loans[i]);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("src/exercise07/Exercise17_07.dat"));

            Loan loan;
            while ((loan = (Loan) inputStream.readObject()) != null) {

                System.out.println(loan);
                System.out.println(loan.getLoanAmount());

            }


        } catch (FileNotFoundException | ClassNotFoundException | EOFException e) {
            e.printStackTrace();
        }


    }
}
