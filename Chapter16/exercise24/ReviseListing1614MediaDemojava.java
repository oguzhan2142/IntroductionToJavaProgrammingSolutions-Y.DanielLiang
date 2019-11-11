package exercise24;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class ReviseListing1614MediaDemojava extends Application {
    String url = "https://file-examples.com/wp-content/uploads/2017/04/file_example_MP4_480_1_5MG.mp4";

    @Override
    public void start(Stage primaryStage) throws Exception {

        Media media = new Media(url);
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        MediaView mediaView = new MediaView(mediaPlayer);
        mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
        Button playBtn = new Button(">");
        playBtn.setOnAction(event -> {
            if (playBtn.getText().equals(">")) {
                mediaPlayer.play();

                playBtn.setText("||");
            } else {
                mediaPlayer.pause();
                playBtn.setText(">");
            }
        });


        Slider volume = new Slider();
        volume.setPrefWidth(150);
        volume.setMaxWidth(Region.USE_PREF_SIZE);
        volume.setMinWidth(30);
        volume.setValue(50);
        mediaPlayer.volumeProperty().bind(volume.valueProperty().divide(100));


        Slider timeSlider = new Slider();
        timeSlider.setPrefWidth(150);
        timeSlider.setMaxWidth(Region.USE_PREF_SIZE);
        timeSlider.setMinWidth(30);


        Label totalTimeLabel = new Label(mediaPlayer.getTotalDuration().toHours() + "");
        Label timeLabel = new Label(mediaPlayer.getCurrentTime().toString());
        timeLabel.textProperty().bind(mediaPlayer.currentTimeProperty().asString());
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(playBtn, new Label("Time"),timeSlider,timeLabel,totalTimeLabel, new Label("Volume"), volume);

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(mediaView);
        borderPane.setBottom(hBox);


        primaryStage.setScene(new Scene(borderPane, 650, 500));
        primaryStage.setTitle("MediaDemo");
        primaryStage.show();

    }
}
