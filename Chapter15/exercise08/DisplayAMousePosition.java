package exercise08;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class DisplayAMousePosition extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Text cordinates = new Text();

        pane.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double positionX = event.getX();
                double positionY = event.getY();
                String s = "(" + positionX + "," + positionY + ")";
                cordinates.setX(positionX);
                cordinates.setY(positionY);
                cordinates.setText(s);
                pane.getChildren().add(cordinates);
            }
        });

        pane.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                pane.getChildren().clear();
            }
        });


        primaryStage.setTitle("Mouse Position");
        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.show();


    }
}
