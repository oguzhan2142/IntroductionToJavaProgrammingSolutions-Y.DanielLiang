package exercise06;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DemonstrateTextFieldProperties extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        VBox mainPane = new VBox();
        HBox top = new HBox();
        HBox bottom = new HBox();


        Label tfLabel = new Label("Text Field");
        TextField tf = new TextField();
        top.setAlignment(Pos.CENTER);
        top.getChildren().addAll(tfLabel,tf);

        RadioButton left = new RadioButton("Left");
        RadioButton center = new RadioButton("Center");
        RadioButton right = new RadioButton("Right");
        ToggleGroup toggleGroup = new ToggleGroup();
        left.setToggleGroup(toggleGroup);
        center.setToggleGroup(toggleGroup);
        right.setToggleGroup(toggleGroup);
        Label csLabel = new Label("Column Size");
        TextField csField = new TextField();
        csField.setPrefWidth(40);
        bottom.setAlignment(Pos.CENTER);
        bottom.setSpacing(10);
        bottom.getChildren().addAll(left,center,right,csLabel,csField);
        mainPane.setSpacing(10);
        mainPane.setPadding(new Insets(10,10,10,10));
        mainPane.getChildren().addAll(top,bottom);


        left.setOnAction(event -> {
           tf.setAlignment(Pos.CENTER_LEFT);
        });
        center.setOnAction(event -> {
            tf.setAlignment(Pos.CENTER);
        });
        right.setOnAction(event -> {
            tf.setAlignment(Pos.CENTER_RIGHT);
        });
        csField.setOnKeyReleased(event -> {

            if (event.getCode() == KeyCode.ENTER)
            tf.setFont(Font.font(Integer.parseInt(csField.getText())));
        });

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Dynamic String");
        primaryStage.show();
    }
}
