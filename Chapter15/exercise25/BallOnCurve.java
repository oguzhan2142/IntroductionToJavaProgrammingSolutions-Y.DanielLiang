package exercise25;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BallOnCurve extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        double width = 600, height = 600;
        Pane pane = new Pane();

        Line Xline = new Line(0, height / 2, width, height / 2);
        Line Yline = new Line(width / 2, 0, width / 2, height);


        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactorY = height / 2;
        double scaleFactorX = (width / 2);

        for (int x = -170; x <= 170; x++) {
            list.add(scaleFactorX + x);
            list.add(scaleFactorY - 50 * Math.sin((x / 100.0) * 2 * Math.PI));
        }

        Circle circle = new Circle(20);
        circle.setFill(Color.GREEN);

        PathTransition pt = new PathTransition(Duration.millis(2000), polyline, circle);
        pt.setAutoReverse(false);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();


        pane.setOnMouseClicked(event -> {

            if (event.getButton() == MouseButton.PRIMARY)
                pt.pause();
            if (event.getButton() == MouseButton.SECONDARY)
                pt.play();
        });


        pane.getChildren().addAll(polyline, Xline, Yline, circle);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Ball On Curve");
        primaryStage.show();

    }
}
