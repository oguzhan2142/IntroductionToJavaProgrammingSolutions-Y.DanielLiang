package exercise22;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ConnectTwoCircles extends Application {

    final double radius = 15;
    double width = 600;
    double height = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        double x1 = Math.random() * width;
        double y1 = Math.random() * height;
        double x2 = Math.random() * width;
        double y2 = Math.random() * height;

        x1 = 100;
        y1 = 100;
        x2 = 300;
        y2 = 100;

        Circle circle1 = new Circle(x1, y1, radius);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(x2, y2, radius);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);


        Text c1 = new Text(circle1.getCenterX(), circle1.getCenterY(), "1");
        Text c2 = new Text(circle2.getCenterX(), circle2.getCenterY(), "2");


        Line line = new Line(x1, y1, x2, y2);


        pane.getChildren().addAll(circle1, circle2, line, c1, c2);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Connect Two Circles");
        primaryStage.show();


    }
}
