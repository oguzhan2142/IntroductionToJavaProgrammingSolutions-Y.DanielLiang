package exercise10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DisplayACylinder extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        final double WIDTH = 300;
        final double HEIGHT = 300;
        final double CYLINDER_HEIGHT = 180;
        final double CYLINDER_RADIUS = 80;

        Pane stackPane = new Pane();

        Ellipse ellipse = new Ellipse(WIDTH / 2, HEIGHT / 4, CYLINDER_RADIUS, 30);
        ellipse.setFill(Color.WHITE);
        ellipse.setStroke(Color.BLACK);

        double line1Start = ellipse.getCenterX() - ellipse.getRadiusX();
        double line2Start = ellipse.getCenterX() + ellipse.getRadiusX();

        Line line1 = new Line(line1Start, ellipse.getCenterY(), line1Start, ellipse.getRadiusY() + CYLINDER_HEIGHT);
        Line line2 = new Line(line2Start, ellipse.getCenterY(), line2Start, ellipse.getRadiusY() + CYLINDER_HEIGHT);


        Arc arc = new Arc(ellipse.getCenterX(), CYLINDER_HEIGHT + ellipse.getRadiusY() , ellipse.getRadiusX(), 30, 180, 180);
        arc.setType(ArcType.OPEN);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);


        Arc dashedArc = new Arc(ellipse.getCenterX(), CYLINDER_HEIGHT + ellipse.getRadiusY(), ellipse.getRadiusX(), 30, 0, 180);

        dashedArc.setType(ArcType.OPEN);
        dashedArc.setFill(Color.WHITE);
        dashedArc.setStroke(Color.BLACK);

        dashedArc.getStrokeDashArray().addAll(10.0, 21.0);


        stackPane.getChildren().addAll(ellipse, line1, line2,arc, dashedArc);
        Scene scene = new Scene(stackPane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Cylinder");
        primaryStage.show();

    }
}
