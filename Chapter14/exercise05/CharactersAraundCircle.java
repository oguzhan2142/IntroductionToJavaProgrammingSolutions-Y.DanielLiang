package exercise05;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class CharactersAraundCircle extends Application {

    public static final double WIDTH = 400;
    public static final double HEIGHT = 400;

    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane pane = new Pane();
        pane.setLayoutX(WIDTH / 2);
        pane.setLayoutY(HEIGHT / 2);


        char[] text = "WELCOMETOJAVA".toCharArray();
        Text[] letter = new Text[text.length];

        double xPos = 30, yPos = 30, rotation = 0;


        double[][] cor = giveCordinatesAroundCircle(4, WIDTH / 2 - 80);


        for (int i = 0; i < cor.length; i++) {


            letter[i] = new Text(cor[i][0], cor[i][1], text[i] + "");
            letter[i].setFont(new Font("Tahoma", 25));
            letter[i].setRotate(rotation += 10);


            pane.getChildren().add(letter[i]);

        }

        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Characters Around Circle");
        primaryStage.show();

    }


    public static double[][] giveCordinatesAroundCircle(int howMany, double radiusOfCircle) {

        double[][] cordinate = new double[howMany][2];


        double x = radiusOfCircle;
        double y = 0;

        cordinate[0][0] = x;
        cordinate[0][1] = y;

        for (int i = 1; i < howMany; i++) {

            x += 20;

            y = Math.sqrt((radiusOfCircle * radiusOfCircle) - (x * x));

            cordinate[i][0] = x;
            cordinate[i][1] = y;
        }

        return cordinate;


    }


}





