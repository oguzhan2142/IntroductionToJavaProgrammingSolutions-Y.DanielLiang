package exercise18;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MoveARectangleUsingMouse extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Rectangle rectangle = new Rectangle(100, 100, 100, 50);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);

        rectangle.setOnMouseDragged(event -> {

            rectangle.setX(event.getX() - rectangle.getWidth() / 2);
            rectangle.setY(event.getY() - rectangle.getHeight() / 2);


        });


        primaryStage.setScene(new Scene(pane, 800, 800));
        primaryStage.setTitle("Move The Rectangle");
        primaryStage.show();
        pane.requestFocus();
    }
}
