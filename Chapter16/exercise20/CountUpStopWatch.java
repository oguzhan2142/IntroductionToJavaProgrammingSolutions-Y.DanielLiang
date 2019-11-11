package exercise20;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

public class CountUpStopWatch extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        StopWatch stopWatch = new StopWatch();
        primaryStage.setScene(new Scene(stopWatch));
        primaryStage.setTitle("StopWatch");
        primaryStage.show();
    }

    class StopWatch extends VBox {


        private int hour = 0;
        private int minute = 0;
        private int second = 0;
        private Label label;
        private Button playPauseBtn;
        private Button clearBtn;
        private Timeline timeline;

        public StopWatch() {
            setPadding(new Insets(20,10,20,10));
            setSpacing(20);
            playPauseBtn = new Button("play");
            clearBtn = new Button("clear");
            label = new Label("00:00:00");
            label.setFont(Font.font("Tahoma" , FontWeight.BOLD ,30 ));
            label.setAlignment(Pos.CENTER);
            timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {


                second++;

                if (second == 60) {
                    second = 0;
                    minute++;
                }
                if (minute == 60) {
                    minute = 0;
                    hour++;
                }


                label.setText(hour + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second));


            }));
            timeline.setCycleCount(Timeline.INDEFINITE);


            playPauseBtn.setOnAction(event -> {

                if (playPauseBtn.getText() == "play"){
                    playPauseBtn.setText("pause");
                    timeline.play();

                }else {
                    playPauseBtn.setText("play");
                    timeline.pause();
                }


            });

            clearBtn.setOnAction(event -> {

                label.setText("00:00:00");
                hour = 0;
                minute = 0;
                second = 0;
            });



            HBox buttonPane = new HBox(20, playPauseBtn, clearBtn);
            buttonPane.setAlignment(Pos.CENTER);
            StackPane labelPane = new StackPane(label);
            getChildren().addAll(labelPane, buttonPane);
        }
    }
}
