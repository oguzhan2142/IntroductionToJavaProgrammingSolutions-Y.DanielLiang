package exercise23;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;
import javafx.util.Duration;


public class CreateAnImageAnimatorWithAudio extends Application {
    int n = 0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane gridPane = new GridPane();
        Label label1 = new Label("Enter Information For Animation");
        Label label2 = new Label("Animation speed in milisecond");
        Label label3 = new Label("Image file prefix");
        Label label4 = new Label("Number of images");
        Label label5 = new Label("Audio file url");
        TextField animationSpeedField = new TextField();
        TextField prefixField = new TextField();
        TextField numOfImageField = new TextField();
        TextField urlField = new TextField();
        gridPane.add(label1, 0, 0);
        gridPane.add(label2, 0, 1);
        gridPane.add(animationSpeedField, 1, 1);
        gridPane.add(label3, 0, 2);
        gridPane.add(prefixField, 1, 2);
        gridPane.add(label4, 0, 3);
        gridPane.add(numOfImageField, 1, 3);
        gridPane.add(label5, 0, 4);
        gridPane.add(urlField, 1, 4);
        Pane animationPane = new Pane();
        animationPane.setPrefSize(400, 300);



        Button startBtn = new Button("Start Animation");
        startBtn.setOnAction(event -> {

            String audioUrl = urlField.getText();
            AudioClip audioClip = new AudioClip(audioUrl);
            audioClip.setCycleCount(AudioClip.INDEFINITE);
            audioClip.play();
            String prefix = prefixField.getText();

            ImageView[] imageViews = new ImageView[Integer.parseInt(numOfImageField.getText())];
            for (int i = 0; i < imageViews.length; i++) {
                imageViews[i] = new ImageView(new Image("exercise23/card/"+ prefix + (1 + i) +".png"));

            }
            Timeline timeline = new Timeline(new KeyFrame(Duration.millis(Double.parseDouble(animationSpeedField.getText())) , event1 -> {
                animationPane.getChildren().remove(0,1);
                animationPane.getChildren().add(imageViews[n++]);
                if (n == imageViews.length){
                    audioClip.stop();
                }

            }));
            timeline.setCycleCount(imageViews.length);
            timeline.play();

        });

        startBtn.setPrefWidth(130);
        startBtn.setLayoutX(animationPane.getPrefWidth() - startBtn.getPrefWidth());
        animationPane.getChildren().add(startBtn);
        VBox mainPane = new VBox(animationPane, gridPane);
        primaryStage.setTitle("Image and Audio Animator");
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }
}
