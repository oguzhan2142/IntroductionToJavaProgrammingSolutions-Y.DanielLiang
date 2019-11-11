package exercise22;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

public class PlayLoopStopASoundClip extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        String url = "https://file-examples.com/wp-content/uploads/2017/11/file_example_MP3_2MG.mp3";
        AudioClip audioClip = new AudioClip(url);

        Button playBtn = new Button("Play");
        Button stopBtn = new Button("Stop");
        Button loopBtn = new Button("Loop");

        playBtn.setOnAction(event -> {
            audioClip.play();
        });

        stopBtn.setOnAction(event -> {
            audioClip.stop();
        });

        loopBtn.setOnAction(event -> {
            audioClip.setCycleCount(AudioClip.INDEFINITE);
        });


        HBox mainPane = new HBox(20, playBtn, stopBtn, loopBtn);
        mainPane.setAlignment(Pos.CENTER);
        mainPane.setPadding(new Insets(20,20,20,20));
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Play,Loop,Stop");
        primaryStage.show();
    }
}
