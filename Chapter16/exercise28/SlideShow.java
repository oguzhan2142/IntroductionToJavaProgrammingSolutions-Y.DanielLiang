package exercise28;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SlideShow extends Application {

    File[] files = new File[10];
    int index = 0;

    @Override
    public void start(Stage primaryStage) throws Exception {

        for (int i = 0; i < files.length; i++) {

            files[i] = new File("/Users/oguzhan/Chapter16/src/exercise28/text/slide" + i + ".txt");

        }
        TextArea textArea = new TextArea();
        textArea.setEditable(false);
        textArea.setWrapText(true);
        textArea.setPrefSize(800,600);

        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {
                textArea.setText("");
            try {
                Scanner scanner = new Scanner(files[index++]);
                while (scanner.hasNext()) {
                    textArea.setText(textArea.getText() + scanner.nextLine());
                }
                if (index == 9) index = 0;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        StackPane pane = new StackPane(textArea);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Slide Show");
        primaryStage.show();
    }
}
