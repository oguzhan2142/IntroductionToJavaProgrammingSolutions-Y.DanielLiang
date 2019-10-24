package exercise20;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawAArrowLine extends Application {

    double width = 800;
    double height = 800;

    public static void drawArrowLine(double startX, double startY, double endX, double endY, Pane pane) {

        Pane arrowPane = new Pane();
        double centerX = Math.abs(startX - endX) / 2;
        double centerY = Math.abs(startY - endY) / 2;

        double lenght = Math.sqrt((startX - endX) * (startX - endX) + (endX - endY) * (endX - endY));

        double angle = Math.atan((endY - startY) / (endX - startX));
        angle = Math.toDegrees(angle);

        Line body = new Line(0, 0, lenght, 0);
        Line wind1 = new Line(body.getEndX(), body.getEndY(), body.getEndX() - 30, body.getEndY() - 30);
        Line wind2 = new Line(body.getEndX(), body.getEndY(), body.getEndX() - 30, body.getEndY() + 30);

        arrowPane.getChildren().addAll(body, wind1, wind2);
        arrowPane.setRotate(angle);
        arrowPane.layoutXProperty().set(centerX);
        arrowPane.layoutYProperty().set(centerY);



        pane.getChildren().add(arrowPane);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        double[] points  = new  double[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = Math.random() * 800;
        }
        drawArrowLine(points[0], points[1], points[2], points[3], pane);


        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Arrow");
        primaryStage.show();

    }
}
