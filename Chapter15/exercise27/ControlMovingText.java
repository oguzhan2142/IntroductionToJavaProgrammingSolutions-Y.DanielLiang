package exercise27;

import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlMovingText extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        double width = 600, height = 300;
        Pane pane = new Pane();

        Text text = new Text("Programming is Fun");
        text.setFont(Font.font(20));

        Line pathLine = new Line(0, height / 2, width, height / 2);
        pathLine.setOpacity(0);
        PathTransition pt = new PathTransition(Duration.millis(4000), pathLine, text);
        pt.setCycleCount(Timeline.INDEFINITE);
        pt.play();

        pane.setOnMousePressed(event -> {
            pt.pause();
        });

        pane.setOnMouseReleased(event -> {
            pt.play();
        });


        pane.getChildren().addAll(pathLine, text);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Moving Text");
        primaryStage.show();
    }
}
