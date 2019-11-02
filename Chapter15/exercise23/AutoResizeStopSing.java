package exercise23;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class AutoResizeStopSing extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        final double width = 600;
        final double height = 600;


        StackPane pane = new StackPane();


        Text stop = new Text("STOP");
        stop.setFont(Font.font("Tahoma", FontWeight.NORMAL, FontPosture.REGULAR, width / 10));
        stop.setFill(Color.WHITE);
        Polygon octagon = new Polygon();

        Double centerX = pane.getWidth() / 2;
        Double centerY = pane.getHeight() / 2;
        double radius = Math.min(width, height) / 3;


        ObservableList<Double> points = octagon.getPoints();

        for (int i = 0; i < 8; i++) {

            points.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            points.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));

        }

        pane.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                points.clear();
                stop.setFont(Font.font("Tahoma", FontWeight.NORMAL, FontPosture.REGULAR, newValue.doubleValue() / 10));
                for (int i = 0; i < 8; i++) {

                    points.add(newValue.doubleValue() / 2 + newValue.doubleValue() / 3 * Math.cos(2 * i * Math.PI / 8));
                    points.add(newValue.doubleValue() / 2 - newValue.doubleValue() / 3 * Math.sin(2 * i * Math.PI / 8));

                }

            }
        });

        pane.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                points.clear();
                stop.setFont(Font.font("Tahoma", FontWeight.NORMAL, FontPosture.REGULAR, newValue.doubleValue() / 10));
                for (int i = 0; i < 8; i++) {

                    points.add(newValue.doubleValue() / 2 + newValue.doubleValue() / 3 * Math.cos(2 * i * Math.PI / 8));
                    points.add(newValue.doubleValue() / 2 - newValue.doubleValue() / 3 * Math.sin(2 * i * Math.PI / 8));

                }
            }
        });

        octagon.setRotate(360 / 16);
        octagon.setFill(Color.RED);

        pane.getChildren().addAll(octagon, stop);


        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Stop");
        primaryStage.show();

        pane.requestFocus();

    }
}
