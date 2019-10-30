package exercise14;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class InsideAPolygon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        Polygon polygon = new Polygon();
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);
        ObservableList<Double> points = polygon.getPoints();

        points.addAll(
                40.0, 20.0,
                70.0, 40.0,
                60.0, 80.0,
                45.0, 45.0,
                20.0, 60.0);

        Text text = new Text();

        pane.getChildren().addAll(polygon,text);

        pane.setOnMouseMoved(event -> {
            double x = event.getX();
            double y = event.getY();

            if (polygon.contains(x, y)) {
                text.setX(x);
                text.setY(y);
                text.setText("inside");

            } else {
                text.setX(x);
                text.setY(y);
                text.setText("outside");
            }


        });


        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.setTitle("inside A polygon");
        primaryStage.show();
        pane.requestFocus();
    }
}
