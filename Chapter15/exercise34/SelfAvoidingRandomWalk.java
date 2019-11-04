package exercise34;

import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.Random;

public class SelfAvoidingRandomWalk extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Screen screen = new Screen();
        BorderPane borderPane = new BorderPane();
        Button startBtn = new Button("Start");
        borderPane.setCenter(screen);
        borderPane.setBottom(startBtn);
        borderPane.setAlignment(startBtn, Pos.CENTER);
        startBtn.setOnMouseClicked(event -> {
            screen.start();
        });

        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("Self Avoiding Random Walk");
        primaryStage.show();
    }


    class Screen extends Pane {

        private Polyline path = new Polyline();
        private ObservableList<Double> point = path.getPoints();
        private int squareAmount = 16;
        private double squareWidth = 40;
        private double squareHeight = 40;
        private double WIDTH = squareWidth * squareAmount;
        private double HEIGHT = squareHeight * squareAmount;
        private double startX = WIDTH / 2;
        private double startY = HEIGHT / 2;
        private Timeline timeline;
        private char direction = 'r';

        public Screen() {
            setPrefSize(WIDTH, HEIGHT);
            paintLines();
            point.add(startX);
            point.add(startY);
            getChildren().add(path);
            requestFocus();
        }

        private boolean isPointInPath(double x, double y) {

            for (int i = 0; i < point.size(); i += 2) {

                if (point.get(i) == x && point.get(i + 1) == y)
                    return true;


            }

            return false;
        }


        private void addRandomPoints() {

            Random random = new Random();
            boolean xOrYDirection = random.nextBoolean();
            boolean positiveOrNegative = random.nextBoolean();
            double lastXPosition = point.get(point.size() - 2);
            double lastYPosition = point.get(point.size() - 1);


            if (xOrYDirection) {
                if (positiveOrNegative) {
                    double nextX = lastXPosition + squareWidth;
                    double nextY = lastYPosition + 0;
                    if (isPointInPath(nextX, nextY)) {
                        return;
                    }
                    point.add(nextX);
                    point.add(nextY);

                } else {
                    double nextY = lastYPosition + 0;
                    double nextX = lastXPosition - squareWidth;
                    if (isPointInPath(nextX, nextY)) {
                        return;
                    }
                    point.add(nextX);
                    point.add(nextY);
                }

            } else {
                if (positiveOrNegative) {
                    double nextX = lastXPosition + 0;
                    double nextY = lastYPosition + squareHeight;
                    if (isPointInPath(nextX, nextY)) {
                        return;
                    }
                    point.add(nextX);
                    point.add(nextY);
                } else {
                    double nextX = lastXPosition + 0;
                    double nextY = lastYPosition - squareHeight;
                    if (isPointInPath(nextX, nextY)) {
                        return;
                    }
                    point.add(nextX);
                    point.add(nextY);
                }
            }


        }

        public void start() {

            while (!isDeadEnd() && !isBoundry()) {
                addRandomPoints();
            }

        }

        private boolean isBoundry() {

            double lastXPosition = point.get(point.size() - 2);
            double lastYPosition = point.get(point.size() - 1);

            if (lastXPosition == 0 || lastXPosition == WIDTH) {
                return true;
            }
            if (lastYPosition == 0 || lastYPosition == HEIGHT) {
                return true;
            }
            return false;
        }

        private boolean isDeadEnd() {

            double lastXPosition = point.get(point.size() - 2);
            double lastYPosition = point.get(point.size() - 1);

            if (isPointInPath(lastXPosition + squareWidth, lastYPosition) && isPointInPath(lastXPosition - squareWidth, lastYPosition) && isPointInPath(lastXPosition, lastYPosition + squareHeight) && isPointInPath(lastXPosition, lastYPosition - squareHeight)
            ) {
                return true;
            }


            return false;
        }

        private void paintLines() {

            Line[] hLines = new Line[squareAmount - 1];
            Line[] vLines = new Line[squareAmount - 1];

            for (int i = 0; i < hLines.length; i++) {
                hLines[i] = new Line((i + 1) * squareWidth, 0, (i + 1) * squareWidth, this.getPrefHeight());
                vLines[i] = new Line(0, (i + 1) * squareHeight, this.getPrefWidth(), (i + 1) * squareHeight);
                hLines[i].setOpacity(0.2);
                vLines[i].setOpacity(0.2);
                this.getChildren().addAll(hLines[i], vLines[i]);
            }


        }

    }
}
