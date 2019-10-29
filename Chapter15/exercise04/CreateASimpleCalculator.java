package exercise04;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CreateASimpleCalculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        TextField number1 = new TextField();
        TextField number2 = new TextField();
        TextField result = new TextField();

        Label number1Label = new Label("Number 1:");
        Label number2Label = new Label("Number 2:");
        Label resultLabel = new Label("Result:");


        Button add = new Button("Add");
        Button subtrack = new Button("Subtrack");
        Button multiply = new Button("Multiply");
        Button divide = new Button("Divide");


        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (event.getSource() == add) {
                    double temp = Double.parseDouble(number1.getText()) + Double.parseDouble(number2.getText());
                    result.setText(Double.toString(temp));
                }
                if (event.getSource() == subtrack) {
                    double temp = Double.parseDouble(number1.getText()) - Double.parseDouble(number2.getText());
                    result.setText(Double.toString(temp));
                }
                if (event.getSource() == multiply) {

                    double temp = Double.parseDouble(number1.getText()) * Double.parseDouble(number2.getText());
                    result.setText(Double.toString(temp));

                }
                if (event.getSource() == divide) {
                    double temp = Double.parseDouble(number1.getText()) / Double.parseDouble(number2.getText());
                    result.setText(Double.toString(temp));
                }


            }
        };

        add.setOnAction(handler);
        subtrack.setOnAction(handler);
        multiply.setOnAction(handler);
        divide.setOnAction(handler);


        HBox buttonPane = new HBox();
        buttonPane.getChildren().addAll(add,subtrack,multiply,divide);
        buttonPane.setAlignment(Pos.CENTER);
        buttonPane.setSpacing(14);

        HBox numberPane = new HBox();
        numberPane.getChildren().addAll(number1Label,number1,number2Label,number2,resultLabel,result);
        numberPane.setAlignment(Pos.CENTER);
        numberPane.setSpacing(2);

        VBox mainPane = new VBox();
        mainPane.getChildren().addAll(numberPane,buttonPane);

        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Simple Calculator");
        primaryStage.show();


    }
}
