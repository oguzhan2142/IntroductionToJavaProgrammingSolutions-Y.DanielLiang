package exercise18;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;


public class PlotTheSquareFunction extends Application {

    double width = 800;
    double height = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Line xLine = new Line(0, height / 2, width, height / 2);
        Line yLine = new Line(width / 2 , 0 , width / 2 , height);

        Polyline polyline = new Polyline();
        ObservableList<Double> list = polyline.getPoints();
        double scaleFactor = -0.0125;

        for (int i = -100; i <= 100; i++) {

            list.add(i + width / 2);
            list.add(scaleFactor * i * i + height / 2);

        }




        pane.getChildren().addAll(xLine, yLine,polyline);
        Scene scene = new Scene(pane, width, height);
        primaryStage.setScene(scene);
        primaryStage.setTitle("X^2 diagram");
        primaryStage.show();


    }
}
