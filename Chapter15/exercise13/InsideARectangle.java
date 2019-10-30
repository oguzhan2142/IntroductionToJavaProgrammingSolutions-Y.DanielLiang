package exercise13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideARectangle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();


        Rectangle rectangle = new Rectangle(50,40,100,40);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        pane.getChildren().add(rectangle);

        Text text = new Text();
        pane.setOnMouseMoved(event -> {

            double x = event.getX();
            double y = event.getY();

            if (rectangle.contains(x, y)) {
                text.setText("Mouse point is inside the rectangle");
                text.setX(x);
                text.setY(y);
                pane.getChildren().add(text);

            } else {
                text.setText("Mouse point is not inside the rectangle");
                text.setX(x);
                text.setY(y);
                pane.getChildren().add(text);
            }


        });







        primaryStage.setScene(new Scene(pane ,600,600));
        primaryStage.setTitle("Inside A Rectangle");
        primaryStage.show();
        pane.requestFocus();
    }
}
