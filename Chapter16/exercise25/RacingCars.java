package exercise25;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.sql.Time;

public class RacingCars extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final double roadWidth = 900;
        final double roadHeight = 100;

        Pane pane = new Pane();
        VBox mainPane = new VBox();
        Rectangle road1 = new Rectangle(0, 0, roadWidth, roadHeight);
        Rectangle road2 = new Rectangle(0, roadHeight, roadWidth, roadHeight);
        Rectangle road3 = new Rectangle(0, 2 * roadHeight, roadWidth, roadHeight);
        Rectangle road4 = new Rectangle(0, 3 * roadHeight, roadWidth, roadHeight);


        Car car1 = new Car(road1.getX(),road1.getY(),Color.GREEN);
        Car car2 = new Car(road2.getX(),road2.getY(),Color.GREY);
        Car car3 = new Car(road3.getX(),road3.getY(),Color.BLUE);
        Car car4 = new Car(road4.getX(),road4.getY(),Color.RED);



        road1.setStroke(Color.BLACK);
        road1.setFill(Color.WHITE);
        road2.setStroke(Color.BLACK);
        road2.setFill(Color.WHITE);
        road3.setStroke(Color.BLACK);
        road3.setFill(Color.WHITE);
        road4.setStroke(Color.BLACK);
        road4.setFill(Color.WHITE);

        pane.getChildren().addAll(road1,road2,road3,road4,car1,car2,car3,car4);
        Label label1 = new Label("Car 1:");
        Label label2 = new Label("Car 2:");
        Label label3 = new Label("Car 3:");
        Label label4 = new Label("Car 4:");
        TextField textField1 = new TextField("10");
        TextField textField2 = new TextField("10");
        TextField textField3 = new TextField("10");
        TextField textField4 = new TextField("10");
        Timeline timeline = new Timeline(new KeyFrame(Duration.millis(1000), event -> {

            car1.setLayoutX(car1.getLayoutX() + Double.parseDouble(textField1.getText()));
            car2.setLayoutX(car2.getLayoutX() + Double.parseDouble(textField2.getText()));
            car3.setLayoutX(car3.getLayoutX() + Double.parseDouble(textField3.getText()));
            car4.setLayoutX(car4.getLayoutX() + Double.parseDouble(textField4.getText()));

        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        car1.layoutXProperty().addListener(observable -> {
            if (car1.getLayoutX() > roadWidth)
                timeline.stop();
        });

        car2.layoutXProperty().addListener(observable -> {
            if (car2.getLayoutX() > roadWidth)
                timeline.stop();
        });

        car3.layoutXProperty().addListener(observable -> {
            if (car3.getLayoutX() > roadWidth)
                timeline.stop();
        });

        car4.layoutXProperty().addListener(observable -> {
            if (car4.getLayoutX() > roadWidth)
                timeline.stop();
        });

        HBox topPane = new HBox(10,label1, textField1, label2, textField2, label3, textField3, label4, textField4);
        mainPane.getChildren().addAll(topPane, pane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Racing Cars");
        primaryStage.show();
    }

    class Car extends Pane {

        private Polygon polygon;
        private Circle wheel1;
        private Circle wheel2;


        public Car(double x , double y,Color c) {

            setPosition(x,y);
            polygon = new Polygon(new double[]{
                    0, 30,
                    30, 30,
                    60, 0,
                    90, 0,
                    120, 30,
                    150, 30,
                    150, 60,
                    0, 60,


            });
            polygon.setStroke(Color.BLACK);
            polygon.setFill(c);
            wheel1 = new Circle(30, 60 + 20, 20);
            wheel2 = new Circle(120, 60 + 20, 20);
            getChildren().addAll(polygon, wheel1, wheel2);
        }


        public void setPosition(double x, double y) {
            setLayoutX(x);
            setLayoutY(y);
        }

    }
}
