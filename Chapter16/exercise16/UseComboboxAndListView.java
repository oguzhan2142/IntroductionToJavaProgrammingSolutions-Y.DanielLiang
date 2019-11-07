package exercise16;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class UseComboboxAndListView extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox topPane = new HBox();
        ComboBox<String> sModeList = new ComboBox<>(FXCollections.observableArrayList("MULTIPLE", "SINGLE"));
        sModeList.getSelectionModel().select(0);
        Label label = new Label("Choose Selection Mode:");

        ObservableList asd = FXCollections.observableArrayList("China", "Japan" , "Korea" , "India" , "Malaysia" , "Vietnam" , "Turkey" , "England");
        ListView<String> coutryList = new ListView<String>(asd);
        ScrollPane scrollPane = new ScrollPane(coutryList);

        sModeList.setOnAction(event -> {

            if (sModeList.getSelectionModel().getSelectedItem().equals("MULTIPLE"))
                coutryList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
            if (sModeList.getSelectionModel().getSelectedItem().equals("SINGLE"))
                coutryList.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

        });


        topPane.getChildren().addAll(label,sModeList);
        mainPane.setTop(topPane);
        mainPane.setCenter(scrollPane);
        primaryStage.setScene(new Scene(mainPane));
        primaryStage.setTitle("Use Combobox And ListView");
        primaryStage.show();
    }
}
