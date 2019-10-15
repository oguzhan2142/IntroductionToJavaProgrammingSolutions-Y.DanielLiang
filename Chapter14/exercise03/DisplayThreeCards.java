package exercise03;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DisplayThreeCards extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        Image [] images = new Image[52];
        ImageView[] showImage  = new ImageView[images.length];

        for (int i = 0; i < 52; i++) {

            images[i] = new Image("exercise03/img/card/" + (i + 1) + ".png");
            showImage[i] = new ImageView(images[i]);

        }



       HBox pane = new HBox();
        pane.getChildren().addAll(getRandomCard(showImage) , getRandomCard(showImage) ,getRandomCard(showImage));
        Scene scene = new Scene(pane, 400,200);


        primaryStage.setTitle("Display 3 cards");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static ImageView getRandomCard(ImageView[] list){

        ImageView image;

        int randomIndex = (int) (Math.random() * 52);


        return list[randomIndex];

    }
}
