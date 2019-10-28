package exercise26;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ClockPane extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {


        BorderPane borderPane = new BorderPane();

        Clock clock1 = new Clock(4, 20, 45);
        Clock clock2 = new Clock(22, 46, 15);


        borderPane.setLeft(clock1);
        borderPane.setRight(clock2);
        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Clockpanes");
        primaryStage.show();

    }

    class Clock extends Pane {

        private final int width_of_clock = 400;
        private final int height_of_clock = 400;

        private int hour;
        private int minute;
        private int second;


        public Clock() {


        }

        public Clock(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            setStyle("-fx-border-color:black");
            printClock();
        }


        public void printClock() {


            double centerX = width_of_clock / 2;
            double centerY = height_of_clock / 2;
            double radius = Math.min(width_of_clock, height_of_clock);

            Circle clock = new Circle(centerX, centerY, radius * 0.5);
            clock.setFill(Color.WHITE);
            clock.setStroke(Color.BLACK);

            //draw second hand

            double sLenght = clock.getRadius() * 0.9;
            double secondX = centerX + sLenght * Math.sin(second * (2 * Math.PI / 60));
            double secondY = centerY - sLenght * Math.cos(second * (2 * Math.PI / 60));
            Line secondHand = new Line(centerX, centerY, secondX, secondY);

            //draw minute hand

            double mLenght = clock.getRadius() * 0.75;
            double minuteX = centerX + mLenght * Math.sin(minute * (2 * Math.PI / 60));
            double minuteY = centerY - mLenght * Math.cos(minute * (2 * Math.PI / 60));
            Line minuteHand = new Line(centerX, centerY, minuteX, minuteY);

            //draw hour hand

            double hLength = clock.getRadius() * 0.6;
            double hourX = centerX + hLength * Math.sin(hour * (2 * Math.PI / 24));
            double hourY = centerY - hLength * Math.cos(hourX * (2 * Math.PI / 24));
            Line hourHand = new Line(centerX, centerY, hourX, hourY);


            //draw numbers

            Font font = Font.font("Tahoma", 25);

            Text twelve = new Text(centerX, 20, "12");
            twelve.setFont(font);
            Text three = new Text(width_of_clock - 20, centerY, "3");
            three.setFont(font);
            Text six = new Text(centerX, height_of_clock - 20, "6");
            six.setFont(font);
            Text nine = new Text(20, centerY, "9");
            nine.setFont(font);

            getChildren().clear();
            getChildren().addAll(clock, hourHand, minuteHand, secondHand, twelve, three, six, nine);

        }


    }


}
