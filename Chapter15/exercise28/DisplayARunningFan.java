package exercise28;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class DisplayARunningFan extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        FanPane fan = new FanPane();

        fan.getPlayBtn().setOnMouseClicked(event -> {
            fan.resume();

        });
        fan.getPauseBtn().setOnMouseClicked(event -> {
            fan.pause();
        });

        fan.getReverseBtn().setOnMouseClicked(event -> {
            fan.reverse();
        });

        primaryStage.setTitle("Fan");
        primaryStage.setScene(new Scene(fan));
        primaryStage.show();
    }
}


class FanPane extends Pane {

    double width = 600, height = 600;
    private Circle circle;
    private Arc[] arc = new Arc[4];
    private Button pauseBtn;
    private Button playBtn;
    private Button reverseBtn;
    private Pane fanPane = new Pane();
    private HBox buttonPane = new HBox();
    private Timeline timeline;


    public FanPane() {
        setPrefSize(width, height);
        fanPane.setPrefWidth(width);
        fanPane.setPrefHeight(height - 40);
        fanPane.setStyle("-fx-border-color:Black");
        circle = new Circle(fanPane.getPrefWidth() / 2, fanPane.getPrefHeight() / 2, width / 2 - 50);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);
        fanPane.getChildren().add(circle);
        for (int i = 0; i < arc.length; i++) {
            arc[i] = new Arc(fanPane.getPrefWidth() / 2, fanPane.getPrefHeight() / 2, circle.getRadius() - 30, circle.getRadius() - 30, i * 90, 35);
            arc[i].setType(ArcType.ROUND);
            fanPane.getChildren().add(arc[i]);
        }

        playBtn = new Button("Play");
        pauseBtn = new Button("Pause");
        reverseBtn = new Button("Reverse");

        buttonPane.setStyle("-fx-border-color:Black");
        buttonPane.getChildren().addAll(playBtn, pauseBtn, reverseBtn);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(30);
        buttonPane.setPrefSize(width, 40);
        buttonPane.setLayoutY(height - 40);
        getChildren().addAll(fanPane, buttonPane);

        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (timeline.getRate() > 0 ) {
                    for (int i = 0; i < arc.length; i++) {
                        arc[i].setStartAngle(arc[i].getStartAngle() + 20);
                    }
                }else {
                    for (int i = 0; i < arc.length; i++) {
                        arc[i].setStartAngle(arc[i].getStartAngle() - 20);
                    }

                }
            }
        };

        timeline = new Timeline(new KeyFrame(Duration.millis(500), eventHandler));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    public void pause() {

        timeline.pause();

    }

    public void resume() {
        timeline.play();
    }

    public void reverse() {
        timeline.setRate(-timeline.getRate());
    }


    public Button getPauseBtn() {
        return pauseBtn;
    }

    public Button getPlayBtn() {
        return playBtn;
    }

    public Button getReverseBtn() {
        return reverseBtn;
    }
}
