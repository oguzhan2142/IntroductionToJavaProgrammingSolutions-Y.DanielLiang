package exercise09;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class DrawLInesUsingArrowKeys extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Line line = new Line(200, 200, 200, 200);
        pane.getChildren().add(line);

        double endX = line.getEndX(), endY = line.getEndY();

        pane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                if (event.getCode() == KeyCode.UP) {
                    Line temp = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY() - 30);
                    line.setStartX(temp.getEndX());
                    line.setStartY(temp.getEndY());
                    line.setEndX(temp.getEndX());
                    line.setEndY(temp.getEndY());
                    pane.getChildren().add(temp);


                }
                if (event.getCode() == KeyCode.DOWN) {
                    Line temp = new Line(line.getStartX(), line.getStartY(), line.getEndX(), line.getEndY() + 30);
                    line.setStartX(temp.getEndX());
                    line.setStartY(temp.getEndY());
                    line.setEndX(temp.getEndX());
                    line.setEndY(temp.getEndY());
                    pane.getChildren().add(temp);

                }

                if (event.getCode() == KeyCode.RIGHT) {
                    Line temp = new Line(line.getEndX(), line.getEndY(), line.getEndX() + 30, line.getEndY());
                    line.setStartX(temp.getEndX());
                    line.setStartY(temp.getEndY());
                    line.setEndX(temp.getEndX());
                    line.setEndY(temp.getEndY());
                    pane.getChildren().add(temp);

                }
                if (event.getCode() == KeyCode.LEFT) {
                    Line temp = new Line(line.getStartX(), line.getStartY(), line.getEndX() - 30, line.getEndY());
                    line.setStartX(temp.getEndX());
                    line.setStartY(temp.getEndY());
                    line.setEndX(temp.getEndX());
                    line.setEndY(temp.getEndY());
                    pane.getChildren().add(temp);

                }


            }
        });


        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Draw Line");
        primaryStage.show();

        pane.requestFocus();

    }
}
