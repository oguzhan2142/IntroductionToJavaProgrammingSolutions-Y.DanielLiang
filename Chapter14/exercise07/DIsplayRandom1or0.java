package exercise07;

import javafx.application.Application;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DIsplayRandom1or0 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        int random[][] = getRandom1or0();
        GridPane pane = new GridPane();

        TextField [] text = new TextField[100];


        int textfieldIndex = 0;
        for (int i = 0; i < random.length; i++) {
            for (int j = 0; j < random[i].length; j++) {

                text[textfieldIndex] = new TextField();
                text[textfieldIndex].setText(Integer.toString(random[i][j]));
                text[textfieldIndex].setEditable(false);
                text[textfieldIndex].setAlignment(Pos.CENTER);
                GridPane.setConstraints(text[textfieldIndex],i,j);
                pane.getChildren().add(text[textfieldIndex]);
                textfieldIndex++;


            }
        }




        Scene scene = new Scene(pane );

        primaryStage.setTitle("random numbers");
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    private static int[][] getRandom1or0() {

        int[][] random = new int[10][10];


        for (int i = 0; i < random.length; i++) {

            for (int j = 0; j < random[i].length; j++) {

                random[i][j] = (int) (Math.random() * 2);

            }

        }


        return random;
    }
}
