package exercise24;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Palindrome extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final double width = 600, height = 600;
        Pane pane = new Pane();


        Arc arc = new Arc(width / 2, height / 6 * 5, width / 4, height / 20, 180, 180);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);


        Circle circle = new Circle(20);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(4000));
        pathTransition.setNode(circle);
        pathTransition.setPath(arc);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(Timeline.INDEFINITE);
        pathTransition.setAutoReverse(true);
        pathTransition.play();


        pane.setOnMousePressed(event -> {

            pathTransition.stop();

        });
        pane.setOnMouseReleased(event -> {


            pathTransition.play();


        });

        pane.getChildren().addAll(arc, circle);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Animation");
        primaryStage.show();
    }
}
