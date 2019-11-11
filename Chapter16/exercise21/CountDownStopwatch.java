package exercise21;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;

public class CountDownStopwatch extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Stopwatch stopwatch = new Stopwatch()  ;

        File musicFile = new File("/Users/oguzhan/Chapter16/src/exercise21/music/test.mp3");
        Media media = new Media(musicFile.toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setCycleCount(Timeline.INDEFINITE);
        mediaPlayer.setAutoPlay(true);
        mediaPlayer.setVolume(100);
        mediaPlayer.play();

        primaryStage.setTitle("Count Down Stopwatch");
        primaryStage.setScene(new Scene(stopwatch));
        primaryStage.show();
    }

    class Stopwatch extends StackPane {


        private TextField textField = new TextField("0");
        private Timeline timeline;
        private double time;
        private MediaPlayer mediaPlayer = new MediaPlayer(new Media(new File("/Users/oguzhan/Chapter16/src/exercise21/music/test.mp3").toURI().toString()));

        public Stopwatch() {

            textField.setFont(Font.font(30));
            textField.setAlignment(Pos.CENTER);
            mediaPlayer.setCycleCount(Timeline.INDEFINITE);
            timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {

                time--;
                textField.setText(time + "");
                if (time == 0){
                    timeline.stop();
                    mediaPlayer.play();
                }

            }));
            timeline.setCycleCount(Timeline.INDEFINITE);

            textField.setOnKeyPressed(event -> {
                if (event.getCode() == KeyCode.ENTER) {
                    time = Double.parseDouble(textField.getText());
                    timeline.play();
                }
            });


            getChildren().add(textField);

        }
    }
}
