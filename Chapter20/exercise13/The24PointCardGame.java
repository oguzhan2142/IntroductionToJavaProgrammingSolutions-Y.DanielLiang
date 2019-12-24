package exercise13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class The24PointCardGame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox cardPane = new HBox(10);

        Label informationLbl = new Label();
        Button shuffleBtn = new Button("Shuffle");
        HBox topPane = new HBox(10, informationLbl, shuffleBtn);
        topPane.setAlignment(Pos.CENTER_RIGHT);

        TextField expressionFld = new TextField();
        expressionFld.setPrefColumnCount(30);
        Button verifyBtn = new Button("Verify");
        HBox botPane = new HBox(15, new Label("Enter Expression:"), expressionFld, verifyBtn);
        botPane.setAlignment(Pos.CENTER);





        mainPane.setCenter(cardPane);
        mainPane.setTop(topPane);
        mainPane.setBottom(botPane);
        primaryStage.setScene(new Scene(mainPane, 800, 500));
        primaryStage.setTitle("Card Game");
        primaryStage.show();
    }





}

class Card extends ImageView{

    protected int value;


    public Card(int value , String path) {
        this.value = value;
        
    }
}


