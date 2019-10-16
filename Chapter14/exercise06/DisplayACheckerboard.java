package exercise06;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayACheckerboard extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final int WIDTH = 400;
        final int HEIGHT = 400;

        Color black = new Color(0, 0, 0, 1);
        Color white = new Color(1, 1, 1, 1);

        GridPane pane = new GridPane();

        boolean chanceBoxColer = true;

        for (int column = 0; column <= 8; column++) {
            for (int row = 0; row <= 8; row++) {


                if (chanceBoxColer) {

                    Rectangle rectangleBlack = new Rectangle(WIDTH / 8, HEIGHT / 8, black);
                    GridPane.setConstraints(rectangleBlack, row, column);
                    pane.getChildren().add(rectangleBlack);
                    chanceBoxColer = false;

                } else {


                    Rectangle rectangleWhite = new Rectangle(WIDTH / 8, HEIGHT / 8, white);
                    GridPane.setConstraints(rectangleWhite, row, column);
                    pane.getChildren().add(rectangleWhite);
                    chanceBoxColer = true;
                }


            }
        }


        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("Checkerboard");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
