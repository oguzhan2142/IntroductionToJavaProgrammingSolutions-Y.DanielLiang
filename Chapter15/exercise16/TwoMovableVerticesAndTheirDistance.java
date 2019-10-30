package exercise16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TwoMovableVerticesAndTheirDistance extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();

        Circle circle1 = new Circle(40, 40, 10);
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(120, 150, 10);
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Line line = new Line(circle1.getCenterX() , circle1.getCenterY() , circle2.getCenterX(), circle2.getCenterY());
        double distance = Math.sqrt(Math.pow(line.getStartX() - line.getEndX(), 2) + Math.pow(line.getStartY() - line.getEndY(), 2));
        Text text = new Text((line.getStartX() + line.getEndX()) / 2, (line.getStartY() + line.getEndY()) / 2, Double.toString(distance));

        circle1.setOnMouseDragged(event -> {

            circle1.setCenterX(event.getX());
            circle1.setCenterY(event.getY());
            line.setStartX(event.getX());
            line.setStartY(event.getY());
            text.setX((line.getStartX() + line.getEndX()) / 2);
            text.setY((line.getStartY() + line.getEndY()) / 2);
            double newDistance = Math.sqrt(Math.pow(line.getStartX() - line.getEndX(), 2) + Math.pow(line.getStartY() - line.getEndY(), 2));
            text.setText(Double.toString(newDistance));
        });
        circle2.setOnMouseDragged(event -> {

            circle2.setCenterX(event.getX());
            circle2.setCenterY(event.getY());
            line.setEndX(event.getX());
            line.setEndY(event.getY());
            text.setX((line.getStartX() + line.getEndX()) / 2);
            text.setY((line.getStartY() + line.getEndY()) / 2);
            double newDistance = Math.sqrt(Math.pow(line.getStartX() - line.getEndX(), 2) + Math.pow(line.getStartY() - line.getEndY(), 2));
            text.setText(Double.toString(newDistance));
        });


        pane.getChildren().addAll(circle1, circle2, line,text);
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.setTitle("Two Movable Vertices And Their Distance");
        primaryStage.show();

    }
}
