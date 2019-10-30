package exercise12;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideACircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle circle = new Circle(100, 60, 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        pane.getChildren().add(circle);

        Text text = new Text();
        pane.setOnMouseMoved(event -> {

            double x = event.getX();
            double y = event.getY();

            if (circle.contains(x, y)) {
                text.setText("Mouse point is inside the circle");
                text.setX(x);
                text.setY(y);
                pane.getChildren().add(text);

            } else {
                text.setText("Mouse point is not inside the circle");
                text.setX(x);
                text.setY(y);
                pane.getChildren().add(text);
            }


        });


        primaryStage.setTitle("Inside A Circle?");
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.show();
        pane.requestFocus();


    }
}
