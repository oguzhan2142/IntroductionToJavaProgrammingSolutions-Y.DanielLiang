package exercise01;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseRadioButtons extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox radioButtonPane = new HBox();
        HBox buttonPane = new HBox();
        Pane textPane = new Pane();
        textPane.setPrefSize(600, 400);
        textPane.setStyle("-fx-border-color:Black");
        Text text = new Text(50, textPane.getPrefHeight() / 2, "Programming Is Fun");
        text.setFont(Font.font(30));

        textPane.getChildren().add(text);

        Button rightBtn = new Button("->");
        Button leftBtn = new Button("<-");
        buttonPane.getChildren().addAll(leftBtn, rightBtn);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(50);
        radioButtonPane.setAlignment(Pos.CENTER);
        radioButtonPane.setSpacing(10);
        RadioButton radioButtonRed = new RadioButton("Red");
        RadioButton radioButtonYellow = new RadioButton("Yellow");
        RadioButton radioButtonBlack = new RadioButton("Black");
        RadioButton radioButtonOrange = new RadioButton("Orange");
        RadioButton radioButtonGreen = new RadioButton("Green");
        ToggleGroup toggleGroup = new ToggleGroup();
        radioButtonRed.setToggleGroup(toggleGroup);
        radioButtonYellow.setToggleGroup(toggleGroup);
        radioButtonBlack.setToggleGroup(toggleGroup);
        radioButtonOrange.setToggleGroup(toggleGroup);
        radioButtonGreen.setToggleGroup(toggleGroup);



        radioButtonRed.setOnAction(event -> {
            text.setFill(Color.RED);
        });
        radioButtonYellow.setOnAction(event -> {
            text.setFill(Color.YELLOW);
        });
        radioButtonBlack.setOnAction(event -> {
            text.setFill(Color.BLACK);
        });
        radioButtonOrange.setOnAction(event -> {
            text.setFill(Color.ORANGE);
        });
        radioButtonGreen.setOnAction(event -> {
            text.setFill(Color.GREEN);
        });


        rightBtn.setOnAction(event -> {
            text.setX(text.getX() + 20);
        });
        leftBtn.setOnAction(event -> {
            text.setX(text.getX() - 20);
        });

        radioButtonPane.getChildren().addAll(radioButtonRed, radioButtonYellow, radioButtonBlack, radioButtonOrange, radioButtonGreen);

        mainPane.setCenter(textPane);
        mainPane.setBottom(buttonPane);
        mainPane.setTop(radioButtonPane);


        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Use Radio Buttons");
        primaryStage.show();
    }
}
