package exercise14;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SelectFont extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        StackPane textPane = new StackPane();
        HBox topPane = new HBox();
        HBox bottomPane = new HBox();
        Text text = new Text("Programming is fun");
        text.setFont(Font.font("Tahoma", 30));
        Label fnLabel = new Label("Font Name");
        ComboBox<String> fontList = new ComboBox<>();
        fontList.setItems(FXCollections.observableArrayList(Font.getFamilies()));
        fontList.getSelectionModel().select(0);
        Label fsLabel = new Label("Font Size");
        CheckBox boldBtn = new CheckBox("Bold");
        CheckBox italicBtn = new CheckBox("Italic");


        ComboBox<Integer> fontSizeList = new ComboBox<>();
        ObservableList<Integer> fsList = FXCollections.observableArrayList();
        for (int i = 1; i < 101; i++) {
            fsList.add(i);
        }
        fontSizeList.setItems(fsList);
        fontSizeList.getSelectionModel().select(0);

        fontList.setOnAction(event -> {

            Font currentFont = text.getFont();
            text.setFont(Font.font(fontList.getSelectionModel().getSelectedItem(), currentFont.getSize()));

        });

        fontSizeList.setOnAction(event -> {

            Font currentFont = text.getFont();
            text.setFont(Font.font(currentFont.getName(), fontSizeList.getSelectionModel().getSelectedItem()));


        });


        boldBtn.setOnAction(event -> {
            Font current = text.getFont();
            if (boldBtn.isSelected())
                text.setFont(Font.font(current.getFamily(), FontWeight.BOLD, current.getSize()));
            else
                text.setFont(Font.font(current.getFamily(), FontWeight.NORMAL, current.getSize()));
        });


        italicBtn.setOnAction(event -> {
            Font current = text.getFont();
            if (italicBtn.isSelected())
                text.setFont(Font.font(current.getFamily(),FontPosture.ITALIC, current.getSize()));
            else
                text.setFont(Font.font(current.getFamily(), FontPosture.REGULAR, current.getSize()));

        });

        topPane.setSpacing(10);
        topPane.setAlignment(Pos.CENTER);
        bottomPane.setAlignment(Pos.CENTER);
        bottomPane.setSpacing(20);
        bottomPane.getChildren().addAll(boldBtn, italicBtn);
        topPane.getChildren().addAll(fnLabel, fontList, fsLabel, fontSizeList);
        textPane.getChildren().add(text);
        mainPane.setTop(topPane);
        mainPane.setCenter(textPane);
        mainPane.setBottom(bottomPane);
        primaryStage.setScene(new Scene(mainPane, 500, 300));
        primaryStage.setTitle("Select A Font");
        primaryStage.show();
    }
}
