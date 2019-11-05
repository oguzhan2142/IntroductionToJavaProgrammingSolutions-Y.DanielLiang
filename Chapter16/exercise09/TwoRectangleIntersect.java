package exercise09;

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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class TwoRectangleIntersect extends Application {
    public static boolean isIntersect(Rectangle r1, Rectangle r2) {

        return r1.intersects(r2.getBoundsInLocal()) || r2.intersects(r1.getBoundsInLocal());

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox mainPane = new VBox();
        HBox infosPane = new HBox();
        mainPane.setAlignment(Pos.CENTER);
        infosPane.setAlignment(Pos.CENTER);
        infosPane.setSpacing(20);
        InfoPane rectangle1Info = new InfoPane("Rectangle 1", 20 , 20, 100, 50);
        InfoPane rectangle2Info = new InfoPane("Rectangle 2", 180 , 100, 200, 40);
        Pane circlesPane = new Pane();
        circlesPane.setPrefSize(400, 200);
        infosPane.getChildren().addAll(rectangle1Info, rectangle2Info);

        Rectangle r1 = new Rectangle(rectangle1Info.getCenterX() , rectangle1Info.getCenterY() , rectangle1Info.getrWidth() , rectangle1Info.getrHeight());
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);
        Rectangle r2 = new Rectangle(rectangle2Info.getCenterX() , rectangle2Info.getCenterY() , rectangle2Info.getrWidth() , rectangle2Info.getrHeight());
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.BLACK);
        Button redrawBtn = new Button("Redraw Rectangles");
        Text text = new Text("Two rectangles intersect? No");
        text.setTextAlignment(TextAlignment.CENTER);

        r1.setOnMouseDragged(event -> {

            r1.setX(event.getX());
            r1.setY(event.getY());
            if (isIntersect(r1, r2)) {
                text.setText("Two rectangles intersect? Yes");
            }else {
                text.setText("Two rectangles intersect? No");
            }

        });

        r2.setOnMouseDragged(event -> {
            r2.setX(event.getX());
            r2.setY(event.getY());
            if (isIntersect(r1, r2)) {
                text.setText("Two rectangles intersect? Yes");
            }else {
                text.setText("Two rectangles intersect? No");
            }


        });


        r1.xProperty().addListener((observable, oldValue, newValue) -> {

            rectangle1Info.setCenterX(newValue.doubleValue());
            rectangle1Info.getxField().setText(rectangle1Info.getCenterX() + "");

        });
        r1.yProperty().addListener((observable, oldValue, newValue) -> {

            rectangle1Info.setCenterY(newValue.doubleValue());
            rectangle1Info.getyField().setText(rectangle1Info.getCenterY() + "");

        });
        r1.widthProperty().addListener((observable, oldValue, newValue) -> {

            rectangle1Info.setrWidth(newValue.doubleValue());
            rectangle1Info.getwField().setText(rectangle1Info.getrWidth() + "");

        });

        r1.heightProperty().addListener((observable, oldValue, newValue) -> {

            rectangle1Info.setrHeight(newValue.doubleValue());
            rectangle1Info.gethField().setText(rectangle1Info.getrHeight() + "");

        });

        r2.xProperty().addListener((observable, oldValue, newValue) -> {

            rectangle2Info.setCenterX(newValue.doubleValue());
            rectangle2Info.getxField().setText(rectangle2Info.getCenterX() + "");

        });
        r2.yProperty().addListener((observable, oldValue, newValue) -> {

            rectangle2Info.setCenterY(newValue.doubleValue());
            rectangle2Info.getyField().setText(rectangle2Info.getCenterY() + "");

        });
        r2.widthProperty().addListener((observable, oldValue, newValue) -> {

            rectangle2Info.setrWidth(newValue.doubleValue());
            rectangle2Info.getwField().setText(rectangle2Info.getrWidth() + "");

        });

        r2.heightProperty().addListener((observable, oldValue, newValue) -> {

            rectangle2Info.setrHeight(newValue.doubleValue());
            rectangle2Info.gethField().setText(rectangle2Info.getrHeight() + "");

        });

        redrawBtn.setOnMouseClicked(event -> {

            r1.setX(Double.parseDouble(rectangle1Info.getxField().getText()));
            r1.setY(Double.parseDouble(rectangle1Info.getxField().getText()));
            r1.setWidth(Double.parseDouble(rectangle1Info.getwField().getText()));
            r1.setHeight(Double.parseDouble(rectangle1Info.gethField().getText()));

            r2.setX(Double.parseDouble(rectangle2Info.getxField().getText()));
            r2.setY(Double.parseDouble(rectangle2Info.getyField().getText()));
            r2.setWidth(Double.parseDouble(rectangle2Info.getwField().getText()));
            r2.setHeight(Double.parseDouble(rectangle2Info.gethField().getText()));
        });




        circlesPane.getChildren().addAll(r1, r2);
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
        private double rWidth;
        private double rHeight;
        private Label xLabel;
        private Label yLabel;
        private Label wLabel;
        private Label hLabel;
        private TextField xField;
        private TextField yField;
        private TextField wField;
        private TextField hField;


        public InfoPane(String name, double centerX, double centerY, double rWidth , double rHeight) {
            this.name = name;
            this.centerX = centerX;
            this.centerY = centerY;
            this.rWidth = rWidth;
            this.rHeight = rHeight;


            info = new Label("Enter " + name + " info:");
            xLabel = new Label("Center X:");
            xField = new TextField();
            xField.setPrefColumnCount(4);
            xField.setText(centerX + "");
            yLabel = new Label("Center Y:");
            yField = new TextField();
            yField.setText(centerY + "");
            yField.setPrefColumnCount(4);
            wLabel = new Label("WIdth:");
            wField = new TextField();
            wField.setPrefColumnCount(4);
            wField.setText(rWidth + "");
            hLabel = new Label("Height:");
            hField = new TextField();
            hField.setPrefColumnCount(4);
            hField.setText(rHeight + "");

            setStyle("-fx-border-color:Black");
            setVgap(6);
            setHgap(6);
            GridPane.setConstraints(info, 0, 0, 2, 1, HPos.CENTER, VPos.CENTER);
            GridPane.setConstraints(xLabel, 0, 1);
            GridPane.setConstraints(xField, 1, 1);
            GridPane.setConstraints(yLabel, 0, 2);
            GridPane.setConstraints(yField, 1, 2);
            GridPane.setConstraints(wLabel, 0, 3);
            GridPane.setConstraints(wField, 1, 3);
            GridPane.setConstraints(hLabel, 0, 4);
            GridPane.setConstraints(hField, 1, 4);

            getChildren().addAll(info, xLabel, xField, yLabel, yField, wLabel, wField,hLabel,hField);


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

        public double getrWidth() {
            return rWidth;
        }

        public void setrWidth(double rWidth) {
            this.rWidth = rWidth;
        }

        public double getrHeight() {
            return rHeight;
        }

        public void setrHeight(double rHeight) {
            this.rHeight = rHeight;
        }

        public TextField getwField() {
            return wField;
        }

        public void setwField(TextField wField) {
            this.wField = wField;
        }

        public TextField gethField() {
            return hField;
        }

        public void sethField(TextField hField) {
            this.hField = hField;
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




    }
}
