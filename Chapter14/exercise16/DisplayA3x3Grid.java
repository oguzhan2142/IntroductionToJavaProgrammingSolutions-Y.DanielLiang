package exercise16;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class DisplayA3x3Grid extends Application {

    double width = 400;
    double height = 400;


    Line hLine1 = new Line(0, height * 1 / 3, width, height * 1 / 3);
    Line hLine2 = new Line(0, height * 2 / 3, width, height * 2 / 3);
    Line vLine1 = new Line(width * 1 / 3, 0, width * 1 / 3, height);
    Line vLine2 = new Line(width * 2 / 3, 0, width * 2 / 3, height);

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();


        pane.getChildren().addAll(hLine1, hLine2, vLine1, vLine2);

        ChangeListener<Number> widthListener = new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                width = newValue.doubleValue();


                pane.getChildren().clear();

                hLine1 = new Line(0, height * 1 / 3, width, height * 1 / 3);
                hLine2 = new Line(0, height * 2 / 3, width, height * 2 / 3);
                vLine1 = new Line(width * 1 / 3, 0, width * 1 / 3, height);
                vLine2 = new Line(width * 2 / 3, 0, width * 2 / 3, height);
                pane.getChildren().addAll(hLine1, hLine2, vLine1, vLine2);

                System.out.println("asdasd");

            }
        };

        ChangeListener<Number> heightListener = new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {

                height = newValue.doubleValue();

                pane.getChildren().clear();

                hLine1 = new Line(0, height * 1 / 3, width, height * 1 / 3);
                hLine2 = new Line(0, height * 2 / 3, width, height * 2 / 3);
                vLine1 = new Line(width * 1 / 3, 0, width * 1 / 3, height);
                vLine2 = new Line(width * 2 / 3, 0, width * 2 / 3, height);
                pane.getChildren().addAll(hLine1, hLine2, vLine1, vLine2);


            }
        };


        primaryStage.widthProperty().addListener(widthListener);
        primaryStage.heightProperty().addListener(heightListener);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Grid");
        primaryStage.show();


    }
}
