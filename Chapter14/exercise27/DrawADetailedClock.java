package exercise27;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DrawADetailedClock extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane pane = new BorderPane();

        ClockPane detailedClock = new ClockPane();


        pane.setCenter(detailedClock);
        Label displayHour = new Label(detailedClock.getHour() + ":" + detailedClock.getMinute() + ":" + detailedClock.getSecond());
        displayHour.setFont(Font.font(30));
        pane.setBottom(displayHour);
        pane.setAlignment(displayHour, Pos.CENTER);


        Scene scene = new Scene(pane);
        primaryStage.setTitle("Detailed Clock");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    class ClockPane extends Pane {

        private int hour;


        private int minute;
        private int second;

        private double width = 800;
        private double height = 800;

        public ClockPane() {
            setCurrentTime();
        }

        public ClockPane(int hour, int minute, int second) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
            paintClock();
        }

        public int getHour() {
            return hour;
        }

        public int getMinute() {
            return minute;
        }

        public int getSecond() {
            return second;
        }

        private void setCurrentTime() {

            Calendar calendar = new GregorianCalendar();
            hour = calendar.get(Calendar.HOUR_OF_DAY);
            minute = calendar.get(Calendar.MINUTE);
            second = calendar.get(Calendar.SECOND);
            paintClock();


        }

        private void paintClock() {

            double clockRadius = Math.min(width, height) * 0.8 * 0.5;
            double centerX = width / 2 - width / 10;
            double centerY = height / 2 - height / 10;

            Circle clock = new Circle(centerX, centerY, clockRadius);
            clock.setStroke(Color.BLACK);
            clock.setFill(Color.WHITE);

            //draw second hand

            double sLenght = clock.getRadius() * 0.8;
            double secondX = clock.getCenterX() + sLenght * Math.sin(second * (2 * Math.PI / 60));
            double secondY = clock.getCenterY() - sLenght * Math.cos(second * (2 * Math.PI / 60));
            Line secondHand = new Line(centerX, centerY, secondX, secondY);

            //draw minute hand

            double mLenght = clock.getRadius() * 0.65;
            double minuteX = centerX + mLenght * Math.sin(minute * (2 * Math.PI / 60));
            double minuteY = centerY - mLenght * Math.cos(minute * (2 * Math.PI / 60));
            Line minuteHand = new Line(centerX, centerY, minuteX, minuteY);

            //draw hour hand

            double hLength = clock.getRadius() * 0.5;
            double hourX = centerX + (hLength )* Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
            double hourY = centerY - (hLength )* Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
            Line hourHand = new Line(centerX, centerY, hourX, hourY);


            //draw numbers

            Text[] number = new Text[12];

            for (int i = 0; i < number.length; i++) {
                double positionX = clock.getCenterX() + (sLenght ) * Math.sin(5 * (i + 1) * (2 * Math.PI / 60)) - 15;
                double positionY = clock.getCenterY() - (sLenght ) * Math.cos(5 * (i + 1) * (2 * Math.PI / 60)) + 5;

                number[i] = new Text(positionX, positionY, (i + 1) + "");
                number[i].setFont(Font.font(30));
            }
            Font font = Font.font("Tahoma", 25);

            //draw little lines

            Line[] line = new Line[60];
            for (int i = 0; i < line.length; i++) {

                double startX = clock.getCenterX() + (sLenght + 25) * Math.sin((i + 1) * (2 * Math.PI / 60)) - 15;
                double startY = clock.getCenterY() - (sLenght + 25) * Math.cos((i + 1) * (2 * Math.PI / 60)) + 5;
                double endX = clock.getCenterX() + (sLenght + 40) * Math.sin((i + 1) * (2 * Math.PI / 60)) - 15;
                double endY = clock.getCenterY() - (sLenght + 40) * Math.cos((i + 1) * (2 * Math.PI / 60)) + 5;

                if ((i + 1) % 5 == 0) {

                     startX = clock.getCenterX() + (sLenght + 5) * Math.sin((i + 1) * (2 * Math.PI / 60)) - 15;
                     startY = clock.getCenterY() - (sLenght + 5) * Math.cos((i + 1) * (2 * Math.PI / 60)) + 5;


                }
                line[i] = new Line(startX, startY, endX, endY);

            }


            //add components

            getChildren().addAll(clock, hourHand, minuteHand, secondHand);

            for (Text i :
                    number) {
                getChildren().add(i);
            }
            for (Line l :
                    line) {
                getChildren().add(l);
            }

        }


    }
}
