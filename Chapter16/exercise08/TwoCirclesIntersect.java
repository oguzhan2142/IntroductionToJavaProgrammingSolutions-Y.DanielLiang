package exercise08;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TwoCirclesIntersect extends Application {
    public static boolean isIntersect(Circle c1, Circle c2) {


        return c1.intersects(c2.getBoundsInLocal()) || c2.intersects(c1.getBoundsInLocal());


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox mainPane = new VBox();
        HBox infosPane = new HBox();
        mainPane.setAlignment(Pos.CENTER);
        infosPane.setAlignment(Pos.CENTER);
        infosPane.setSpacing(20);
        InfoPane circle1Info = new InfoPane("Circle 1", 52, 60, 30);
        InfoPane circle2Info = new InfoPane("Circle 2", 180, 56, 40);
        Pane circlesPane = new Pane();
        circlesPane.setPrefSize(400, 200);
        infosPane.getChildren().addAll(circle1Info, circle2Info);

        Circle circle1 = new Circle(circle1Info.getCenterX(), circle1Info.getCenterY(), circle1Info.getRadius());
        circle1.setFill(Color.WHITE);
        circle1.setStroke(Color.BLACK);
        Circle circle2 = new Circle(circle2Info.getCenterX(), circle2Info.getCenterY(), circle2Info.getRadius());
        circle2.setFill(Color.WHITE);
        circle2.setStroke(Color.BLACK);
        Button redrawBtn = new Button("Redraw Circles");
        Text text = new Text("Two circles intersect? No");
        text.setTextAlignment(TextAlignment.CENTER);

        circle1.setOnMouseDragged(event -> {

            circle1.setCenterX(event.getX());
            circle1.setCenterY(event.getY());
            if (isIntersect(circle1, circle2)) {
                text.setText("Two circles intersect? Yes");
            }else {
                text.setText("Two circles intersect? No");
            }

        });

        circle2.setOnMouseDragged(event -> {
            circle2.setCenterX(event.getX());
            circle2.setCenterY(event.getY());
            if (isIntersect(circle1, circle2)) {
                text.setText("Two circles intersect? Yes");
            }else {
                text.setText("Two circles intersect? No");
            }


        });


        circle1.centerXProperty().addListener((observable, oldValue, newValue) -> {

            circle1Info.setCenterX(newValue.doubleValue());
            circle1Info.getxField().setText(circle1Info.getCenterX() + "");

        });
        circle1.centerYProperty().addListener((observable, oldValue, newValue) -> {

            circle1Info.setCenterY(newValue.doubleValue());
            circle1Info.getyField().setText(circle1Info.getCenterY() + "");

        });
        circle1.radiusProperty().addListener((observable, oldValue, newValue) -> {

            circle1Info.setRadius(newValue.doubleValue());
            circle1Info.getRadiusField().setText(circle1Info.getRadius() + "");

        });


        circle2.centerXProperty().addListener((observable, oldValue, newValue) -> {

            circle2Info.setCenterX(newValue.doubleValue());
            circle2Info.getxField().setText(circle2Info.getCenterX() + "");

        });
        circle2.centerYProperty().addListener((observable, oldValue, newValue) -> {

            circle2Info.setCenterY(newValue.doubleValue());
            circle2Info.getyField().setText(circle2Info.getCenterY() + "");

        });
        circle2.radiusProperty().addListener((observable, oldValue, newValue) -> {

            circle2Info.setRadius(newValue.doubleValue());
            circle2Info.getRadiusField().setText(circle2Info.getRadius() + "");

        });

        redrawBtn.setOnMouseClicked(event -> {

            circle1.setCenterX(Double.parseDouble(circle1Info.getxField().getText()));
            circle1.setCenterX(Double.parseDouble(circle1Info.getxField().getText()));
            circle1.setRadius(Double.parseDouble(circle1Info.getRadiusField().getText()));

            circle2.setCenterX(Double.parseDouble(circle2Info.getxField().getText()));
            circle2.setCenterY(Double.parseDouble(circle2Info.getyField().getText()));
            circle2.setRadius(Double.parseDouble(circle2Info.getRadiusField().getText()));

        });




        circlesPane.getChildren().addAll(circle1, circle2);
        mainPane.getChildren().addAll(text, circlesPane, infosPane, redrawBtn);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Intersect Circles");
        primaryStage.show();
    }

    class InfoPane extends GridPane {

        private String name;
        private Label info;
        private double centerX;
        private double centerY;
        private double radius;
        private Label xLabel;
        private Label yLabel;
        private Label radiusLabel;
        private TextField xField;
        private TextField yField;
        private TextField radiusField;

        public InfoPane(String name, double centerX, double centerY, double radius) {
            this.name = name;
            this.centerX = centerX;
            this.centerY = centerY;
            this.radius = radius;

            info = new Label("Enter " + name + " info:");
            xLabel = new Label("Center X:");
            xField = new TextField();
            xField.setPrefColumnCount(4);
            xField.setText(centerX + "");
            yLabel = new Label("Center Y:");
            yField = new TextField();
            yField.setText(centerY + "");
            yField.setPrefColumnCount(4);
            radiusLabel = new Label("Radius:");
            radiusField = new TextField();
            radiusField.setPrefColumnCount(4);
            radiusField.setText(radius + "");

            setStyle("-fx-border-color:Black");
            setVgap(6);
            setHgap(6);
            GridPane.setConstraints(info, 0, 0, 2, 1, HPos.CENTER, VPos.CENTER);
            GridPane.setConstraints(xLabel, 0, 1);
            GridPane.setConstraints(xField, 1, 1);
            GridPane.setConstraints(yLabel, 0, 2);
            GridPane.setConstraints(yField, 1, 2);
            GridPane.setConstraints(radiusLabel, 0, 3);
            GridPane.setConstraints(radiusField, 1, 3);

            getChildren().addAll(info, xLabel, xField, yLabel, yField, radiusLabel, radiusField);


        }

        public double getCenterX() {
            return centerX;
        }

        public void setCenterX(double centerX) {
            this.centerX = centerX;
        }

        public double getCenterY() {
            return centerY;
        }

        public void setCenterY(double centerY) {
            this.centerY = centerY;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public TextField getxField() {
            return xField;
        }

        public void setxField(TextField xField) {
            this.xField = xField;
        }

        public TextField getyField() {
            return yField;
        }

        public void setyField(TextField yField) {
            this.yField = yField;
        }

        public TextField getRadiusField() {
            return radiusField;
        }

        public void setRadiusField(TextField radiusField) {
            this.radiusField = radiusField;
        }
    }
}
