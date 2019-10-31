package exercise19;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EyeHandCoordination extends Application {
    private static Circle generateRandomCircle() {

        Circle circle = new Circle(Math.random() * 600, Math.random() * 600, 10);
        circle.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));

        return circle;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle firstCircle = generateRandomCircle();
        pane.getChildren().add(firstCircle);

        pane.setOnMouseClicked(event -> {

            double clickX = event.getX();
            double clickY = event.getY();
            Circle newCircle = (Circle) pane.getChildren().get(0);

            if (newCircle.contains(clickX, clickY)) {
                pane.getChildren().remove(newCircle);
                newCircle = generateRandomCircle();
                pane.getChildren().add(newCircle);
            }


        });


        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.setTitle("Eye Hand Coordination");
        primaryStage.show();
    }
}
