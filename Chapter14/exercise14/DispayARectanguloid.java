package exercise14;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DispayARectanguloid extends Application {
    double[][] point = new double[8][2];
    Line line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12;
    

    @Override
    public void start(Stage primaryStage) throws Exception {


        primaryStage.setWidth(400);
        primaryStage.setHeight(400);


        Pane pane = new Pane();


        printCube(primaryStage, pane);

        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                pane.getChildren().clear();
                primaryStage.setWidth(newValue.doubleValue());
                printCube(primaryStage, pane);


            }
        });


        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rectanguloid");
        primaryStage.show();

    }

    private void printCube(Stage primaryStage, Pane pane) {
        point[0][0] = primaryStage.getWidth() / 5 * 2;
        point[0][1] = primaryStage.getHeight() / 5;

        point[1][0] = primaryStage.getWidth() / 5 * 4;
        point[1][1] = primaryStage.getHeight() / 5;

        point[2][0] = primaryStage.getWidth() / 5 * 1;
        point[2][1] = primaryStage.getHeight() / 5 * 2;

        point[3][0] = primaryStage.getWidth() / 5 * 3;
        point[3][1] = primaryStage.getHeight() / 5 * 2;

        point[4][0] = primaryStage.getWidth() / 5 * 2;
        point[4][1] = primaryStage.getHeight() / 5 * 3;

        point[5][0] = primaryStage.getWidth() / 5 * 4;
        point[5][1] = primaryStage.getHeight() / 5 * 3;

        point[6][0] = primaryStage.getWidth() / 5 * 1;
        point[6][1] = primaryStage.getHeight() / 5 * 4;

        point[7][0] = primaryStage.getWidth() / 5 * 3;
        point[7][1] = primaryStage.getHeight() / 5 * 4;

        line1 = new Line(point[0][0], point[0][1], point[1][0], point[1][1]);
        line2 = new Line(point[2][0], point[2][1], point[3][0], point[3][1]);
        line3 = new Line(point[0][0], point[0][1], point[2][0], point[2][1]);
        line4 = new Line(point[1][0], point[1][1], point[3][0], point[3][1]);

        line5 = new Line(point[4][0], point[4][1], point[5][0], point[5][1]);
        line6 = new Line(point[6][0], point[6][1], point[7][0], point[7][1]);
        line7 = new Line(point[4][0], point[4][1], point[6][0], point[6][1]);
        line8 = new Line(point[5][0], point[5][1], point[7][0], point[7][1]);

        line9 = new Line(point[0][0], point[0][1], point[4][0], point[4][1]);
        line10 = new Line(point[1][0], point[1][1], point[5][0], point[5][1]);
        line11 = new Line(point[2][0], point[2][1], point[6][0], point[6][1]);
        line12 = new Line(point[3][0], point[3][1], point[7][0], point[7][1]);

        pane.getChildren().addAll(line1, line2, line3, line4, line5, line6, line7, line8, line9, line10, line11, line12);
    }

}
