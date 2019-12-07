package exercise20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class DisplayCircles extends Application {


    private static void drawCircleToPane(Pane pane) {

        Circle circle = new Circle(pane.getPrefWidth() / 2, pane.getPrefHeight()/ 2, pane.getPrefWidth() / 2 - 10);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);


        drawCircleToPane(pane, circle.getRadius());


    }

    private static void drawCircleToPane(Pane pane, double radius) {


        if (radius >= 10) {
            Circle circle = new Circle(pane.getPrefWidth() / 2, pane.getPrefHeight() / 2, radius);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            pane.getChildren().add(circle);
            drawCircleToPane(pane, radius - 10);

        }

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        pane.setPrefSize(500, 500);

        drawCircleToPane(pane);
        primaryStage.setTitle("Circles");
        primaryStage.setScene(new Scene(pane));
        primaryStage.show();
    }


}
