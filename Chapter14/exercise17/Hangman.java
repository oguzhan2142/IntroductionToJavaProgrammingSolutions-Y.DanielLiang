package exercise17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Hangman extends Application {

    double width = 400;
    double height = 600;

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();
        double radiusOfHead = 30;
        double lenghtOfBody = 120;
        double lengtOfArm = 30;
        double lengthOfLeg = 40;

        Arc arc = new Arc(100,height - 50,50,20,0,180);
        arc.setStroke(Color.BLACK);
        arc.setFill(Color.WHITE);
        arc.setType(ArcType.OPEN);
        Line verticalStick = new Line(100,height - 50 - arc.getRadiusY(),100,100);
        Line horizontalStick = new Line(100,verticalStick.getEndY(),250,verticalStick.getEndY());
        Line shortVerticalSttick = new Line(horizontalStick.getEndX(),horizontalStick.getEndY(),horizontalStick.getEndX(),horizontalStick.getEndY() + 80);
        Circle head = new Circle(shortVerticalSttick.getEndX(),shortVerticalSttick.getEndY() + radiusOfHead,radiusOfHead);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);

        double startXLefttArm = head.getCenterX() + radiusOfHead * Math.cos(4 * Math.PI / 3 );
        double startYLefttArm = head.getCenterY() - radiusOfHead * Math.sin(4 * Math.PI / 3 );
        Line leftArm = new Line(startXLefttArm,startYLefttArm,startXLefttArm - lengtOfArm , startYLefttArm + lengtOfArm );


        double startXRightArm = head.getCenterX() + radiusOfHead * Math.cos(-Math.PI / 3 );
        double startYRightArm = head.getCenterY() - radiusOfHead * Math.sin(-Math.PI / 3 );
        Line rightArm = new Line(startXRightArm, startYRightArm, startXRightArm + lengtOfArm , startYRightArm + lengtOfArm);
        Line body = new Line(head.getCenterX(),head.getCenterY() + radiusOfHead, head.getCenterX() ,head.getCenterY() + lenghtOfBody  );


        Line leftLeg = new Line(body.getEndX(),body.getEndY(),body.getEndX() - lengthOfLeg , body.getEndY() + lengthOfLeg);


        Line rightLeg = new Line(body.getEndX(),body.getEndY(),body.getEndX() + lengthOfLeg , body.getEndY() + lengthOfLeg);







        pane.getChildren().addAll(arc,verticalStick,horizontalStick,shortVerticalSttick,head,leftArm,rightArm,body,leftLeg,rightLeg);
        Scene scene = new Scene(pane,width,height);
        primaryStage.setTitle("hangman");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
