package exercise08;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Display54Cards extends Application  {
    @Override
    public void start(Stage primaryStage) throws Exception {

        ImageView [] imageViews = new ImageView[52];
        Image [] image = new Image[52];
        GridPane pane = new GridPane();

        int column = 0;
        int row = 0;
        for (int i = 0; i <imageViews.length ; i++) {

                image[i] =  new Image("exercise08/img/" + (i + 1) + ".png");
                imageViews[i]= new ImageView(image[i]);
                GridPane.setConstraints(imageViews[i] , row++ , column );
                pane.getChildren().add(imageViews[i]);


            if ( (i + 1) % 9 == 0 ){
                column++;
                row = 0;


            }

        }


        Scene scene = new Scene(pane , image[0].getWidth() * 9,image[0].getHeight() * 6 );
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cards");
        primaryStage.show();


    }
}
