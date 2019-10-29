package exercise07;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ChangeColorUsingAMause extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox mainPane = new VBox();
        StackPane buttonPane = new StackPane();
        Pane circlePane = new Pane();
        circlePane.setPrefSize(200, 200);

        Circle circle = new Circle(100, 100, 50);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        Button button = new Button("Change");


        circlePane.getChildren().add(circle);
        buttonPane.getChildren().add(button);


        button.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                circle.setFill(Color.BLACK);
                circlePane.getChildren().clear();
                circlePane.getChildren().add(circle);
            }
        });
        button.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                circle.setFill(Color.WHITE);
                circlePane.getChildren().clear();
                circlePane.getChildren().add(circle);

            }
        });


        mainPane.getChildren().addAll(circlePane, buttonPane);
        primaryStage.setTitle("Change Color");
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();


    }
}
