package exercise13;

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

public class CombineFilesGUI extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label label0 = new Label("In base file is named temp.txt with three pieces ; temp.txt.0 , temp.txt.1 , temp.txt.2 and combined into temp.txt");
        Label label = new Label("Enter a file:");
        Label label1 = new Label("Specify the number of files:");
        TextField textField = new TextField();
        TextField textField1 = new TextField();


        EventHandler<KeyEvent> eventHandler = new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if (event.getCode() == KeyCode.ENTER) {

                    int numberOfPieces = Integer.parseInt(textField1.getText());
                    File [] sourceFiles = new File[numberOfPieces];
                    File targetFile = new File("/Users/oguzhan/Chapter17/src/exercise13/targetFile.txt");

                    for (int i = 0; i < sourceFiles.length; i++) {

                        sourceFiles[i] = new File(textField.getText() + "." + i);
                        byte[] b = new byte[(int)sourceFiles[i].length()];

                        try {

                            FileInputStream inputStream = new FileInputStream(sourceFiles[i]);
                            FileOutputStream outputStream = new FileOutputStream(targetFile,true);

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
        HBox hBox0 = new HBox(label0);
        HBox hBox = new HBox(label, textField);
        hBox.setAlignment(Pos.CENTER);
        HBox hBox1 = new HBox(label1, textField1);
        hBox1.setAlignment(Pos.CENTER);
        VBox vBox = new VBox(5,hBox0, hBox, hBox1);
        vBox.setPadding(new Insets(10, 10, 10, 10));
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Split Files");
        primaryStage.show();








    }
}
