package exercise02;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class RotateARectangle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        double width = 400;
        double height = 400;

        Pane mainPane = new Pane();


        Rectangle rectangle = new Rectangle(100, 150, 200, 100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setFill(Color.WHITE);

        Button rotateBtn = new Button("Rotate");
        rotateBtn.setPrefWidth(100);
        rotateBtn.relocate(width / 2 - rotateBtn.getPrefWidth() / 2 ,height-40);
        rotateBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                rectangle.setRotate(rectangle.getRotate() + 15);
            }
        });


        mainPane.getChildren().addAll(rectangle, rotateBtn);

        primaryStage.setScene(new Scene(mainPane, width, height));
        primaryStage.setTitle("Rotate Rectangle");
        primaryStage.show();

    }
}
