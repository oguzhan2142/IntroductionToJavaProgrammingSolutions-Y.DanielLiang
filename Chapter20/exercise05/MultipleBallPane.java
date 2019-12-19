package exercise05;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.Node;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

public class MultipleBallPane extends Pane {

    private Timeline animation;

    public MultipleBallPane() {

        animation = new Timeline(new KeyFrame(Duration.millis(50), e -> {
            moveBall();
            collisionDetection();
        }));
        animation.setCycleCount(Timeline.INDEFINITE);
        animation.play();

    }

    public void collisionDetection() {

        for (int i = 0; i < getChildren().size() - 1; i++) {
            Ball ball1 = (Ball) getChildren().get(i);
            for (int j = i + 1; j < getChildren().size(); j++) {
                Ball ball2 = (Ball) getChildren().get(j);

                if (ball1.getBoundsInParent().intersects(ball2.getBoundsInParent())) {
                    ball1.setRadius(ball1.getRadius() + ball2.getRadius());
                    getChildren().remove(ball2);
                }

            }
        }

    }


    public void add() {

        Color color = new Color(Math.random(), Math.random(), Math.random(), 0.5);
        getChildren().add(new Ball(30, 30, 20, color));
    }

    public void subtract() {

        if (getChildren().size() > 0) {
            getChildren().remove(getChildren().size() - 1);
        }

    }

    public void play() {
        animation.play();
    }

    public void pause() {

        animation.stop();
    }


    public void increaseSpeed() {
        animation.setRate(animation.getRate() + 0.1);
    }

    public void decreaseSpeed() {
        animation.setRate(animation.getRate() > 0 ? animation.getRate() - 0.1 : 0);
    }


    public DoubleProperty rateProperty() {
        return animation.rateProperty();
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

    class Ball extends Circle {

        private double dx = 1, dy = 1;


        Ball(double x, double y, double radius, Color color) {
            super(x, y, radius);
            setFill(color);
        }
    }

}
