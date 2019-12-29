package exercise17;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class The24PointCardGame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        mainPane.setPadding(new Insets(40,40,40,40));
        HBox numbersPane = new HBox(20);
        numbersPane.setAlignment(Pos.CENTER);
        TextField resultField = new TextField();
        resultField.setPrefColumnCount(20);
        Button solveBtn = new Button("Solve");

        TextField[] numberFields = new TextField[4];
        for (int i = 0; i < numberFields.length; i++) {
            numberFields[i] = new TextField();
            numberFields[i].setPrefSize(100 , 100);
            numberFields[i].setAlignment(Pos.CENTER);
            numbersPane.getChildren().add(numberFields[i]);
        }

        solveBtn.setOnAction(event -> {


            int[] numbers = new int[4];

            for (int i = 0; i < numberFields.length; i++) {

                numbers[i] = Integer.parseInt(numberFields[i].getText());

                resultField.setText(findExpression(numbers));

            }





        });


        HBox topPane = new HBox(resultField,solveBtn);
        topPane.setAlignment(Pos.CENTER);
        mainPane.setTop(topPane);
        mainPane.setCenter(numbersPane);
        primaryStage.setTitle("Game");
        primaryStage.setScene(new Scene(mainPane, 500, 400));
        primaryStage.show();
    }

    private String findExpression(int[] numbers) {

        String expression = "";

        







        return "null";
    }
}
