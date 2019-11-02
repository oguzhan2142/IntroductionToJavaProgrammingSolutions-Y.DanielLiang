package exercise24;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class InsideAPolygon extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        Polygon polygon = new Polygon();

        ObservableList<Double> polygonPoints = polygon.getPoints();
        double[] testPoint = new double[2];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter points:");
        for (int i = 0; i < 8; i++) {
            polygonPoints.add(scanner.nextDouble());
        }
        for (int i = 0; i < testPoint.length; i++) {
            testPoint[i] = scanner.nextDouble();
        }

        Circle circle = new Circle(testPoint[0], testPoint[1], 10);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);

        if (polygon.contains(circle.getCenterX(),circle.getCenterY())){
            pane.getChildren().add(new Text(200,580,"Point inside in Polygon"));
        }else {
            pane.getChildren().add(new Text(200,580,"Point is not inside in Polygon"));
        }


        pane.getChildren().addAll(polygon,circle );
        primaryStage.setScene(new Scene(pane,600,600));
        primaryStage.setTitle("Inside A Polygon?");
        primaryStage.show();

    }
}
