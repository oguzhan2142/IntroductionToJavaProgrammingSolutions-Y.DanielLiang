package exercise31;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Pendulum extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        SwingingPendulum swingingPendulum = new SwingingPendulum();

        pane.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.UP)
                swingingPendulum.getTimeline().setRate(swingingPendulum.getTimeline().getRate() + 1);
            if (event.getCode() == KeyCode.DOWN)
                swingingPendulum.getTimeline().setRate(swingingPendulum.getTimeline().getRate() - 1);
            if (event.getCode() == KeyCode.R)
                swingingPendulum.getTimeline().play();
            if (event.getCode() == KeyCode.S)
                swingingPendulum.getTimeline().pause();


        });

        pane.getChildren().add(swingingPendulum);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Pendulum");
        primaryStage.show();
        pane.requestFocus();
    }
}

class SwingingPendulum extends Pane {

    private Circle center;
    private Circle end;
    private Line line;
    private double width = 500, height = 500;
    private Timeline timeline;
    private double lineLength = 200;
    private double xCordinate = 10;

    public SwingingPendulum() {

        setPrefSize(width, height);
        center = new Circle(getPrefWidth() / 2, getPrefHeight() / 10, 6);
        end = new Circle(getPrefWidth() / 2, center.getCenterY() + lineLength, 15);
        line = new Line(center.getCenterX(), center.getCenterY(), end.getCenterX(), end.getCenterY());


        timeline = new Timeline(new KeyFrame(Duration.millis(100), event -> {

            line.endXProperty().bind(end.centerXProperty());
            line.endYProperty().bind(end.centerYProperty());
            line.startXProperty().bind(center.centerXProperty());
            line.startYProperty().bind(center.centerYProperty());

            end.setCenterX(end.getCenterX() + xCordinate);

            double y = Math.sqrt(Math.pow(lineLength, 2) + Math.pow(end.getCenterX() - center.getCenterX(), 2)) + center.getCenterY();

            end.setCenterY(y);


            if (end.getCenterX() > 400 || end.getCenterX() < 100) {
                xCordinate *= -1;

            }


        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();


        getChildren().addAll(end, center, line);
        requestFocus();
    }

   
    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }
}