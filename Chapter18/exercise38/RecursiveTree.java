package exercise38;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class RecursiveTree extends Application {
    private static void drawTree(Pane pane, int order) {

        pane.getChildren().clear();
        Line line = new Line(pane.getPrefWidth() / 2, pane.getPrefHeight() / 2, pane.getPrefWidth() / 2, pane.getPrefHeight() - 20);
        pane.getChildren().add(line);

        drawTree(order, line.getStartX(), line.getStartY(), 60, 100, pane);
        drawTree(order, line.getStartX(), line.getStartY(), 120, 100, pane);

    }

    private static void drawTree(int order, double startX, double startY, double angle, double size, Pane pane) {

        if (order == 0)
            return;

        double endX = startX + size * Math.cos(Math.toRadians(angle));
        double endY = startY - size * Math.sin(Math.toRadians(angle));
        Line line = new Line(startX, startY, endX, endY);

        pane.getChildren().add(line);

        drawTree(order - 1, endX, endY, angle + 30, size / 2, pane);
        drawTree(order - 1, endX, endY, angle - 30, size / 2, pane);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        TextField textfield = new TextField();
        Pane drawingPane = new Pane();
        drawingPane.setPrefSize(500, 500);

        textfield.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.ENTER) {
                int order = Integer.parseInt(textfield.getText());
                drawTree(drawingPane, order);
            }

        });


        HBox controlPane = new HBox(20, new Label("Enter an Order:"), textfield);
        controlPane.setAlignment(Pos.CENTER);
        mainPane.setBottom(controlPane);
        mainPane.setCenter(drawingPane);
        primaryStage.setTitle("Recursive Tree");
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();


    }

}
