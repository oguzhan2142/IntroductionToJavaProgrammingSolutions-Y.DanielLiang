package exercise28;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomTime extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        ModifiedClockPane modifiedClockPane = new ModifiedClockPane();
        modifiedClockPane.setHourHandVisible(true);
        modifiedClockPane.setMinuteHandVisible(true);


        String timeStr = modifiedClockPane.getHour() + ":" + modifiedClockPane.getMinute() + ":" + modifiedClockPane.getSecond();
        Label timeLabel = new Label(timeStr);

        BorderPane borderPane = new BorderPane();
        borderPane.setBottom(timeLabel);
        borderPane.setAlignment(timeLabel, Pos.CENTER);
        borderPane.setCenter(modifiedClockPane);


        Scene scene = new Scene(borderPane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Modified Clock Pane");
        primaryStage.show();


    }


}

class ModifiedClockPane extends Pane {

    private int hour;
    private int minute;
    private int second;
    private boolean hourHandVisible;
    private boolean minuteHandVisible;
    private boolean secondHandVisible;


    private double h = 400, w = 400;


    public ModifiedClockPane() {

        hour = (int) (Math.random() * 12);
        minute = (int) (Math.random() * 31);
        second = (int) (Math.random() * 31);
        paintClock();
    }

    public ModifiedClockPane(int hour, int minute, int second) {

        this.hour = hour;
        this.minute = minute;
        this.second = second;
        paintClock();


    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public boolean isHourHandVisible() {
        return hourHandVisible;
    }

    public void setHourHandVisible(boolean hourHandVisible) {
        this.hourHandVisible = hourHandVisible;
        paintClock();
    }

    public boolean isMinuteHandVisible() {
        return minuteHandVisible;
    }

    public void setMinuteHandVisible(boolean minuteHandVisible) {
        this.minuteHandVisible = minuteHandVisible;
        paintClock();
    }

    public boolean isSecondHandVisible() {
        return secondHandVisible;
    }

    public void setSecondHandVisible(boolean secondHandVisible) {
        this.secondHandVisible = secondHandVisible;
    }

    public void setCurrentTIme() {

        Calendar calendar = new GregorianCalendar();

        this.hour = calendar.get(Calendar.HOUR_OF_DAY);
        this.minute = calendar.get(Calendar.MINUTE);
        this.second = calendar.get(Calendar.SECOND);

        paintClock();


    }


    protected void paintClock() {
        getChildren().clear();

        double clockRadius = Math.min(w, h) * 0.8 * 0.5;
        double centerX = w / 2;
        double centerY = h / 2;

        //draw circle
        Circle circle = new Circle(centerX, centerY, clockRadius);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);


        //draw second hand

        double sLength = clockRadius * 0.8;
        double secondX = centerX + sLength * Math.sin(second * (2 * Math.PI / 60));
        double secondY = centerY - sLength * Math.cos(second * (2 * Math.PI / 60));
        Line sLine = new Line(centerX, centerY, secondX, secondY);
        //draw minute hand

        double mLength = clockRadius * 0.65;
        double minuteX = centerX + mLength * Math.sin(minute * (2 * Math.PI / 60));
        double minuteY = centerY - mLength * Math.cos(minute * (2 * Math.PI / 60));
        Line mLine = new Line(centerX, centerY, minuteX, minuteY);
        //draw hour hand

        double hLength = clockRadius * 0.5;
        double hourX = centerX + hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        double hourY = centerY - hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
        Line hLine = new Line(centerX, centerY, hourX, hourY);

        //draw numbers
        Text[] numbers = new Text[12];
        getChildren().add(circle);

        for (int i = 0; i < numbers.length; i++) {
            double numberLength = clockRadius * 0.87;
            double x = centerX + numberLength * Math.sin(5 * (i + 1) * (2 * Math.PI / 60));
            double y = centerY - numberLength * Math.cos(5 * (i + 1) * (2 * Math.PI / 60));

            numbers[i] = new Text(x, y, (i + 1) + "");
            getChildren().add(numbers[i]);

        }

        if (hourHandVisible) {
            getChildren().add(hLine);
        } else {
            getChildren().remove(hLine);
        }


        if (minuteHandVisible) {
            getChildren().add(mLine);
        } else {
            getChildren().remove(mLine);
        }

        if (secondHandVisible) {
            getChildren().add(sLine);
        } else {
            getChildren().remove(sLine);
        }


    }


}