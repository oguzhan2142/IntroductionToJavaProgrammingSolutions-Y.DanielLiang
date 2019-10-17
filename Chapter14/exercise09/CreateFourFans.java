package exercise09;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class CreateFourFans extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();

        int row = 0;
        int column = 0;
        StackPane[] fan = new StackPane[4];
        for (int i = 0; i < 4; i++) {
            if (row == 2) {
                row = 0;
                column++;
            }
            fan[i] = createFan();

            GridPane.setConstraints(fan[i], row, column);
            pane.getChildren().add(fan[i]);

            row++;

        }


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Fans");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private static StackPane createFan() {

        StackPane stackPane = new StackPane();

        Circle circle = new Circle(100, 100, 100);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        Pane circlePane = new Pane();
        circlePane.getChildren().add(circle);

        int degree = 90;
        Arc[] arc = new Arc[4];
        Pane[] pane = new Pane[4];
        for (int i = 0; i < 4; i++) {

            arc[i] = new Arc(100, 100, 85, 85, 30 + (degree * i), 40);
            arc[i].setStroke(Color.BLACK);
            arc[i].setType(ArcType.ROUND);
            pane[i] = new Pane();
            pane[i].getChildren().add(arc[i]);

        }

        stackPane.getChildren().addAll(circlePane, pane[0], pane[1], pane[2], pane[3]);

        return stackPane;
    }
}

