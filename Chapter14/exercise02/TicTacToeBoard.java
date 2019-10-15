package exercise02;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToeBoard extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {

        GridPane pane = new GridPane();

        int row = 0, column = 0;
        ImageView[] randomlyGenerated = new ImageView[9];
        for (int i = 0; i < 9; i++) {

            randomlyGenerated[i] = randomly();
            GridPane.setConstraints(randomlyGenerated[i], row, column);
            pane.getChildren().add(randomlyGenerated[i]);
            row++;
            if (row == 3) {
                column++;
                row = 0;
            }
        }


        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("tic tac toe");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    public static ImageView randomly() {
        Image xImg = new Image("exercise02/img/x.gif");
        Image oImg = new Image("exercise02/img/o.gif");
        final int itemSize = 100;
        ImageView x = new ImageView(xImg);
        ImageView o = new ImageView(oImg);
        ImageView empty = new ImageView();
        x.setFitHeight(itemSize);
        x.setFitWidth(itemSize);
        o.setFitHeight(itemSize);
        o.setFitWidth(itemSize);
        empty.setFitWidth(itemSize);
        empty.setFitHeight(itemSize);
        int randomNum = (int) (Math.random() * 3);

        ImageView random;

        if (randomNum == 0) random = x;
        else if (randomNum == 1) random = o;
        else random = empty;


        return random;

    }
}
