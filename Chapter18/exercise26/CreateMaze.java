package exercise26;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class CreateMaze extends Application {
    Maze maze;

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        maze = new Maze();


        Button findBtn = new Button("Find Path");
        Button clearBtn = new Button("Clear Path");

        findBtn.setOnAction(event -> {
            maze.findPath();
        });

        clearBtn.setOnAction(event -> {

            maze.clear();

        });
        maze.setOnMouseClicked(event -> {

            double x = event.getX();
            double y = event.getY();

            maze.addTick(x, y);


        });
        HBox buttonPane = new HBox(20, findBtn, clearBtn);
        buttonPane.setAlignment(Pos.CENTER);

        mainPane.setCenter(maze);
        mainPane.setBottom(buttonPane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Maze");
        primaryStage.show();
    }


    class Maze extends GridPane {

        private double paneWidth = 640;
        private double paneHeight = 640;

        private Rectangle[][] square = new Rectangle[8][8];
        private boolean[][] isTicked = new boolean[8][8];


        public Maze() {


            setPrefSize(paneWidth, paneHeight);

            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square[i].length; j++) {

                    square[i][j] = new Rectangle(paneWidth / 8, paneHeight / 8);
                    square[i][j].setFill(Color.WHITE);
                    square[i][j].setStroke(Color.BLACK);
                    GridPane.setConstraints(square[i][j], j, i);
                    getChildren().add(square[i][j]);


                }
            }

        }


        public void addTick(double x, double y) {

            Line line1 = new Line(0, 0, paneWidth / 8, paneHeight / 8);
            Line line2 = new Line(paneWidth / 8, 0, 0, paneHeight / 8);

            int rowIndex = (int) (y / (paneHeight / 8));
            int columnIndex = (int) (x / (paneWidth / 8));

            setConstraints(line1, columnIndex, rowIndex);
            setConstraints(line2, columnIndex, rowIndex);
            isTicked[rowIndex][columnIndex] = true;
            getChildren().addAll(line1, line2);

        }

        public void clear() {

            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square[i].length; j++) {
                    square[i][j].setFill(Color.WHITE);
                }
            }

            for (int i = 0; i < getChildren().size(); i++) {

                getChildren().removeIf(e -> e instanceof Line);
            }
        }

        public void findPath() {

            int rowIndex = 0;
            int columnIndex = 0;

            square[rowIndex][columnIndex].setFill(Color.GREY);

            while (columnIndex != 7 || rowIndex != 7) {

                int nextRow = rowIndex + 1;
                int nextColumn = columnIndex + 1;
                if (nextColumn == 8)
                    nextColumn = 7;
                if (nextRow == 8)
                    nextRow = 7;


                if (!isTicked[rowIndex][nextColumn] && isAllRowsUnticked(isTicked, rowIndex, nextColumn) && columnIndex < 7) {
                    square[rowIndex][++columnIndex].setFill(Color.GREY);
                } else if (!isTicked[nextRow][columnIndex] && rowIndex < 7) {
                    square[++rowIndex][columnIndex].setFill(Color.GREY);
                } else {
                    break;
                }
                System.out.println("row:" + rowIndex + " column:" + columnIndex);
            }

        }


        private boolean isAllRowsUnticked(boolean isTicked[][], int rowIndex, int columnIndex) {


            for (int i = rowIndex; i < isTicked.length; i++) {

                if (isTicked[i][columnIndex]) {
                    return false;
                }


            }


            return true;

        }
    }
}
