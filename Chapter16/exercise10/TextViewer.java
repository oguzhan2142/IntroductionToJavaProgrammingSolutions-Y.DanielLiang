package exercise10;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextViewer extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox mainPane = new VBox();
        TextArea screen = new TextArea();
        ScrollPane scrollPane = new ScrollPane(screen);
        HBox bottomPane = new HBox();
        bottomPane.setAlignment(Pos.CENTER);
        TextField pathField = new TextField();
        pathField.setPromptText("Filename:");
        Button viewBtn = new Button("VIEW");
        pathField.setPrefWidth(400);
        viewBtn.setOnMouseClicked(event -> {

            String path = pathField.getText();
            File file = new File(path);
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    screen.setText(screen.getText() + scanner.nextLine() + "\n");

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        });


        bottomPane.getChildren().addAll(pathField, viewBtn);
        mainPane.getChildren().addAll(scrollPane, bottomPane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Text Viewer");
        primaryStage.show();
    }
}
