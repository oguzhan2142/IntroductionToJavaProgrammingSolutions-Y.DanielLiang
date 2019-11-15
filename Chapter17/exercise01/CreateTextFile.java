package exercise01;

import javafx.application.Application;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class CreateTextFile extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        File file = new File("src/exercise01/test.txt");

        try (
                PrintWriter printWriter = new PrintWriter(new FileOutputStream(file, true));


        ) {


            for (int i = 0; i < 100; i++) {

                int random = (int) (Math.random() * 100);
                printWriter.print(random);
            }

        }


    }
}
