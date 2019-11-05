package exercise05;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ConvertNumbers extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Label dLabel = new Label("Decimal");
        Label hLabel = new Label("Hex");
        Label bLabel = new Label("Binary");

        TextField dField = new TextField();
        TextField hField = new TextField();
        TextField bField = new TextField();

        dField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){

                int decimal = Integer.parseInt(dField.getText());
                hField.setText(Integer.toHexString(decimal));
                bField.setText(Integer.toBinaryString(decimal));

            }
        });

        hField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){

                dField.setText(Integer.parseInt(hField.getText(),16) + "");
                bField.setText(Integer.toBinaryString(Integer.parseInt(hField.getText() , 16)));
            }
        });
        bField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER){
                dField.setText(Integer.parseInt(bField.getText(),2) + "");
                hField.setText(Integer.toHexString(Integer.parseInt(bField.getText(),2)));
            }
        });



        GridPane gridPane = new GridPane();
        GridPane.setConstraints(dLabel,0,0);
        GridPane.setConstraints(dField,1,0);
        GridPane.setConstraints(hLabel,0,1);
        GridPane.setConstraints(hField,1,1);
        GridPane.setConstraints(bLabel,0,2);
        GridPane.setConstraints(bField,1,2);
        gridPane.setHgap(10);
        gridPane.setPadding(new Insets(15,5,5,15));
        gridPane.getChildren().addAll(dLabel,hLabel,bLabel,dField,hField,bField);
        primaryStage.setTitle("Number Converter");
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }
}
