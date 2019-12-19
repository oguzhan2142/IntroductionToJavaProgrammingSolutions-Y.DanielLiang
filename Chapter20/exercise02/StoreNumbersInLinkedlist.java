package exercise02;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.Comparator;
import java.util.LinkedList;

public class StoreNumbersInLinkedlist extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane borderPane = new BorderPane();

        Button sortBtn = new Button("Sort");
        Button shuffleBtn = new Button("Shuffle");
        Button reverseBtn = new Button("Reverse");
        TextField enterNumField = new TextField();
        TextArea area = new TextArea();
        ScrollPane scrollPane = new ScrollPane(area);

        LinkedList<Number> linkedList = new LinkedList<>();

        sortBtn.setOnAction(event -> {
            linkedList.sort(new Comparator<Number>() {
                @Override
                public int compare(Number o1, Number o2) {
                    if (o1.doubleValue() > o2.doubleValue())
                        return 1;
                    else if (o1.doubleValue() < o2.doubleValue())
                        return -1;
                    else
                        return 0;
                }
            });
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < linkedList.size(); i++) {

                s.append(linkedList.get(i)).append(" ");
            }
            area.setText(s.toString());
        });

        shuffleBtn.setOnAction(event -> {

            for (int i = 0; i < linkedList.size(); i++) {

                int randomIndex = (int) (Math.random() * linkedList.size());
                Number n1 = linkedList.get(i);
                Number n2 = linkedList.get(randomIndex);

                linkedList.set(i, n2);
                linkedList.set(randomIndex, n1);

            }

            StringBuilder s = new StringBuilder();
            for (int i = 0; i < linkedList.size(); i++) {

                s.append(linkedList.get(i)).append(" ");
            }
            area.setText(s.toString());

        });



        reverseBtn.setOnAction(event -> {


            StringBuilder s = new StringBuilder();
            for (int i = linkedList.size() - 1; i >= 0 ; i--) {

                s.append(linkedList.get(i)).append(" ");
            }
            area.setText(s.toString());
        });



        enterNumField.setOnKeyPressed(event -> {

            if (event.getCode() == KeyCode.ENTER) {

                int num = Integer.parseInt(enterNumField.getText());
                if (!linkedList.contains(num)) {
                    linkedList.add(num);
                }


                StringBuilder s = new StringBuilder();
                enterNumField.setText("");
                for (int i = 0; i < linkedList.size(); i++) {

                    s.append(linkedList.get(i)).append(" ");
                }
                area.setText(s.toString());
            }

        });


        HBox topPane = new HBox(20, new Label("Enter a Number:"), enterNumField);
        topPane.setAlignment(Pos.CENTER);
        HBox hBox = new HBox(10, sortBtn, shuffleBtn, reverseBtn);
        hBox.setAlignment(Pos.CENTER);
        borderPane.setCenter(scrollPane);
        borderPane.setBottom(hBox);
        borderPane.setTop(topPane);
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.setTitle("Store Numbers");
        primaryStage.show();
    }
}
