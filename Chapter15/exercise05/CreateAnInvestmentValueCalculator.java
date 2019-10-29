package exercise05;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CreateAnInvestmentValueCalculator extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane gridPane = new GridPane();


        TextField investmentAmount = new TextField();
        TextField numOfYears = new TextField();
        TextField annualInterestRate = new TextField();
        TextField futureValue = new TextField();
        futureValue.setEditable(false);
        Label investmentAmountLabel = new Label("Invesment Amount:");
        Label numOfYearsLabel = new Label("Number Of Years:");
        Label annualInterestRateLabel = new Label("Annual Interest Rate:");
        Label futureValueLabel = new Label("Future Value:");


        Button calculate = new Button("Calculate");


        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                double invesmentAmount = Double.parseDouble(investmentAmount.getText());
                double years = Double.parseDouble(numOfYears.getText());
                double monthlyInterestRate = Double.parseDouble(annualInterestRate.getText()) / 1200;

                double result = invesmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);
                futureValue.setText("$" + String.format("%.2f", result));

            }
        };


        calculate.setOnAction(handler);


        GridPane.setConstraints(investmentAmountLabel, 0, 0);
        GridPane.setConstraints(investmentAmount, 1, 0);
        GridPane.setConstraints(numOfYearsLabel, 0, 1);
        GridPane.setConstraints(numOfYears, 1, 1);
        GridPane.setConstraints(annualInterestRateLabel, 0, 2);
        GridPane.setConstraints(annualInterestRate, 1, 2);
        GridPane.setConstraints(futureValueLabel, 0, 3);
        GridPane.setConstraints(futureValue, 1, 3);
        GridPane.setConstraints(calculate, 1, 4, 1, 1, HPos.RIGHT, VPos.CENTER);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 20, 10, 20));
        gridPane.getChildren().addAll(investmentAmount, numOfYears, annualInterestRate, futureValue, investmentAmountLabel, numOfYearsLabel, annualInterestRateLabel, futureValueLabel, calculate);


        primaryStage.setScene(new Scene(gridPane));
        primaryStage.setTitle("Investment-Value Calculator");
        primaryStage.show();


    }
}
