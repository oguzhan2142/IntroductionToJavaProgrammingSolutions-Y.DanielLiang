package exercise13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class CompareLoansWithVariousInterestRate extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox topPane = new HBox();
        StackPane textPane = new StackPane();
        TextArea textArea = new TextArea();
        Label loanAmountLabel = new Label("Loan Amount");
        TextField laField = new TextField();
        Label numOfYearslabel = new Label("Number Of Years");
        TextField numOfYearsField = new TextField();
        Button showTableBtn = new Button("Show Table");
        topPane.setAlignment(Pos.CENTER);
        topPane.setSpacing(10);


        showTableBtn.setOnAction(event -> {
            double loanAmount = Double.parseDouble(laField.getText());
            int numOfYears = Integer.parseInt(numOfYearsField.getText());

            String text = "Interest Rate Monthly Payment Total Payment\n";

            for (double i = 0.05; i <= 0.081; i += 0.00125) {

                loanAmount = loanAmount * (1 + i);
                double monthlyPayment = loanAmount / numOfYears / 12;

                text += (String.format("%.2f ", (i * 100)) + "%\t" + String.format("%.2f ", monthlyPayment) + "\t" + String.format("%.2f ", monthlyPayment * 12 * numOfYears) + "\n");


            }

            textArea.setText(text);


        });


        topPane.getChildren().addAll(loanAmountLabel, laField, numOfYearslabel, numOfYearsField, showTableBtn);
        textPane.getChildren().add(textArea);
        mainPane.setTop(topPane);
        mainPane.setCenter(textPane);
        primaryStage.setScene(new Scene(mainPane, 800, 600));
        primaryStage.setTitle("Compare");
        primaryStage.show();
    }
}
