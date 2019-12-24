package exercise09;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Iterator;

public class RemoveTheLargestBallFirst extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        MultipleBallPane ballPane = new MultipleBallPane();

        ballPane.setOnMousePressed(e -> ballPane.pause());
        ballPane.setOnMouseReleased(e -> ballPane.play());
        BorderPane borderPane = new BorderPane();
        Button btAdd = new Button("Add");
        Button btSubtract = new Button("Subtract");
        btAdd.setOnAction(e -> ballPane.add());
        btSubtract.setOnAction(e -> ballPane.subtract());



        HBox hbox = new HBox(10);


        hbox.getChildren().addAll(btAdd, btSubtract);
        hbox.setAlignment(Pos.CENTER);
        borderPane.setCenter(ballPane);
        borderPane.setBottom(hbox);

        primaryStage.setScene(new Scene(borderPane, 500, 500));
        primaryStage.setTitle("Bouncing ball");
        primaryStage.show();
    }
}


class MultipleBallPane extends Pane {
    private Timeline animation;


    public MultipleBallPane() {

        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> moveBall()));
        animation.setRate(5.0);
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();


    }

    public void add() {

        Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
        int radius = (int)(Math.random() * 18) + 2;
        getChildren().add(new Ball(30, 30, radius, color));
    }

    public void subtract() {

        Iterator<Node> iterator = getChildren().iterator();
        Ball largest = (Ball) iterator.next();

        while (iterator.hasNext()){
            Ball next =(Ball) (iterator.next());
            if(next.getRadius() > largest.getRadius())
                largest = next;
        }

        if (getChildren().size() > 0) {
            getChildren().remove(largest);
        }
    }


    public void play() {
        animation.play();
    }

    public void pause() {
        animation.pause();
    }


    protected void moveBall() {
        for (Node node : this.getChildren()) {
            Ball ball = (Ball) node;
            if (ball.getCenterX() < ball.getRadius() || ball.getCenterX() > getWidth() - ball.getRadius()) {
                ball.dx *= -1;
            }
            if (ball.getCenterY() < ball.getRadius() || ball.getCenterY() > getHeight() - ball.getRadius()) {
                ball.dy *= -1;
            }

            ball.setCenterX(ball.dx + ball.getCenterX());
            ball.setCenterY(ball.dy + ball.getCenterY());

        }
    }
}

class Ball extends Circle {


    public double dx = 1, dy = 1;

    Ball(double x, double y, double radius, Color color) {
        super(x, y, radius);
        setFill(color); // Set ball color
    }


}