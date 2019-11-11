package exercise26;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RaiseFlagAndPlayAnthem extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();


        ImageView turkeyImg = new ImageView(new Image("file:/Users/oguzhan/Chapter16/src/exercise26/img/turkey.png"));
        ImageView brazilImg = new ImageView(new Image("file:/Users/oguzhan/Chapter16/src/exercise26/img/brazil.png"));
        ImageView usaImg = new ImageView(new Image("file:/Users/oguzhan/Chapter16/src/exercise26/img/usa.png"));

        AudioClip tAnthem = new AudioClip("file:/Users/oguzhan/Chapter16/src/exercise26/anthem/turkey.mp3");
        AudioClip bAnthem = new AudioClip("file:/Users/oguzhan/Chapter16/src/exercise26/anthem/brazil.mp3");
        AudioClip aAnthem = new AudioClip("file:/Users/oguzhan/Chapter16/src/exercise26/anthem/usa.mp3");

        Line path = new Line(300, 800, 300, 0);

        PathTransition pathTransition1 = new PathTransition(Duration.millis(20000), path, turkeyImg);
        PathTransition pathTransition2 = new PathTransition(Duration.millis(20000), path, brazilImg);
        PathTransition pathTransition3 = new PathTransition(Duration.millis(20000), path, usaImg);

        pathTransition1.play();
        tAnthem.play();
        pane.getChildren().addAll(turkeyImg);
        pathTransition1.statusProperty().addListener(observable -> {

            if (pathTransition1.getStatus() == PathTransition.Status.STOPPED) {

                tAnthem.stop();
                pane.getChildren().remove(turkeyImg);
                pane.getChildren().add(brazilImg);
                pathTransition2.play();
                bAnthem.play();
            }
        });
        pathTransition2.statusProperty().addListener(observable -> {

            if (pathTransition2.getStatus() == PathTransition.Status.STOPPED) {
                bAnthem.stop();
                pane.getChildren().remove(brazilImg);
                pane.getChildren().add(usaImg);
                pathTransition3.play();
                aAnthem.play();
            }
        });

        pathTransition3.statusProperty().addListener(observable -> {

            if (pathTransition3.getStatus() == PathTransition.Status.STOPPED) {
                pane.getChildren().remove(usaImg);
                aAnthem.stop();
            }

        });


        pane.getChildren().addAll();
        primaryStage.setTitle("Anthem And Flag");
        primaryStage.setScene(new Scene(pane, 600, 800));
        primaryStage.show();
    }
}
