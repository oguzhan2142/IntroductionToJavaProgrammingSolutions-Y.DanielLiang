package exercise15;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class DemonstrateLabelProperties extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox main = new VBox();
        BorderPane contentPane = new BorderPane();
        HBox controlPane = new HBox();
        HBox imgPane = new HBox();
        StackPane textpane = new StackPane();
        Label cdL = new Label("contentDisplay");
        ComboBox<String> positionCombobox = new ComboBox<String>(FXCollections.observableArrayList("LEFT", "CENTER", "RIGHT"));
        Label gtgL = new Label("graphicTextGap");
        TextField textField = new TextField();

        ImageView img = new ImageView(new Image("exercise15/img/grapes.png"));
        Label grapesImg = new Label();
        grapesImg.setGraphic(img);
        Label grapesText = new Label("Grapes");
        imgPane.setPrefWidth(400);
        textpane.setPrefWidth(200);

        positionCombobox.setOnAction(event -> {

            String s = positionCombobox.getSelectionModel().getSelectedItem();

            if (s.equals("RIGHT"))
                imgPane.setAlignment(Pos.CENTER_RIGHT);
            if (s.equals("CENTER"))
                imgPane.setAlignment(Pos.CENTER);
            if (s.equals("LEFT"))
                imgPane.setAlignment(Pos.CENTER_LEFT);
        });

        textField.setOnKeyPressed(event -> {
            if (event.getCode() == KeyCode.ENTER)
                grapesText.setFont(Font.font(Double.parseDouble(textField.getText())));
        });

        textpane.getChildren().add(grapesText);
        imgPane.getChildren().add(grapesImg);
        contentPane.setLeft(imgPane);
        contentPane.setRight(textpane);
        controlPane.setSpacing(10);
        controlPane.getChildren().addAll(cdL, positionCombobox, gtgL, textField);
        main.getChildren().addAll(controlPane, contentPane);
        primaryStage.setScene(new Scene(main));
        primaryStage.setTitle("Label Properties");
        primaryStage.show();

    }
}
