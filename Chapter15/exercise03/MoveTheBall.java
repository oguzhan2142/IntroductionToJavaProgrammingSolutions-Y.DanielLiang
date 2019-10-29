package exercise03;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveTheBall extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        ballPane ballPane = new ballPane();


        primaryStage.setScene(new Scene(ballPane));
        primaryStage.setTitle("move the ball");
        primaryStage.show();

    }
}

class ballPane extends VBox {

    final double WIDTH = 600;
    final double HEIGHT = 600;
    final double ballRadius = 25;


    Circle ball = new Circle(WIDTH / 2, HEIGHT / 2, ballRadius);

    Button up = new Button("Up");
    Button down = new Button("down");
    Button left = new Button("left");
    Button right = new Button("right");


    public ballPane() {

        ball.setFill(Color.WHITE);
        ball.setStroke(Color.BLACK);

        Pane ballPane = new Pane();
        ballPane.getChildren().add(ball);
        ballPane.setPrefHeight(HEIGHT);
        ballPane.setPrefWidth(WIDTH);
        HBox buttonPane = new HBox();
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(10);

        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (event.getSource() == up) {

                    if (isBoundaryOk()) {
                        ball.setCenterY(ball.getCenterY() - 10);
                        ballPane.getChildren().clear();
                        ballPane.getChildren().add(ball);
                    }

                }
                if (event.getSource() == down) {
                    if (isBoundaryOk()) {
                        ball.setCenterY(ball.getCenterY() + 10);
                        ballPane.getChildren().clear();
                        ballPane.getChildren().add(ball);
                    }

                }
                if (event.getSource() == left) {
                    if (isBoundaryOk()) {
                        ball.setCenterX(ball.getCenterX() - 10);
                        ballPane.getChildren().clear();
                        ballPane.getChildren().add(ball);
                    }

                }
                if (event.getSource() == right) {
                    if (isBoundaryOk()) {
                        ball.setCenterX(ball.getCenterX() + 10);
                        ballPane.getChildren().clear();
                        ballPane.getChildren().add(ball);
                    }

                }


            }
        };
        up.setOnAction(handler);
        down.setOnAction(handler);
        left.setOnAction(handler);
        right.setOnAction(handler);

        getChildren().addAll(ballPane, buttonPane);
        buttonPane.getChildren().addAll(up, down, left, right);


    }

    private boolean isBoundaryOk() {

        return ball.getCenterX() <= WIDTH && ball.getCenterX() >= 0 && ball.getCenterY() <= HEIGHT && ball.getCenterY() >= 0;


    }

}