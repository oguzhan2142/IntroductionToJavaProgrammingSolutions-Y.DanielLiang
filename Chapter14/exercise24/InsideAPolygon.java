package exercise24;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class InsideAPolygon extends Application {

    final double width = 800;
    final double height = 800;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter five point:");

        double[] points = new double[4 * 2];
        double[] checkPoint = new double[2];

        for (int i = 0; i < points.length; i++) {
            points[i] = scanner.nextDouble();
        }

        for (int i = 0; i < checkPoint.length; i++) {
            checkPoint[i] = scanner.nextDouble();
        }


        Polygon polygon = new Polygon(points);

        pane.getChildren().add(polygon);
        polygon.setFill(Color.WHITE);
        polygon.setStroke(Color.BLACK);

        Text inside = new Text( width / 10 * 3 , height / 10 * 9 , "The point inside the poplygon");
        Text outside = new Text(width / 10 * 3 , height / 10 * 9 , "The point outside the poplygon");

        if (polygon.contains(checkPoint[0] , checkPoint[1])){
            pane.getChildren().add(inside);
        }else {
            pane.getChildren().add(outside);
        }

        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("is Point inside in Polygon?");
        primaryStage.show();

    }
}
