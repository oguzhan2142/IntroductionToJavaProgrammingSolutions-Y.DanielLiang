package exercise21;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DragPoints extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        CustomCircle customCircle = new CustomCircle();

        EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double x = event.getX();
                double y = event.getY();

                double centerX = customCircle.getCircle().getCenterX();
                double centerY = customCircle.getCircle().getCenterY();

                double anngle = Math.atan((centerY - y) / (centerX - x));
                double newX = centerX + customCircle.getCircle().getRadius() * Math.cos(anngle);
                double newY = centerY + customCircle.getCircle().getRadius() * Math.sin(anngle);

                if (customCircle.getCircleA().contains(x, y)) {

                    customCircle.updateA(newX, newY);

                }
                if (customCircle.getCircleB().contains(x, y)) {

                    customCircle.updateB(newX, newY);
                }
                if (customCircle.getCircleC().contains(x, y)) {

                    customCircle.updateC(newX, newY);
                }

            }
        };

        customCircle.getCircleA().setOnMouseDragged(handler);
        customCircle.getCircleB().setOnMouseDragged(handler);
        customCircle.getCircleC().setOnMouseDragged(handler);

        Scene scene = new Scene(customCircle);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Drag Points");
        primaryStage.show();
        customCircle.requestFocus();
    }


}

class CustomCircle extends Pane {

    private double[][] points = new double[3][2];
    private Circle circle;
    private Circle[] angleCircle = new Circle[3];
    private Polygon triangle = new Polygon();
    private double circleRadius = 150;
    private Text[] texts = new Text[3];
    private double[] angles;


    public CustomCircle() {

        setPrefSize(600, 600);

        circle = new Circle(getPrefWidth() / 2, getPrefHeight() / 2, circleRadius);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        triangle.setStroke(Color.BLACK);
        triangle.setFill(Color.WHITE);


        for (int i = 0; i < points.length; i++) {

            double randomDegree = (Math.random() * 361);
            points[i][0] = circle.getCenterX() + circle.getRadius() * Math.cos(Math.toRadians(randomDegree));
            points[i][1] = circle.getCenterY() + circle.getRadius() * Math.sin(Math.toRadians(randomDegree));
            triangle.getPoints().addAll(points[i][0], points[i][1]);

        }

        getChildren().addAll(circle, triangle);
        for (int i = 0; i < angleCircle.length; i++) {
            angleCircle[i] = new Circle(points[i][0], points[i][1], 8);
            getChildren().add(angleCircle[i]);
        }

        angles = computeAngles(points);

        for (int i = 0; i < texts.length; i++) {
            texts[i] = new Text(points[i][0] - 15, points[i][1] + 15, String.format("%.2f", angles[i]));
            getChildren().add(texts[i]);
        }

    }


    public void updateA(double x, double y) {
        this.points[0][0] = x;
        this.points[0][1] = y;
        triangle.getPoints().clear();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                triangle.getPoints().add(this.points[i][j]);
            }

        }
        this.angles = computeAngles(points);
        texts[0].setX(x + 10);
        texts[0].setY(y - 10);
        texts[0].setText(String.format("%.2f", this.angles[0]));
        texts[1].setText(String.format("%.2f", this.angles[1]));
        texts[2].setText(String.format("%.2f", this.angles[2]));

        angleCircle[0].setCenterX(x);
        angleCircle[0].setCenterY(y);


    }

    public void updateB(double x, double y) {
        this.points[1][0] = x;
        this.points[1][1] = y;
        triangle.getPoints().clear();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                triangle.getPoints().add(this.points[i][j]);
            }

        }
        this.angles = computeAngles(points);
        texts[1].setX(x + 10);
        texts[1].setY(y - 10);

        texts[0].setText(String.format("%.2f", this.angles[0]));
        texts[1].setText(String.format("%.2f", this.angles[1]));
        texts[2].setText(String.format("%.2f", this.angles[2]));

        angleCircle[1].setCenterX(x);
        angleCircle[1].setCenterY(y);

    }

    public void updateC(double x, double y) {
        this.points[2][0] = x;
        this.points[2][1] = y;
        triangle.getPoints().clear();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                triangle.getPoints().add(this.points[i][j]);
            }

        }
        this.angles = computeAngles(points);
        texts[2].setX(x + 10);
        texts[2].setY(y - 10);

        texts[0].setText(String.format("%.2f", this.angles[0]));
        texts[1].setText(String.format("%.2f", this.angles[1]));
        texts[2].setText(String.format("%.2f", this.angles[2]));

        angleCircle[2].setCenterX(x);
        angleCircle[2].setCenterY(y);

    }

    public Circle getCircleA() {
        return angleCircle[0];
    }

    public Circle getCircleB() {
        return angleCircle[1];
    }


    public Circle getCircleC() {
        return angleCircle[2];
    }

    public Circle getCircle() {
        return circle;
    }

    private double[] computeAngles(double[][] points) {

        double[] angle = new double[3];
        double a = Math.sqrt((points[1][0] - points[2][0]) * (points[1][0] - points[2][0]) + (points[1][1] - points[2][1]) * (points[1][1] - points[2][1]));
        double b = Math.sqrt((points[0][0] - points[2][0]) * (points[0][0] - points[2][0]) + (points[0][1] - points[2][1]) * (points[0][1] - points[2][1]));
        double c = Math.sqrt((points[0][0] - points[1][0]) * (points[0][0] - points[1][0]) + (points[0][1] - points[1][1]) * (points[0][1] - points[1][1]));

        angle[0] = Math.toDegrees(Math.acos((a * a - b * b - c * c) / (-2 * b * c)));
        angle[1] = Math.toDegrees(Math.acos((b * b - a * a - c * c) / (-2 * a * c)));
        angle[2] = Math.toDegrees(Math.acos((c * c - b * b - a * a) / (-2 * a * b)));

        return angle;
    }
}