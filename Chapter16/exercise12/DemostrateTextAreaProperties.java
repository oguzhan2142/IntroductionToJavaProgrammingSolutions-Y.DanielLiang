package exercise12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.util.Scanner;

public class DemostrateTextAreaProperties extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox bottomPane = new HBox();
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setSpacing(20);
        StackPane textPane = new StackPane();
        CheckBox editableBtn = new CheckBox("Editable");
        CheckBox wrapBtn = new CheckBox("Wrap");
        TextArea textArea = new TextArea();
        File file = new File("/Users/oguzhan/Chapter16/src/exercise12/text.txt");
        Scanner scanner = new Scanner(file);
        String s = null;
        while (scanner.hasNext()) {
            s += (scanner.nextLine() + "\n");
        }


        textArea.setText(s);

        editableBtn.setOnAction(event -> {
            if (editableBtn.isSelected())
                textArea.setEditable(false);
            else
                textArea.setEditable(true);
        });

        wrapBtn.setOnAction(event -> {
            if (wrapBtn.isSelected())
                textArea.setWrapText(true);
            else
                textArea.setWrapText(false);

        });


        textPane.getChildren().add(textArea);
        bottomPane.getChildren().addAll(wrapBtn, editableBtn);
        mainPane.setBottom(bottomPane);
        mainPane.setCenter(textPane);
        primaryStage.setScene(new Scene(mainPane, 400, 400));
        primaryStage.setTitle("TextArea Properties");
        primaryStage.show();
    }
}
