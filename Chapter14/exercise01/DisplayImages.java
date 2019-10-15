package exercise01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox pane = new HBox();


        Image turkey = new Image("exercise01/img/turkey.png");
        Image usa = new Image("exercise01/img/usa.png");
        Image biritish = new Image("exercise01/img/biritish.png");


        pane.getChildren().addAll(new ImageView(turkey), new ImageView(usa), new ImageView(biritish));

        Scene scene = new Scene(pane);


        primaryStage.setTitle("flags");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
