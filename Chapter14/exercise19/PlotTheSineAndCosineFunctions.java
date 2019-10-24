package exercise19;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlotTheSineAndCosineFunctions extends Application {
    double width = 500;
    double height = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Line xLine = new Line(0, height / 2, width, height / 2);
        Line yLine = new Line(width / 2 , 0 , width / 2 , height);

        Text[] degree = new Text[5];
        for (int i = 0; i < degree.length; i++) {

            degree[i] = new Text();
            degree[i].setY(height / 2);
            pane.getChildren().add(degree[i]);
        }


        degree[0].setText("-2\u03c0");
        degree[1].setText( "-\u03c0");
        degree[2].setText("0");
        degree[3].setText("\u03c0");
        degree[4].setText("2\u03c0");

        degree[0].setX(width / 2 - 150);
        degree[1].setX(width / 2 - 50);
        degree[2].setX(width / 2);
        degree[3].setX(width / 2 + 50);
        degree[4].setX(width / 2 + 150);

        Polyline sinFunction = new Polyline();
        sinFunction.setStroke(Color.RED);
        ObservableList<Double> list = sinFunction.getPoints();

        for (int i = -170 ; i <= 170 ; i++) {

            list.add(i + width / 2);
            list.add(height / 2 - 50 * Math.sin((i / 100.0) * 2 * Math.PI));


        }

        Polyline cosFunction = new Polyline();
        cosFunction.setStroke(Color.BLUE);
        ObservableList<Double> list2 = cosFunction.getPoints();

        for (int i = -170 ; i <= 170 ; i++) {

            list2.add(i + width / 2);
            list2.add(height / 2 - 50 * Math.cos((i / 100.0) * 2 * Math.PI));

        }


        pane.getChildren().addAll(xLine, yLine,cosFunction,sinFunction);
        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("sine and cosine functions");
        primaryStage.show();

    }
}
