package exercise17;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class FindTheBoundingRectangle extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final double radius = 10;
        double width = 800, height = 400;
        Pane mainPane = new Pane();
        Pane pointsPane = new Pane();
        VBox labelsPane = new VBox();


        labelsPane.setStyle("-fx-border-color:Black");
        labelsPane.setPadding(new Insets(5, 5, 5, 5));
        labelsPane.setLayoutX(20);
        labelsPane.setLayoutY(20);
        Label instruction = new Label("INSTRUCTION:");
        Label add = new Label("Add: Left Click");
        Label remove = new Label("Remove: Right Click");
        labelsPane.getChildren().addAll(instruction, add, remove);


        pointsPane.setStyle("-fx-border-color : Black");
        pointsPane.setLayoutX(300);
        pointsPane.setLayoutY(40);
        pointsPane.setPrefSize(300, 300);


        pointsPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (event.getButton() == MouseButton.PRIMARY) {

                    pointsPane.getChildren().add(new Circle(event.getX(), event.getY(), radius));
                    pointsPane.setPrefWidth(pointsPane.getPrefWidth() + 5);
                    pointsPane.setPrefHeight(pointsPane.getPrefHeight() + 5);

                }
                if (event.getButton() == MouseButton.SECONDARY) {

                    ObservableList<Node> list = pointsPane.getChildren();

                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).contains(event.getX(), event.getY())) {
                            list.remove(i);
                            pointsPane.setPrefWidth(pointsPane.getPrefWidth() - 5);
                            pointsPane.setPrefHeight(pointsPane.getPrefHeight() - 5);
                            break;
                        }
                    }
                }

            }
        });

        mainPane.getChildren().addAll(labelsPane, pointsPane);
        primaryStage.setScene(new Scene(mainPane, width, height));
        primaryStage.setTitle("Find The Bounding Rectangle");
        primaryStage.show();
        mainPane.requestFocus();
    }
}
