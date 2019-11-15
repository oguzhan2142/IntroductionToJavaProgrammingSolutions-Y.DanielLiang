package exercise02;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.FileOutputStream;

public class CreateBinaryDataFile extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        FileOutputStream output = new FileOutputStream("src/exercise02/Exercise17_02.dat", true);


        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * 100);
            output.write(random);
        }


    }
}
