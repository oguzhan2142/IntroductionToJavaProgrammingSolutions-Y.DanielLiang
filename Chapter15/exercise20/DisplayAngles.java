package exercise20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayAngles extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        double[][] points = {{30, 60}, {124, 60}, {60, 200}};
        CustomTriangle customTriangle = new CustomTriangle(points);
        pane.getChildren().add(customTriangle);
        primaryStage.setTitle("Display Angles");
        primaryStage.setScene(new Scene(pane, 800, 800));
        primaryStage.show();
    }
}

class CustomTriangle extends Pane {


    private Polygon triangle;
    private Circle circleA;
    private Circle circleB;
    private Circle circleC;
    private double[] angle;
    private Text angleA;
    private Text angleB;
    private Text angleC;
    private double[][] points;

    public CustomTriangle(double[][] points) {
        this.points = points;

        circleA = new Circle(points[0][0], points[0][1], 10);
        circleB = new Circle(points[1][0], points[1][1], 10);
        circleC = new Circle(points[2][0], points[2][1], 10);

        triangle = new Polygon();
        triangle.setFill(Color.WHITE);
        triangle.setStroke(Color.BLACK);
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[0].length; j++) {
                triangle.getPoints().add(this.points[i][j]);
            }

        }

        this.angle = computeAngles(this.points);

        angleA = new Text(points[0][0],points[0][1],String.format("%.2f" , this.angle[0]));
        angleB = new Text(points[1][0],points[1][1],String.format("%.2f" , this.angle[1]));
        angleC = new Text(points[2][0],points[2][1],String.format("%.2f" , this.angle[2]));

        getChildren().addAll(triangle,circleA,circleB,circleC,angleA,angleB,angleC);

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

    public Circle getCircleA() {
        return circleA;
    }

    public void setCircleA(Circle circleA) {
        this.circleA = circleA;
    }

    public Circle getCircleB() {
        return circleB;
    }

    public void setCircleB(Circle circleB) {
        this.circleB = circleB;
    }

    public Circle getCircleC() {
        return circleC;
    }

    public void setCircleC(Circle circleC) {
        this.circleC = circleC;
    }

    public Text getAngleA() {
        return angleA;
    }

    public void setAngleA(Text angleA) {
        this.angleA = angleA;
    }

    public Text getAngleB() {
        return angleB;
    }

    public void setAngleB(Text angleB) {
        this.angleB = angleB;
    }

    public Text getAngleC() {
        return angleC;
    }

    public void setAngleC(Text angleC) {
        this.angleC = angleC;
    }
}
