package exercise11;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

public class PaintASmileyFace extends Application {


    private static final double HEIGHT = 400;
    private static final double WIDTH = 400;
    private static final double FACE_RADIUS = WIDTH / 2 - 40;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Circle face = new Circle(WIDTH / 2, HEIGHT / 2, FACE_RADIUS);
        face.setFill(Color.WHITE);
        face.setStroke(Color.BLACK);

        Ellipse eye1 = new Ellipse(face.getCenterX() - 60 , face.getCenterY() - 40 ,40,25);
        eye1.setFill(Color.WHITE);
        eye1.setStroke(Color.BLACK);

        Ellipse eye2 = new Ellipse(face.getCenterX() + 60 , face.getCenterY() - 40 ,40,25);
        eye2.setFill(Color.WHITE);
        eye2.setStroke(Color.BLACK);

        Circle puppil1 = new Circle(eye1.getCenterX() , eye1.getCenterY() , 14);
        Circle puppil2 = new Circle(eye2.getCenterX() , eye2.getCenterY() , 14);

        puppil1.setFill(Color.DEEPSKYBLUE);
        puppil2.setFill(Color.DEEPSKYBLUE);





        Polygon nose = new Polygon();
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);
        nose.getPoints().addAll(new Double[]{
                face.getCenterX(),face.getCenterY() - 25,
                face.getCenterX() - 30 , face.getCenterY() + 35,
                face.getCenterX() + 30 , face.getCenterY() + 35
        });

        Arc mouth = new Arc(face.getCenterX(),face.getCenterY() + 60 , 80,30,180,180);
        mouth.setStroke(Color.BLACK);
        mouth.setFill(Color.WHITE);

        pane.getChildren().addAll(face,eye1,eye2,puppil1,puppil2,nose,mouth);

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("Smiley Face");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
