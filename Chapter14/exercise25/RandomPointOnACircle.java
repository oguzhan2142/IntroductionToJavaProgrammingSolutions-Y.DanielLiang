package exercise25;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class RandomPointOnACircle extends Application {

    final double width = 800;
    final double heignt = 800;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        final double RADIUS = 200;

        double[] randomDegrees = new double[4];

        for (int i = 0; i < randomDegrees.length; i++) {


            double randomDegree = (int) (Math.random() * 361);
            randomDegrees[i] = Math.toRadians(randomDegree);


        }


        Circle circle = new Circle(width / 2, heignt / 2, RADIUS);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        double[] points = new double[4 * 2];

        for (int i = 0; i < points.length; i += 2) {

            double x = circle.getCenterX() + RADIUS * Math.cos(randomDegrees[i / 2]);
            double y = circle.getCenterY() + RADIUS * Math.sin(randomDegrees[i / 2]);

            points[i] = x;
            points[i + 1] = y;


        }


        Polygon polygon = new Polygon(points);
        polygon.setStrokeType(StrokeType.INSIDE);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);


        pane.getChildren().addAll(circle, polygon);

        primaryStage.setScene(new Scene(pane, width, heignt));
        primaryStage.setTitle("Random point on circle");
        primaryStage.show();

    }
}
