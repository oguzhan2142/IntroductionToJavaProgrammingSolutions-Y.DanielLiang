package exercise02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

public class SelectGeometricFigures extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane mainPane = new BorderPane();
        Pane displayPane = new Pane();
        displayPane.setPrefSize(500, 400);
        HBox buttonPane = new HBox();
        buttonPane.setSpacing(10);
        buttonPane.setAlignment(Pos.CENTER);
        mainPane.setCenter(displayPane);
        mainPane.setBottom(buttonPane);

        RadioButton circleBtn = new RadioButton("Circle");
        RadioButton rectangleBtn = new RadioButton("Rectangle");
        RadioButton ellipseBtn = new RadioButton("Ellipse");
        CheckBox fillBtn = new CheckBox("Fill");
        ToggleGroup toggleGroup = new ToggleGroup();
        circleBtn.setToggleGroup(toggleGroup);
        rectangleBtn.setToggleGroup(toggleGroup);
        ellipseBtn.setToggleGroup(toggleGroup);

        circleBtn.setOnAction(event -> {
            displayPane.getChildren().clear();
            Circle circle = new Circle(displayPane.getPrefWidth() / 2, displayPane.getPrefHeight() / 2, 100);
            if (fillBtn.isSelected())
                circle.setFill(Color.BLACK);
            else {
                circle.setFill(Color.WHITE);
                circle.setStroke(Color.BLACK);
            }
            displayPane.getChildren().add(circle);
        });

        rectangleBtn.setOnAction(event -> {
            displayPane.getChildren().clear();
            Rectangle rectangle = new Rectangle(displayPane.getWidth() / 2 - 100, displayPane.getHeight() / 2 - 50, 200, 100);
            if (fillBtn.isSelected())
                rectangle.setFill(Color.BLACK);
            else {
                rectangle.setFill(Color.WHITE);
                rectangle.setStroke(Color.BLACK);
            }
            displayPane.getChildren().add(rectangle);
        });
        ellipseBtn.setOnAction(event -> {
            displayPane.getChildren().clear();
            Ellipse ellipse = new Ellipse(displayPane.getWidth() / 2, displayPane.getHeight() / 2, 100, 50);
            if (fillBtn.isSelected())
                ellipse.setFill(Color.BLACK);
            else {
                ellipse.setFill(Color.WHITE);
                ellipse.setStroke(Color.BLACK);
            }
            displayPane.getChildren().add(ellipse);
        });


        fillBtn.setOnAction(event -> {
            Shape shape = (Shape) displayPane.getChildren().get(0);

            if (fillBtn.isSelected()) {
                shape.setFill(Color.BLACK);

            } else {
                shape.setFill(Color.WHITE);
                shape.setStroke(Color.BLACK);

            }
        });


        buttonPane.getChildren().addAll(circleBtn, rectangleBtn, ellipseBtn, fillBtn);

        primaryStage.setTitle("Geometric Figures");
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }
}
