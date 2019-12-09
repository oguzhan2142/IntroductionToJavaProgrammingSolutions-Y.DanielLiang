package exercise32;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class KnightsTour extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane mainPane = new BorderPane();
        TablePane tablePane = new TablePane();
        Button button = new Button("solve");

        button.setOnAction(event -> {

            tablePane.move();

        });

        mainPane.setCenter(tablePane);
        mainPane.setBottom(button);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Knight's Tour");
        primaryStage.show();
    }

    class TablePane extends GridPane {

        Rectangle[][] square = new Rectangle[8][8];
        boolean[][] isPassedBefore = new boolean[8][8];
        private int currentX = 4, currentY = 4;
        private Polygon polygon;

        public TablePane() {


            setHgap(0.5);
            setVgap(0.5);
            polygon = new Polygon();


            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square[i].length; j++) {

                    square[i][j] = new Rectangle(80, 80);
                    square[i][j].setFill(Color.WHITE);
                    square[i][j].setStroke(Color.BLACK);
                    setConstraints(square[i][j], j, i);
                    getChildren().add(square[i][j]);

                }
            }

            drawPath(currentX, currentY);
            getChildren().add(polygon);
        }


        private void drawPath(int nextMoveX, int nextMoveY) {

            double x = square[nextMoveX][nextMoveY].getX() + square[nextMoveX][nextMoveY].getWidth() / 2;
            double y = square[nextMoveX][nextMoveY].getY() + square[nextMoveX][nextMoveY].getHeight() / 2;

            polygon.getPoints().add(x);
            polygon.getPoints().add(y);
            getChildren().remove(polygon);
            getChildren().add(polygon);


        }


        public void move() {

            int x = currentX;
            int y = currentY;


            //up-left
            if (!isPassedBefore[x - 1][y - 2]) {

                currentX = x - 1;
                currentY = y - 2;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);

            }
            //up -right
            else if (!isPassedBefore[x + 1][y - 2]) {

                currentX = x + 1;
                currentY = y - 2;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);

            }
            //left - up
            else if (!isPassedBefore[x - 2][y - 1]) {


                currentX = x - 2;
                currentY = y - 1;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);
            }

            //left - down
            else if (!isPassedBefore[x - 2][y + 1]) {

                currentX = x - 2;
                currentY = y + 1;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);

            }
            //down - left
            else if (!isPassedBefore[x - 1][y + 2]) {

                currentX = x - 1;
                currentY = y + 2;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);

            }
            //down-right
            else if (!isPassedBefore[x + 1][y + 2]) {

                currentX = x + 1;
                currentY = y + 2;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);

            }
            //right - up
            else if (!isPassedBefore[x + 2][y - 1]) {
                currentX = x + 2;
                currentY = y - 1;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);


            }
            //right-down
            else if (!isPassedBefore[x + 2][y + 1]) {
                currentX = x + 2;
                currentY = y + 1;
                isPassedBefore[currentY][currentY] = true;
                drawPath(currentX, currentY);
            }

            System.out.println();
            System.out.println();
            System.out.println();
            for (int i = 0; i < isPassedBefore.length; i++) {

                for (int j = 0; j < isPassedBefore[0].length; j++) {
                    System.out.print(isPassedBefore[i][j] + " ");
                }
                System.out.println();

            }

        }


    }
}

