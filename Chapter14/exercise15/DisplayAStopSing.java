package exercise15;

import javafx.application.Application;
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

public class DisplayAStopSing extends Application {

    final double width = 600;
    final double height = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane pane = new StackPane();


        Text stop = new Text("STOP");
        stop.setFont(Font.font("Tahoma", FontWeight.NORMAL, FontPosture.REGULAR, 80));
        stop.setFill(Color.WHITE);
        Polygon octagon = new Polygon();

        double centerX = pane.getWidth() / 2;
        double centerY = pane.getHeight() / 2;
        double radius = 250;

        ObservableList<Double> points = octagon.getPoints();

        for (int i = 0; i < 8; i++) {
            points.add(centerX + radius * Math.cos(2 * i * Math.PI / 8));
            points.add(centerY - radius * Math.sin(2 * i * Math.PI / 8));

        }


        octagon.setRotate(360 / 16);
        octagon.setFill(Color.RED);

        pane.getChildren().addAll(octagon, stop);


        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Stop");
        primaryStage.show();

    }
}
