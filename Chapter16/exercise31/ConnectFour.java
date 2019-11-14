package exercise31;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectFour extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        GamePane gamePane = new GamePane();


        primaryStage.setTitle("Connect Four");
        primaryStage.setScene(new Scene(gamePane));
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    class GamePane extends GridPane {

        Circle[][] circles = new Circle[6][7];
        int row = 0, column = 0;
        boolean isRedTurn = true;
        boolean isGameOver = false;
        boolean redWon = false;
        boolean yellowWon = false;


        public GamePane() {

            setHgap(10);
            setVgap(10);
            setPadding(new Insets(30, 30, 30, 30));
            for (int i = 0; i < circles.length; i++, row++) {
                for (int j = 0; j < circles[i].length; j++, column++) {
                    circles[i][j] = new Circle(30, Color.WHITE);
                    circles[i][j].setStroke(Color.BLACK);
                    add(circles[i][j], i, j);
                    circles[i][j].setOnMouseClicked(event -> {

                        if (!isGameOver) {
                            if (isRedTurn) {

                                if (((Circle) event.getSource()).getFill().equals(Color.WHITE)) {
                                    ((Circle) event.getSource()).setFill(Color.RED);
                                    isRedTurn = false;
                                    isRedWon();
                                }

                            } else {
                                if (((Circle) event.getSource()).getFill().equals(Color.WHITE)) {
                                    ((Circle) event.getSource()).setFill(Color.YELLOW);
                                    isRedTurn = true;
                                    isYellowWon();
                                }
                            }

                            if (redWon) {
                                Text t = new Text("Red Won");
                                t.setFill(Color.RED);
                                t.setFont(Font.font(40));
                                add(t, 0, 6, 7, 7);
                            }
                            if (yellowWon) {
                                Text t = new Text("yellow Won");
                                t.setFill(Color.YELLOW);
                                t.setFont(Font.font(40));
                                add(t, 0, 6, 7, 7);
                            }
                            if (isEveryCircleFill()) {
                                Text t = new Text("No Winner");
                                t.setFill(Color.GREEN);
                                t.setFont(Font.font(40));
                                add(t, 0, 6, 7, 7);

                            }
                        }
                    });
                }
            }


        }


        private void isRedWon() {

            checkColumn(Color.RED);
            checkRow(Color.RED);
            checkOpposite(Color.RED);

            if (isGameOver)
                redWon = true;


        }

        private void isYellowWon() {

            checkColumn(Color.YELLOW);
            checkRow(Color.YELLOW);
            checkOpposite(Color.YELLOW);
            if (isGameOver)
                yellowWon = true;


        }

        private void checkOpposite(Paint p) {
            for (int i = 0; i < circles.length - 3; i++) {
                for (int j = 0; j < circles[i].length - 3; j++) {

                    Paint c1 = circles[i][j].getFill();
                    Paint c2 = circles[i + 1][j + 1].getFill();
                    Paint c3 = circles[i + 2][j + 2].getFill();
                    Paint c4 = circles[i + 3][j + 3].getFill();

                    if (c1.equals(p) && c2.equals(p) && c3.equals(p) && c4.equals(p)) {
                        isGameOver = true;
                    }

                }
            }
            for (int i = 0; i < circles.length - 3; i++) {
                for (int j = 0; j < circles[i].length - 3; j++) {

                    Paint c1 = circles[i][j + 3].getFill();
                    Paint c2 = circles[i + 1][j + 2].getFill();
                    Paint c3 = circles[i + 2][j + 1].getFill();
                    Paint c4 = circles[i + 3][j].getFill();

                    if (c1.equals(p) && c2.equals(p) && c3.equals(p) && c4.equals(p)) {
                        isGameOver = true;
                    }

                }
            }


        }

        private void checkRow(Paint p) {

            for (int i = 0; i < circles.length - 3; i++) {
                for (int j = 0; j < circles[i].length; j++) {

                    Paint c1 = circles[i][j].getFill();
                    Paint c2 = circles[i + 1][j].getFill();
                    Paint c3 = circles[i + 2][j].getFill();
                    Paint c4 = circles[i + 3][j].getFill();

                    if (c1.equals(p) && c2.equals(p) && c3.equals(p) && c4.equals(p)) {
                        isGameOver = true;
                    }

                }
            }

        }

        private boolean isEveryCircleFill() {
            for (int i = 0; i < circles.length; i++) {
                for (int j = 0; j < circles[i].length; j++) {

                    if (circles[i][j].getFill().equals(Color.WHITE))
                        return false;

                }
            }
            return true;
        }

        private void checkColumn(Paint p) {
            for (int i = 0; i < circles.length; i++) {
                for (int j = 0; j < circles[i].length - 3; j++) {

                    Paint c1 = circles[i][j].getFill();
                    Paint c2 = circles[i][j + 1].getFill();
                    Paint c3 = circles[i][j + 2].getFill();
                    Paint c4 = circles[i][j + 3].getFill();

                    if (c1.equals(p) && c2.equals(p) && c3.equals(p) && c4.equals(p)) {
                        isGameOver = true;
                    }

                }
            }
        }

    }
}
