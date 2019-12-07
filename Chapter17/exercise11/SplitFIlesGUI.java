package exercise11;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class SplitFIlesGUI extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label = new Label("Enter a file:");
        Label label1 = new Label("Specify the number of files:");
        TextField textField = new TextField();
        TextField textField1 = new TextField();


        EventHandler<KeyEvent> eventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if (event.getCode() == KeyCode.ENTER) {

                    File sourceFile = new File(textField.getText());
                    int numberOfPieces = Integer.parseInt(textField1.getText());
                    int sizeOfPieces = (int) (sourceFile.length() / numberOfPieces);
                    File[] piece = new File[numberOfPieces];

                    for (int i = 0; i < piece.length; i++) {

                        byte[] b = new byte[sizeOfPieces];
                        piece[i] = new File("/Users/oguzhan/Chapter17/src/exercise11/pieces" + i + ".txt");

                        try {

                            FileInputStream inputStream = new FileInputStream(sourceFile);
                            FileOutputStream outputStream = new FileOutputStream(piece[i]);

                            inputStream.skip(i * sizeOfPieces);
                            inputStream.read(b);
                            outputStream.write(b);


                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }


                }


            }
        };
        textField.setOnKeyPressed(eventHandler);
        textField1.setOnKeyPressed(eventHandler);

        HBox hBox = new HBox(label, textField);
        hBox.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(label1, textField1);
        hBox1.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(5, hBox, hBox1);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Split Files");
        primaryStage.show();


    }
}
