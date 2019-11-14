package exercise30;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PatternRecognitionConsecutiveFourEqualNumbers extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setVgap(2);
        gridPane.setHgap(2);
        BorderPane mainPane = new BorderPane();
        mainPane.setPadding(new Insets(10, 40, 10, 40));
        Text header = new Text("A consecutive four");
        Button button = new Button("Solve");


        TextField[][] textField = new TextField[6][7];

        for (int i = 0; i < textField.length; i++) {
            for (int j = 0; j < textField[0].length; j++) {

                int randomNum = (int) (Math.random() * 9);
                textField[i][j] = new TextField(randomNum + "");
                textField[i][j].setStyle("-fx-border-color:Black;");
                textField[i][j].setAlignment(Pos.CENTER);
                textField[i][j].setPrefSize(50, 50);
                gridPane.add(textField[i][j], j, i);


            }
        }


        button.setOnAction(event -> {

            checkSolution(textField);

        });


        mainPane.setBottom(button);
        mainPane.setTop(header);
        mainPane.setAlignment(button, Pos.CENTER);
        mainPane.setAlignment(header, Pos.CENTER);
        mainPane.setCenter(gridPane);

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("A Consecutive Four");
        primaryStage.show();
    }

    private void checkSolution(TextField[][] textField) {
        checkOpposite(textField);
        checkColumn(textField);
        checkRow(textField);


    }

    private void checkColumn(TextField[][] textFields) {

        for (int i = 0; i < textFields.length - 3; i++) {
            for (int j = 0; j < textFields[0].length; j++) {

                String s1 = textFields[i][j].getText();
                String s2 = textFields[i + 1][j].getText();
                String s3 = textFields[i + 2][j].getText();
                String s4 = textFields[i + 3][j].getText();

                if (s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
                    textFields[i][j].setStyle("-fx-background-color:Yellow");
                    textFields[i + 1][j].setStyle("-fx-background-color:Yellow");
                    textFields[i + 2][j].setStyle("-fx-background-color:Yellow");
                    textFields[i + 3][j].setStyle("-fx-background-color:Yellow");

                }
            }
        }

    }

    private void checkOpposite(TextField[][] textFields) {

        for (int i = 0; i < textFields.length - 3; i++) {
            for (int j = 0; j < textFields[0].length - 3; j++) {

                String s1 = textFields[i][j].getText();
                String s2 = textFields[i + 1][j + 1].getText();
                String s3 = textFields[i + 2][j + 2].getText();
                String s4 = textFields[i + 3][j + 3].getText();
                if (s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
                    textFields[i][j].setStyle("-fx-background-color:Yellow");
                    textFields[i + 1][j + 1].setStyle("-fx-background-color:Yellow");
                    textFields[i + 2][j + 2].setStyle("-fx-background-color:Yellow");
                    textFields[i + 3][j + 3].setStyle("-fx-background-color:Yellow");

                }

            }
        }

        for (int i = 0; i < textFields.length - 3; i++) {
            for (int j = 0; j < textFields[0].length - 3; j++) {

                String s1 = textFields[i][j + 3].getText();
                String s2 = textFields[i + 1][j + 2].getText();
                String s3 = textFields[i + 2][j + 1].getText();
                String s4 = textFields[i + 3][j].getText();
                if (s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
                    textFields[i][j + 3].setStyle("-fx-background-color:Yellow");
                    textFields[i + 1][j + 2].setStyle("-fx-background-color:Yellow");
                    textFields[i + 2][j + 1].setStyle("-fx-background-color:Yellow");
                    textFields[i + 3][j].setStyle("-fx-background-color:Yellow");

                }

            }
        }
    }

    private void checkRow(TextField[][] textFields) {

        for (int i = 0; i < textFields.length; i++) {

            for (int j = 0; j < textFields[0].length - 3; j++) {


                String s1 = textFields[i][j].getText();
                String s2 = textFields[i][j + 1].getText();
                String s3 = textFields[i][j + 2].getText();
                String s4 = textFields[i][j + 3].getText();
                if (s1.equals(s2) && s1.equals(s3) && s1.equals(s4)) {
                    textFields[i][j].setStyle("-fx-background-color:Yellow");
                    textFields[i][j + 1].setStyle("-fx-background-color:Yellow");
                    textFields[i][j + 2].setStyle("-fx-background-color:Yellow");
                    textFields[i][j + 3].setStyle("-fx-background-color:Yellow");

                }

            }

        }


    }
}
