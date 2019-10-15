package exercise05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAraundCircle extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        final double WIDTH = 400;
        final double HEIGHT = 400;
        GridPane pane = new GridPane();

        char[] text = "WELCOMETOJAVA".toCharArray();

        Text[] letter = new Text[text.length];

        double xPos = 0, yPos = HEIGHT, rotation = 0;


        int rowIndex = 0;
        int columnIndex = 16;


        for (int i = 0; i < text.length; i++) {

            letter[i] = new Text(xPos, yPos, text[i] + "");
            letter[i].setFont(new Font("Tahoma", 25));
            letter[i].setRotate(0);
            GridPane.setConstraints(letter[i], rowIndex, columnIndex);

            if (i < 3) {

                rowIndex += 4;
                columnIndex -= 4;

            } else if (i >= 3 && i < 6) {
                rowIndex += 4;
                columnIndex += 4;
            } else if (i >= 6 && i < 10) {
                rowIndex -= 4;
                columnIndex += 4;

            } else if (i >= 10 && i < 14) {
                rowIndex -= 4;
                columnIndex -= 4;
            }


            pane.getChildren().add(letter[i]);
            rotation += 5;
            xPos += 20;
            yPos -= 50;
        }


        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Characters Around Circle");
        primaryStage.show();

    }
}
