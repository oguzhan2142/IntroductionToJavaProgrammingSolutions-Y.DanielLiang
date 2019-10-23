package exercise12;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class DisplayABarChart extends Application {

        final static int height = 400;
        final static int width = 550;

    @Override
    public void start(Stage primaryStage) throws Exception {


        HBox mainPane = new HBox();
        mainPane.setAlignment(Pos.BOTTOM_CENTER);
        mainPane.setSpacing(30);


        Pane projectPane = getRectanglePane("project", height * 0.2, Color.RED);
        Pane quizPane = getRectanglePane("quiz", height * 0.1, Color.BLUE);
        Pane midtermPane = getRectanglePane("midterm", height * 0.3, Color.GREEN);
        Pane finalPane = getRectanglePane("final", height * 0.4, Color.ORANGE);


        mainPane.getChildren().addAll(projectPane, quizPane, midtermPane, finalPane);
        Scene scene = new Scene(mainPane, width, height);
        primaryStage.setTitle("Bar Chart");
        primaryStage.setResizable(false);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static Pane getRectanglePane(String name, double persantage, Color color) {

        Label nameLabel = new Label(name + "--" + (int) (persantage  / height * 100 ) + "%");
        Rectangle rectangle = new Rectangle(100, persantage, color);


        Pane pane = new Pane();

        rectangle.setY(height - persantage);
        nameLabel.layoutYProperty().setValue(height - rectangle.getHeight() - 20);
        pane.getChildren().addAll(rectangle, nameLabel);


        return pane;
    }


}
