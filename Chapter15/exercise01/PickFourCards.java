package exercise01;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PickFourCards extends Application {


    private static ImageView getRandomCard(ImageView[] list) {

        ImageView image;

        int randomIndex = (int) (Math.random() * 52);


        return list[randomIndex];

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Image[] image = new Image[52];
        ImageView[] card = new ImageView[image.length];
        for (int i = 0; i < image.length; i++) {
            image[i] = new Image("exercise01/img/card/" + (i + 1) + ".png");
            card[i] = new ImageView(image[i]);
        }


        VBox mainPane = new VBox();
        HBox cardsPane = new HBox();
        StackPane buttonPane = new StackPane();

        cardsPane.setSpacing(3);
        mainPane.setPadding(new Insets(10, 10, 10, 10));
        mainPane.setSpacing(20);


        for (int i = 0; i < 4; i++) {

            cardsPane.getChildren().add(getRandomCard(card));

        }

        Button refleshBtn = new Button("Reflesh");
        buttonPane.getChildren().add(refleshBtn);

        refleshBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                cardsPane.getChildren().clear();

                for (int i = 0; i < 4; i++) {

                    cardsPane.getChildren().add(getRandomCard(card));

                }


            }
        });

        mainPane.getChildren().addAll(cardsPane, buttonPane);

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Pick Four Cards");
        primaryStage.show();

    }

}
