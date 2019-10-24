package exercise21;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TwoCirclesAndTheirDistance extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane pane = new Pane();


        primaryStage.setScene(new Scene(pane, 500, 500));
        primaryStage.show();

    }
}

