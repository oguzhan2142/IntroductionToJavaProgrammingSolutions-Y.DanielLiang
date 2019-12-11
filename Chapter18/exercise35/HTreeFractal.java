package exercise35;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class HTreeFractal extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        Pane pane = new Pane();
        TextField textField = new TextField();
        pane.setPrefSize(800, 800);

        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                pane.getChildren().clear();
                int order = Integer.parseInt(textField.getText());

                HTree(pane, order);

            }
        });


        HBox controlPane = new HBox(10, new Label("Enter an number"), textField);
        mainPane.setCenter(pane);
        mainPane.setBottom(controlPane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("H-Tree Fractal");
        primaryStage.show();
    }

    private void HTree(Pane p, int order) {

        double size = 300;

        HTree(order, size, p.getPrefWidth() / 2, p.getPrefHeight() / 2, p);
    }

    private void HTree(int order, double size, double centerX, double centerY, Pane p) {

        if (order < 0)
            return;

        HTree tree = new HTree(size);
        tree.setLocation(centerX, centerY);
        p.getChildren().add(tree);


        HTree(order - 1, size / 2, centerX - size / 2, centerY - size / 2, p);
        HTree(order - 1, size / 2, centerX + size / 2, centerY - size / 2, p);
        HTree(order - 1, size / 2, centerX - size / 2, centerY + size / 2, p);
        HTree(order - 1, size / 2, centerX + size / 2, centerY + size / 2, p);
    }


    class HTree extends Pane {

        double size;

        public HTree(double size) {

            this.size = size;
            setPrefSize(size, size);
            Line line = new Line(0, 0, 0, size);
            Line line1 = new Line(size, 0, size, size);
            Line line2 = new Line(0, size / 2, size, size / 2);
            getChildren().addAll(line, line1, line2);


        }

        public void setLocation(double x, double y) {
            setLayoutX(x - size / 2);
            setLayoutY(y - size / 2);
        }

        public Point2D getCenter() {

            double x = getBoundsInParent().getMaxX() / 2;
            double y = getBoundsInParent().getMaxY() / 2;


            return new Point2D(x, y);
        }
    }


}
