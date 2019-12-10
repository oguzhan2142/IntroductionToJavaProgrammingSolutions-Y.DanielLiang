package exercise33;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class KnightsTourAnimation extends Application {
    boolean isRunning = true;
    boolean isClickStartKnight = false;
    Timeline timeline;

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane mainPane = new BorderPane();
        TablePane tablePane = new TablePane();
        Button button = new Button("solve");
        Scene scene = new Scene(mainPane);
        timeline = new Timeline(new KeyFrame(Duration.millis(300), event -> {

            tablePane.move();

            if (tablePane.currentX == tablePane.endX && tablePane.currentY == tablePane.endY) {
                isRunning = false;
            }
            if (!isRunning)
                timeline.stop();
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);

        button.setOnAction(event -> {

            timeline.play();
        });

        tablePane.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            int yIndex = (int) (event.getX() / 80);
            int xIndex = (int) (event.getY() / 80);
            if (yIndex == tablePane.currentY && xIndex == tablePane.currentX) {

                isClickStartKnight = true;
            }

        });


        tablePane.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            if (isClickStartKnight) {


                int yIndex = (int) (event.getX() / 80);
                int xIndex = (int) (event.getY() / 80);

                tablePane.endX = xIndex;
                tablePane.endY = yIndex;
                tablePane.addEndPoint();
                isClickStartKnight = false;
            }
        });

        mainPane.setCenter(tablePane);
        mainPane.setBottom(button);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Knight's Tour");
        primaryStage.show();
    }

    static class TablePane extends Pane {


        Rectangle[][] square = new Rectangle[8][8];
        boolean[][] isPassedBefore = new boolean[8][8];
        private GridPane gridPane;
        private int currentY = 3, currentX = 2;
        private int endY, endX;

        public TablePane() {

            gridPane = new GridPane();

            gridPane.setHgap(0.5);
            gridPane.setVgap(0.5);


            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square[i].length; j++) {

                    square[i][j] = new Rectangle(80, 80);
                    square[i][j].setFill(Color.WHITE);
                    square[i][j].setStroke(Color.BLACK);
                    GridPane.setConstraints(square[i][j], j, i);
                    gridPane.getChildren().add(square[i][j]);

                }
            }
            square[currentX][currentY].setFill(Color.RED);

            isPassedBefore[currentX][currentY] = true;

            getChildren().add(gridPane);
        }


        private void drawPath(int oldXIndex, int oldYIndex, int nextXIndex, int nextYIndex) {

            double oldXCor = (oldXIndex + 1) * 80 - 40;
            double oldYCor = (oldYIndex + 1) * 80 - 40;

            double nextXCor = (nextXIndex + 1) * 80 - 40;
            double nextYCor = (nextYIndex + 1) * 80 - 40;

            Line line = new Line(oldYCor, oldXCor, nextYCor, nextXCor);


            getChildren().add(line);


        }


        public void move() {

            int currentX = this.currentX;
            int currentY = this.currentY;
            int oldX = currentX;
            int oldY = currentY;


            //up-left
            if (isNextPointOK(oldX - 1, oldY - 2)) {

                currentX = oldX - 1;
                currentY = oldY - 2;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;

            }
            //up -right
            else if (isNextPointOK(oldX + 1, oldY - 2)) {

                currentX = oldX + 1;
                currentY = oldY - 2;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;

            }
            //left - up
            else if (isNextPointOK(oldX - 2, oldY - 1)) {


                currentX = oldX - 2;
                currentY = oldY - 1;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;
            }

            //left - down
            else if (isNextPointOK(oldX - 2, oldY + 1)) {

                currentX = oldX - 2;
                currentY = oldY + 1;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;

            }
            //down - left
            else if (isNextPointOK(oldX - 1, oldY + 2)) {

                currentX = oldX - 1;
                currentY = oldY + 2;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;
            }
            //down-right
            else if (isNextPointOK(oldX + 1, oldY + 2)) {

                currentX = oldX + 1;
                currentY = oldY + 2;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;
            }
            //right - up
            else if (isNextPointOK(oldX + 2, oldY - 1)) {
                currentX = oldX + 2;
                currentY = oldY - 1;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;
            }
            //right-down
            else if (isNextPointOK(oldX + 2, oldY + 1)) {
                currentX = oldX + 2;
                currentY = oldY + 1;
                isPassedBefore[currentX][currentY] = true;
                drawPath(oldX, oldY, currentX, currentY);
                this.currentX = currentX;
                this.currentY = currentY;
            }

        }

        private boolean isNextPointOK(int nextX, int nextY) {

            if (isPassedBounds(nextX, nextY))
                return false;
            else
                return !isPassedBefore[nextX][nextY];


        }

        private boolean isPassedBounds(int nextX, int nextY) {
            return nextX > 7 || nextX < 0 || nextY > 7 || nextY < 0;

        }


        private void addEndPoint() {

            square[endX][endY].setFill(Color.BLUE);


        }


    }
}

