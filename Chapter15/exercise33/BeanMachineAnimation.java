package exercise33;

import javafx.animation.KeyFrame;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BeanMachineAnimation extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BeanMachine beanMachine = new BeanMachine();
        Pane pane = new Pane();

        Circle circle = new Circle(250, beanMachine.getTopPoint(), 10);

        beanMachine.startBeanMachine();

        pane.getChildren().addAll(beanMachine, circle);
        primaryStage.setScene(new Scene(pane));
        primaryStage.setTitle("Bean Machine Animation");
        primaryStage.show();
        pane.requestFocus();
    }
}

class BeanMachine extends Pane {


    private Polyline outside;
    private Circle[] point = new Circle[7 * 6];
    private Line[] insideLine = new Line[7];
    private double w = 500, h = 500;
    private double topPoint = h / 10;
    private double bottomPoint = h / 5 * 4 + 50;
    private int balls = 10;

    public BeanMachine() {
        setPrefSize(w, h);
        outside = new Polyline();
        outside.getPoints().addAll(new Double[]{
                w / 2 - 20, h / 10,
                w / 2 - 20, h / 10 * 2,
                w / 2 - 150, h / 5 * 4,
                w / 2 - 150, h / 5 * 4 + 50,
                w / 2 + 150, h / 5 * 4 + 50,
                w / 2 + 150, h / 5 * 4,
                w / 2 + 20, h / 10 * 2,
                w / 2 + 20, h / 10,
        });

        for (int i = 0; i < insideLine.length; i++) {

            insideLine[i] = new Line(w / 2 - 150 + (300 / 8) * (i + 1), h / 5 * 4, w / 2 - 150 + (300 / 8) * (i + 1), h / 5 * 4 + 50);
            getChildren().add(insideLine[i]);
        }
        double startPosX = insideLine[0].getStartX();
        double endPosY = insideLine[0].getStartY();


        int index = 0;
        for (int j = 7; j >= 1; j--) {

            for (int i = 1; i <= j; i++) {

                point[index] = new Circle(startPosX, endPosY, 10);
                getChildren().add(point[index++]);
                startPosX += (300 / 8);


            }

            startPosX = insideLine[0].getStartX();
            startPosX += (300 / 8) * (8 - j) / 2;
            endPosY -= 45;
        }

        getChildren().addAll(outside);
    }


    public boolean isCrushWithPoints(Circle c) {

        for (int i = 0; i < point.length; i++) {

            if (c.intersects(point[i].getBoundsInLocal()))
                return true;

        }

        return false;

    }

    public void startBeanMachine() {
        KeyFrame kf = new KeyFrame(Duration.millis(3000), e -> dropBall());
        Timeline tl = new Timeline(kf);
        tl.setCycleCount(balls);
        tl.play();
    }

    private void dropBall() {
        Polyline poly = generatePolylinePath();
        Circle circle = new Circle(10);
        circle.setFill(Color.ORANGE);

        getChildren().addAll(circle);

        PathTransition pt = new PathTransition(Duration.millis(3000), poly, circle);
        pt.setCycleCount(balls);
        pt.play();

    }

    private Polyline generatePolylinePath() {

        Polyline polyline = new Polyline(new double[]{
                w / 2, getTopPoint(),
                2 / 2, getBottomPoint()

        });

        return polyline;
    }

    public double getTopPoint() {
        return topPoint;
    }

    public double getBottomPoint() {
        return bottomPoint;
    }
}



