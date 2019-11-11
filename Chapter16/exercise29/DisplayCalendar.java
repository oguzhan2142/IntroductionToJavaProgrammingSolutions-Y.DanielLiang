package exercise29;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DisplayCalendar extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Button nextBtn = new Button("Next");
        Button priorBtn = new Button("Prior");

        CustomCalendar customCalendar = new CustomCalendar(2016, 0);


        HBox buttonPane = new HBox(10, priorBtn, nextBtn);
        buttonPane.setAlignment(Pos.CENTER);
        BorderPane mainPane = new BorderPane();
        mainPane.setCenter(customCalendar);
        mainPane.setBottom(buttonPane);
        primaryStage.setTitle("Calendar");
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.show();
    }


    class CustomCalendar extends GridPane {
        int year = 2016;
        private String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};


        public CustomCalendar(int year, int monthIndex) {

            setPadding(new Insets(20, 20, 20, 20));
            setHgap(30);
            setVgap(20);
            addHeader(year, monthIndex);

            int firstDayIndex = getFirsDayIndexOfMonth(year, monthIndex);
            int lastDayIndex = getLastDayOfMonth(year, monthIndex);
            int index = 1;
            for (int i = 2; i < 8; i++) {
                for (int j = firstDayIndex; j < 7; j++) {
                    add(new Text(index++ + ""), j, i);
                    if (index > lastDayIndex) {
                        break;
                    }
                }
                firstDayIndex = 0;
            }

            firstDayIndex = getFirsDayIndexOfMonth(year, monthIndex);
            int previousMonthMaxDay = getPriviousMonthMaxDay(year,monthIndex);
            System.out.println(index);
            for (int i = firstDayIndex  - 1; i >= 0; i--) {

                Text t = new Text(previousMonthMaxDay-- + "");
                t.setOpacity(0.3);
                add(t, i, 2);

            }

            for (int i = 0; i < ; i++) {
                
            }


        }


        private void addHeader(int year, int monthIndex) {
            Text header = new Text(month[monthIndex]);
            Text header2 = new Text(year + "");
            add(header, 3, 0);
            add(header2, 4, 0);
            add(new Text("Sunday"), 0, 1);
            add(new Text("Monday"), 1, 1);
            add(new Text("Tuesday"), 2, 1);
            add(new Text("Wednesday"), 3, 1);
            add(new Text("Thursday"), 4, 1);
            add(new Text("Friday"), 5, 1);
            add(new Text("Saturday"), 6, 1);
        }

        private int getPriviousMonthMaxDay(int year, int month) {
            if (month == 0) month = 11;
            else month -= 1;


            Calendar calendar = new GregorianCalendar(year, month, 1);

            return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }

        private int getFirsDayIndexOfMonth(int year, int month) {
            Calendar calendar = new GregorianCalendar(year, month, 1);
            calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
            calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));

            String s = calendar.getTime().toString().substring(0, 3).trim();

            if (s.equals("Sun"))
                return 0;
            if (s.equals("Mon"))
                return 1;
            if (s.equals("Tue"))
                return 2;
            if (s.equals("Wed"))
                return 3;
            if (s.equals("Thu"))
                return 4;
            if (s.equals("Fri"))
                return 5;
            else
                return 6;


        }


        private int getLastDayOfMonth(int year, int Month) {
            Calendar calendar = new GregorianCalendar(year, Month, 1);

            return calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        }


    }


}
