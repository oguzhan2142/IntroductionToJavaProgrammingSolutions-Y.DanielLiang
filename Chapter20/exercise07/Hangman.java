package exercise07;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Hangman extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        HangmanPane hangmanPane = new HangmanPane();


        primaryStage.setScene(new Scene(hangmanPane));
        primaryStage.setTitle("Hangman");
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}


class HangmanPane extends Pane {

    private Node[] parts;
    private TextField answerField;
    private TextField missedField;
    private int wrongAnswer = 0;



    public HangmanPane() {
        setPrefSize(600, 600);

        Arc arc = new Arc(100, 500, 50, 25, 0, 180);
        arc.setFill(Color.WHITE);
        arc.setStroke(Color.BLACK);
        arc.setType(ArcType.OPEN);
        Line lineVertical1 = new Line(arc.getCenterX(), arc.getCenterY() - arc.getRadiusY(), arc.getCenterX(), 100);
        Line lineHorizontal = new Line(lineVertical1.getEndX(), lineVertical1.getEndY(), lineVertical1.getEndX() + 200, lineVertical1.getEndY());
        Line lineVertical2 = new Line(lineHorizontal.getEndX(), lineHorizontal.getEndY(), lineHorizontal.getEndX(), lineHorizontal.getEndY() + 100);
        Circle head = new Circle(lineVertical2.getEndX(), lineVertical2.getEndY() - 20, 20);
        head.setStroke(Color.BLACK);
        head.setFill(Color.WHITE);
        Line rArm = new Line(head.getCenterX() - head.getRadius() * Math.cos(Math.toRadians(120)), head.getCenterY() + head.getRadius() * Math.sin(Math.toRadians(120)), head.getCenterX() + head.getRadius() * Math.cos(Math.toRadians(120)) + 30, head.getCenterY() + head.getRadius() * Math.sin(Math.toRadians(120)) + 30);
        Line lArm = new Line(head.getCenterX() + head.getRadius() * Math.cos(Math.toRadians(240)), head.getCenterY() + head.getRadius() * Math.sin(Math.toRadians(240)), head.getCenterX() + head.getRadius() * Math.cos(Math.toRadians(240)) - 30, head.getCenterY() + head.getRadius() * Math.sin(Math.toRadians(240)) + 30);
        Line body = new Line(head.getCenterX(), head.getCenterY() + head.getRadius(), head.getCenterX(), head.getCenterY() + 120);
        Line lLeg = new Line(body.getEndX(), body.getEndY(), body.getEndX() - 40, body.getEndY() + 50);
        Line rLeg = new Line(body.getEndX(), body.getEndY(), body.getEndX() + 40, body.getEndY() + 50);

        parts = new Node[]{lineVertical2, head, rArm, lArm, body, rLeg, lLeg};


        answerField = new TextField();
        missedField = new TextField();


        HBox hBox = new HBox(10,new Label("Word is :") , answerField);
        HBox hBox2 = new HBox(10,new Label("Missed letters :") , missedField);
        VBox vBox = new VBox(5,hBox , hBox2);
        vBox.setLayoutX(300);
        vBox.setLayoutY(500);


        getChildren().addAll(arc, lineVertical1, lineHorizontal,vBox);
    }


}