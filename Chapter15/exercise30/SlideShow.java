package exercise30;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class SlideShow extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Slide slide = new Slide();

        slide.setOnMouseClicked(event -> {

            if (slide.getTimeline().getStatus() == Timeline.Status.RUNNING){
                slide.getTimeline().stop();
            }else {
                slide.getTimeline().play();
            }

        });

        primaryStage.setScene(new Scene(slide, 400, 400));
        primaryStage.setTitle("slide show");
        primaryStage.show();
    }


}

class Slide extends Pane {

    private int index;
    private Image[] image = new Image[52];
    private ImageView[] imageView = new ImageView[image.length];
    private Timeline timeline;

    public Slide() {

        for (int i = 0; i < image.length; i++) {
            image[i] = new Image("exercise30/card/" + (i + 1) + ".png");
            imageView[i] = new ImageView(image[i]);
            imageView[i].setFitWidth(400);
            imageView[i].setFitHeight(400);
        }

        EventHandler<ActionEvent> eventHandler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                getChildren().clear();
                getChildren().add(imageView[index++]);
                if (index == imageView.length) {
                    index = 0;
                }
            }
        };

        timeline = new Timeline(new KeyFrame(Duration.millis(2000), eventHandler));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }


    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }
}
