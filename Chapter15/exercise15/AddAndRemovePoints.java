package exercise15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AddAndRemovePoints extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();


        pane.setOnMouseClicked(e -> {

            if (e.getButton() == MouseButton.PRIMARY) {
                double x = e.getX();
                double y = e.getY();
                pane.getChildren().add(new Circle(x, y, 20));

            }
            if (e.getButton() == MouseButton.SECONDARY) {
                double x = e.getX();
                double y = e.getY();

                ObservableList<Node> circles = pane.getChildren();

                for (int i = 0; i < circles.size(); i++) {
                    if (circles.get(i).contains(x, y)) {
                        circles.remove(i);
                        break;
                    }

                }

            }

        });


        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.setTitle("Add and Remove Points");
        primaryStage.show();
        pane.requestFocus();

    }
}
