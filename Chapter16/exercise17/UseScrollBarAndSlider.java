package exercise17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UseScrollBarAndSlider extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Label redL = new Label("Red");
        Label greedL = new Label("Green");
        Label blueL = new Label("Blue");
        Label opacityL = new Label("Opacity");

        Slider redSlider = new Slider(0, 100, 10);
        Slider greenSlider = new Slider(0, 100, 10);
        Slider blueSlider = new Slider(0, 100, 10);
        Slider opacitySlider = new Slider(0, 100, 10);
        Text text = new Text("Show Colors");


        redSlider.valueProperty().addListener((observable, oldValue, newValue) -> {

            text.setFill(Color.color(newValue.doubleValue() / 100.0, 0, 0));
        });

        greenSlider.valueProperty().addListener((observable, oldValue, newValue) -> {

            text.setFill(Color.color(0, newValue.doubleValue() / 100.0, 0));
        });

        blueSlider.valueProperty().addListener((observable, oldValue, newValue) -> {

            text.setFill(Color.color(0, 0, newValue.doubleValue() / 100.0));
        });

        opacitySlider.valueProperty().addListener((observable, oldValue, newValue) -> {

            text.setOpacity(newValue.doubleValue() / 100.0);
        });




        StackPane stackPane = new StackPane(text);
        HBox hBox = new HBox(redL, redSlider);
        HBox hBox1 = new HBox(greedL, greenSlider);
        HBox hBox2 = new HBox(blueL, blueSlider);
        HBox hBox3 = new HBox(opacityL, opacitySlider);
        VBox vBox = new VBox(10, stackPane, hBox, hBox1, hBox2, hBox3);
        vBox.setPadding(new Insets(20, 10, 10, 10));
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("ScrollBar And Slider...");
        primaryStage.show();

    }
}
