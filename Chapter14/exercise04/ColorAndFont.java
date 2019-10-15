package exercise04;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ColorAndFont extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        VBox pane = new VBox();


        Font defaultFont = Font.font("Times New Roman" , FontWeight.BOLD , FontPosture.ITALIC ,22  );

        Text[] text = new Text[5];

        int yPos = 10;

        for (int i = 0; i <text.length ; i++) {
            yPos *= (i + 1);
            text[i] = new Text(0,yPos,"Introduction to java programming");
            text[i].setFont(defaultFont);
            text[i].setFill(getRandomColor());
        }


        for (int i = 0; i < text.length; i++) {

            pane.getChildren().add(text[i]);

        }

        Scene scene = new Scene(pane , 500 , 600);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Color and Font");
        primaryStage.show();

    }

    private Color  getRandomColor() {

        double randomR = Math.random();
        double randomG = Math.random();
        double randomB = Math.random();
        double randomOpacity = Math.random();

        return new Color(randomR,randomG,randomB,randomOpacity);

    }
}
