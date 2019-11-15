package exercise03;

import com.sun.corba.se.impl.encoding.CDRInputObject;
import javafx.application.Application;
import javafx.stage.Stage;
import org.omg.CORBA.DataInputStream;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SumAllTheIntegersInBinaryDataFIle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        try {

            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("src/exercise03/Exercise07.dat"));
            outputStream.write(10);
            outputStream.write(30);
            outputStream.write(50);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            int sum = 0;
            FileInputStream fileInputStream = new FileInputStream("src/exercise03/Exercise07.dat");
            int i ;
            while ((i = fileInputStream.read()) != - 1){
                sum += i;
            }
            System.out.println(sum);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


    }
}
