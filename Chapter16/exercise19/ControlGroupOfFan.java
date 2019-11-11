package exercise19;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ControlGroupOfFan extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        FanPane fanPane1 = new FanPane();
        FanPane fanPane2 = new FanPane();
        FanPane fanPane3 = new FanPane();
        Button startBtn = new Button("Start All");
        Button stopBtn = new Button("Stop All");

        startBtn.setOnAction(event -> {
            fanPane1.start();
            fanPane2.start();
            fanPane3.start();
        });

        stopBtn.setOnAction(event -> {
            fanPane1.stop();
            fanPane2.stop();
            fanPane3.stop();

        });
        HBox fanPane = new HBox(fanPane1, fanPane2, fanPane3);
        fanPane.setSpacing(50);
        HBox buttonPane = new HBox(startBtn, stopBtn);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(100);
        VBox mainPane = new VBox(fanPane, buttonPane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Control Group Of Fan");
        primaryStage.show();
    }

    class FanPane extends Pane {

        private double width = 600, height = 600;
        private Circle circle;
        private Arc[] arc = new Arc[4];
        private Button pauseBtn;
        private Button playBtn;
        private Pane fanPane = new Pane();
        private HBox sliderPane = new HBox();
        private HBox buttonPane = new HBox();
        private BorderPane borderPane = new BorderPane();
        private Timeline timeline;
        private Slider slider;


        public FanPane() {
            fanPane.setPrefWidth(width);
            fanPane.setPrefHeight(height - 40);
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
            slider = new Slider(0, 100, 50);

            playBtn.setOnAction(event -> {

                timeline.play();

            });

            pauseBtn.setOnAction(event -> {
                timeline.pause();
            });

            slider.valueProperty().addListener((observable, oldValue, newValue) -> {
                timeline.setRate(newValue.doubleValue());
            });

            buttonPane.getChildren().addAll(playBtn, pauseBtn);
            buttonPane.setSpacing(30);
            buttonPane.setAlignment(Pos.CENTER);
            sliderPane.getChildren().addAll(slider);
            sliderPane.setAlignment(Pos.CENTER);
            sliderPane.setSpacing(30);
            sliderPane.setPrefHeight(80);
            borderPane.setTop(buttonPane);
            borderPane.setCenter(fanPane);
            borderPane.setBottom(sliderPane);
            getChildren().addAll(borderPane);

            EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {

                    if (timeline.getRate() > 0) {
                        for (int i = 0; i < arc.length; i++) {
                            arc[i].setStartAngle(arc[i].getStartAngle() + 20);
                        }
                    } else {
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

        public void stop() {
            timeline.pause();
        }

        public void start() {
            timeline.play();
        }

        public void updateSpeed(double value) {


            timeline.setRate(value);


        }

        public Slider getSlider() {
            return slider;
        }


    }
}


