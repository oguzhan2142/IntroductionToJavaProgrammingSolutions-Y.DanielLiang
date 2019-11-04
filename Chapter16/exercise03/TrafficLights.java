package exercise03;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class TrafficLights extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane mainPane = new BorderPane();
        HBox buttonPane = new HBox();
        LightPane lightPane = new LightPane();

        RadioButton red = new RadioButton("Red");
        RadioButton yellow = new RadioButton("Yellow");
        RadioButton green = new RadioButton("Green");
        ToggleGroup toggleGroup = new ToggleGroup();
        red.setToggleGroup(toggleGroup);
        yellow.setToggleGroup(toggleGroup);
        green.setToggleGroup(toggleGroup);

        buttonPane.getChildren().addAll(red,yellow,green);
        buttonPane.setSpacing(20);
        buttonPane.setAlignment(Pos.CENTER);

        red.setOnAction(event -> {
            lightPane.getRed().setFill(Color.RED);
            lightPane.getYellow().setFill(Color.WHITE);
            lightPane.getGreen().setFill(Color.WHITE);
        });

        yellow.setOnAction(event -> {
            lightPane.getYellow().setFill(Color.YELLOW);
            lightPane.getRed().setFill(Color.WHITE);
            lightPane.getGreen().setFill(Color.WHITE);

        });

        green.setOnAction(event -> {
            lightPane.getGreen().setFill(Color.GREEN);
            lightPane.getYellow().setFill(Color.WHITE);
            lightPane.getRed().setFill(Color.WHITE);

        });

        mainPane.setCenter(lightPane);
        mainPane.setAlignment(lightPane, Pos.CENTER);
        mainPane.setBottom(buttonPane);
        mainPane.setAlignment(buttonPane,Pos.CENTER);
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Traffic Light");
        primaryStage.show();
    }

    class LightPane extends Pane {

        Circle red = new Circle(40);
        Circle yellow = new Circle(40);
        Circle green = new Circle(40);
        VBox vBox = new VBox();


        public LightPane() {
            setPrefSize(400, 400);
            red.setFill(Color.WHITE);
            red.setStroke(Color.BLACK);
            yellow.setFill(Color.WHITE);
            yellow.setStroke(Color.BLACK);
            green.setFill(Color.WHITE);
            green.setStroke(Color.BLACK);
            vBox.setStyle("-fx-border-color:Black");
            vBox.setPadding(new Insets(10, 10, 10, 10));
            vBox.setSpacing(20);
            vBox.getChildren().addAll(red, yellow, green);
            vBox.setLayoutX(getPrefWidth() / 2 - (10 * 2 + 40 * 2) / 2);
            vBox.setLayoutY(30);
            getChildren().add(vBox);
        }


        public Circle getRed() {
            return red;
        }

        public void setRed(Circle red) {
            this.red = red;
        }

        public Circle getYellow() {
            return yellow;
        }

        public void setYellow(Circle yellow) {
            this.yellow = yellow;
        }

        public Circle getGreen() {
            return green;
        }

        public void setGreen(Circle green) {
            this.green = green;
        }
    }


}
