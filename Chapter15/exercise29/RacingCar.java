package exercise29;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;

public class RacingCar extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Car car = new Car();
        car.setLayoutY(300 - car.getCarHeight());

        pane.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.UP){
                car.setSpeed(car.getSpeed() + 1);

            }
            if (event.getCode() == KeyCode.DOWN){
                car.setSpeed(car.getSpeed() - 1);
            }

        });

        pane.getChildren().add(car);
        primaryStage.setScene(new Scene(pane, 800, 300));
        primaryStage.setTitle("Car Racing");
        primaryStage.show();
        pane.requestFocus();
    }


}


class Car extends Pane {


    private double carWidth = 40;
    private double carHeight = 30;
    private Polygon carBody;
    private Circle frontWheel;
    private Circle rearWheel;
    private Timeline timeline;
    private double speed = 2;

    public Car() {

        frontWheel = new Circle(carWidth + 15, carHeight - 6, 6);
        rearWheel = new Circle(carWidth - 15, carHeight - 6, 6);
        carBody = new Polygon();
        carBody.setStroke(Color.BLACK);
        carBody.setFill(Color.WHITE);
        carBody.getPoints().addAll(new Double[]{
                carWidth - 25, carHeight - 10,
                carWidth - 25, carHeight - 20,
                carWidth - 15, carHeight - 20,
                carWidth - 5, 0.0,
                carWidth + 5, 0.0,
                carWidth + 15, carHeight - 20,
                carWidth + 25, carHeight - 20,
                carWidth + 25, carHeight - 10,
                carWidth - 25, carHeight - 10,


        });

        getChildren().addAll(carBody, frontWheel, rearWheel);
        timeline = new Timeline(new KeyFrame(Duration.millis(15), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                setLayoutX(getLayoutX() + speed);
            }
        }));

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void startSpecificPositionX(double positionX){

        setLayoutX(positionX);

    }

    public Timeline getTimeline() {
        return timeline;
    }

    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    public double getCarHeight() {
        return carHeight;
    }
}