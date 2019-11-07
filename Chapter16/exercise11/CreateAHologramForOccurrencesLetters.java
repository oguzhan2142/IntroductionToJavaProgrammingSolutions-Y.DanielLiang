package exercise11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreateAHologramForOccurrencesLetters extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox bottomPane = new HBox();
        TextField pathField = new TextField();
        pathField.setPrefWidth(400);
        pathField.setPromptText("Filename:");
        Button viewBtn = new Button("VIEW");
        bottomPane.getChildren().addAll(pathField, viewBtn);

        Histogram histogram = new Histogram();
        mainPane.setCenter(histogram);
        mainPane.setBottom(bottomPane);

        viewBtn.setOnMouseClicked(event -> {

            String path = pathField.getText();
            File file = new File(path);
            histogram.count(file);

        });
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Histogram");
        primaryStage.show();
    }


    class Histogram extends Pane {

        private int[] counts = new int[26];
        private Text[] letters = new Text[26];
        private double widthBox = 20;
        private double width = 600;
        private Rectangle[] rectangle = new Rectangle[26];
        private double scaleFactor = 20;
        private double maxBoxHeight = 300;

        public Histogram() {
            setPrefSize(width, 400);
            for (int i = 0; i < letters.length; i++) {
                String s = (char) ('A' + i) + "";
                letters[i] = new Text((width / 27) * i + 20, getPrefHeight() - 50, s);
                rectangle[i] = new Rectangle();
                rectangle[i].setX((width / 27) * i + 20);
                rectangle[i].setWidth(widthBox);
                rectangle[i].setHeight(0);
                rectangle[i].setY(letters[i].getY() - rectangle[i].getHeight() - 20);
                rectangle[i].setFill(Color.WHITE);
                rectangle[i].setStroke(Color.BLACK);
                getChildren().addAll(letters[i], rectangle[i]);
            }


        }


        public void count(File file) {

            resetCounts();

            try {

                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String nextWord = scanner.next();
                    for (int i = 0; i < nextWord.length(); i++) {
                        char ch = nextWord.charAt(i);
                        ch = Character.toUpperCase(ch);
                        if (ch >= 'A' && ch <= 'Z') {

                            counts[ch - 'A']++;

                        }

                    }
                }
                updateBoxes();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        }

        private double findHighest() {

            double highest = 0;
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > highest)
                    highest = counts[i];

            }
            return highest;
        }

        private void updateBoxes() {

            for (int i = 0; i < rectangle.length; i++) {
                rectangle[i].setHeight((counts[i] * 100 / findHighest()) * maxBoxHeight / 100);
                rectangle[i].setY(letters[i].getY() - rectangle[i].getHeight() - 20);
            }


        }


        private void resetCounts() {
            for (int i = 0; i < counts.length; i++) {
                counts[i] = 0;
            }
        }


        public int[] getCounts() {
            return counts;
        }

        public void setCounts(int[] counts) {
            this.counts = counts;
        }
    }

}
