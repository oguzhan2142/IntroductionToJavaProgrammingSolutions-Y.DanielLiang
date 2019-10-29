package exercise06;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AlternateTwoMessages extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        String str1 = "Java is fun";
        String str2 = "Java is powerful";

        TextField textField = new TextField(str1);
        textField.setPrefWidth(200);
        textField.setEditable(false);
        textField.setAlignment(Pos.CENTER);

        Button changeBtn = new Button("Change");
        EventHandler<ActionEvent> handler = new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

                if (textField.getText().matches(str1))
                    textField.setText(str2);
                else
                    textField.setText(str1);
            }
        };
        changeBtn.setOnAction(handler);

        VBox vBox = new VBox();
        vBox.setSpacing(20);
        vBox.setPadding(new Insets(20,20,10,20));
        vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(textField, changeBtn);
        primaryStage.setScene(new Scene(vBox));
        primaryStage.setTitle("Alternate Two Messages?");
        primaryStage.show();


    }
}
