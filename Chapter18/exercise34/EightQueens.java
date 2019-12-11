package exercise34;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class EightQueens extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        EightQueens.Board board = new EightQueens.Board();

        board.findSolution();

        primaryStage.setScene(new Scene(board));
        primaryStage.setTitle("Eight Queens");
        primaryStage.show();
    }


    static class Board extends GridPane {

        private Rectangle[][] square = new Rectangle[8][8];
        private Image image;
        private boolean[][] isFull = new boolean[8][8];

        public Board() {


            image = new Image("exercise34/icon/knight.png");

            for (int i = 0; i < square.length; i++) {
                for (int j = 0; j < square[i].length; j++) {
                    square[i][j] = new Rectangle(80, 80);
                    square[i][j].setFill(Color.WHITE);
                    square[i][j].setStroke(Color.BLACK);
                    setConstraints(square[i][j], j, i);
                    getChildren().add(square[i][j]);
                }
            }


        }

        public void findSolution() {

            int index = 7;

            findSolution(index);


            for (int i = 0; i < isFull.length; i++) {
                for (int j = 0; j < isFull.length; j++) {
                    System.out.print(isFull[i][j] + " ");
                }
                System.out.println();
            }

        }


        public void findSolution(int rowIndex) {

            if (rowIndex == 7) {
                int randomColumn = (int) (Math.random() * 8);
                addKnight(rowIndex, randomColumn);
            } else {
                int randomColumn = (int) (Math.random() * 8);
                while (!isColumnOk(randomColumn)) {

                    randomColumn = (int) (Math.random() * 8);

                }
                addKnight(rowIndex, randomColumn);
            }


            if (rowIndex == 0) {
                return;
            }
            findSolution(rowIndex - 1);

        }

        private boolean isColumnOk(int column) {
            for (int i = 0; i < isFull.length; i++) {

                if (isFull[i][column])
                    return false;

            }
            return true;
        }

        private void addKnight(int row, int column) {

            ImageView view = new ImageView(image);
            setConstraints(view, column, row);
            getChildren().add(view);
            isFull[row][column] = true;

        }
    }
}
