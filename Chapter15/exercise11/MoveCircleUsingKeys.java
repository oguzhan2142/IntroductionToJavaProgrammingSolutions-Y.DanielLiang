package exercise11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveCircleUsingKeys extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Circle  circle = new Circle(300,300,40);
        pane.setOnKeyPressed(e -> {

            if (e.getCode() == KeyCode.UP)
                circle.setCenterY(circle.getCenterY() - 20);
            if (e.getCode() == KeyCode.DOWN)
                circle.setCenterY(circle.getCenterY() + 20);
            if (e.getCode() == KeyCode.RIGHT)
                circle.setCenterX(circle.getCenterX() + 20);
            if (e.getCode() == KeyCode.LEFT)
                circle.setCenterX(circle.getCenterX() - 20);
        });



        pane.getChildren().add(circle);
        primaryStage.setScene(new Scene(pane , 600,600));
        primaryStage.setTitle("Move CIrcle");
        primaryStage.show();

        pane.requestFocus();
    }
}
