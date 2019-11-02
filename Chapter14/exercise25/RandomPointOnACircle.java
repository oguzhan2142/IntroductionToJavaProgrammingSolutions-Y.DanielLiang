package exercise25;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class RandomPointOnACircle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle circle = new Circle(300, 300, 120);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        double[][] randomFivePoints = getRandomFivePoints(circle);

        Polygon polygon = new Polygon();
        polygon.setStroke(Color.BLACK);
        polygon.setFill(Color.WHITE);

        for (int i = 0; i < randomFivePoints.length; i++) {
            for (int j = 0; j < randomFivePoints[0].length; j++) {

                polygon.getPoints().add(randomFivePoints[i][j]);

            }

        }
        pane.getChildren().addAll(circle, polygon);
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.setTitle("Random Points On A Circle");
        primaryStage.show();
    }


    private double[][] getRandomFivePoints(Circle c) {

        double[][] randomPoints = new double[5][2];
        double[] fiveRandomAngle = new double[5];
        for (int i = 0; i < fiveRandomAngle.length; i++) {

            fiveRandomAngle[i] = Math.random() * 361;

        }
        for (int i = 0; i < fiveRandomAngle.length - 1; i++) {
            for (int j = i + 1; j < fiveRandomAngle.length; j++) {

                if (fiveRandomAngle[i] > fiveRandomAngle[j]) {
                    double temp = fiveRandomAngle[i];
                    fiveRandomAngle[i] = fiveRandomAngle[j];
                    fiveRandomAngle[j] = temp;
                }
            }

        }
        for (int i = 0; i < randomPoints.length; i++) {

            randomPoints[i][0] = c.getCenterX() + c.getRadius() * Math.cos(Math.toRadians(fiveRandomAngle[i]));
            randomPoints[i][1] = c.getCenterY() + c.getRadius() * Math.sin(Math.toRadians(fiveRandomAngle[i]));

        }

        return randomPoints;
    }


}
