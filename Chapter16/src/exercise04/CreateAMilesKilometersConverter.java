package exercise04;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateAMilesKilometersConverter extends Application {

    final double KILOMETER_PER_MILE = 1.60230732;

    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();

        Label mileLabel = new Label("Mile:");
        Label kmLabel = new Label("Kilometer:");

        TextField mText = new TextField();
        TextField kmText = new TextField();

        GridPane.setConstraints(mileLabel, 0, 0);
        GridPane.setConstraints(mText, 1, 0);
        GridPane.setConstraints(kmLabel, 0, 1);
        GridPane.setConstraints(kmText, 1, 1);

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);

        mText.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.ENTER) {

                double num = Double.parseDouble(mText.getText());
                double converted = num * KILOMETER_PER_MILE;
                kmText.setText(Double.toString(converted));


            }

        });
        kmText.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER) {

                double num = Double.parseDouble(kmText.getText());
                double converted = num / KILOMETER_PER_MILE;
                mText.setText(Double.toString(converted));


            }

        });

        gridPane.getChildren().addAll(mileLabel, mText, kmLabel, kmText);
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.setTitle("Converter");
        primaryStage.show();
    }
}
