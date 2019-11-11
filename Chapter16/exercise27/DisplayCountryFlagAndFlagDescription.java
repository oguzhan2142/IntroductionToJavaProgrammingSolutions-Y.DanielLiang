package exercise27;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class DisplayCountryFlagAndFlagDescription extends Application {


    private ImageView[] flagImage = {
            new ImageView("exercise27/img/canada.png"),
            new ImageView("exercise27/img/china.png"),
            new ImageView("exercise27/img/denmark.png"),
            new ImageView("exercise27/img/france.png"),
            new ImageView("exercise27/img/germany.png"),
            new ImageView("exercise27/img/india.png"),
            new ImageView("exercise27/img/norway.png"),
            new ImageView("exercise27/img/uk.png"),
            new ImageView("exercise27/img/usa.png"),
    };


    @Override
    public void start(Stage primaryStage) throws Exception {

        ComboBox<String> cbo = new ComboBox<>(FXCollections.observableArrayList("Canada", "China", "Denmark",
                "France", "Germany", "India", "Norway", "UK", "USA"));

        BorderPane borderPane = new BorderPane();
        BorderPane checkBoxPane = new BorderPane();
        checkBoxPane.setLeft(new Label("Select Country:"));
        checkBoxPane.setCenter(cbo);
        borderPane.setTop(checkBoxPane);
        StackPane flagPane = new StackPane();
        flagPane.setPrefSize(256, 256);
        TextArea textArea = new TextArea();
        ScrollPane descriptionPane = new ScrollPane(textArea);
        descriptionPane.setFitToHeight(true);
        borderPane.setLeft(flagPane);
        borderPane.setRight(descriptionPane);

        cbo.setOnAction(event -> {

            flagPane.getChildren().clear();
            flagPane.getChildren().add(flagImage[cbo.getSelectionModel().getSelectedIndex()]);
            textArea.setText("");
            File file = new File("/Users/oguzhan/Chapter16/src/exercise27/text/description" + cbo.getSelectionModel().getSelectedIndex() + ".txt");
            try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    textArea.setText(textArea.getText() + scanner.nextLine() + "\n");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }


        });

        cbo.setPrefWidth(400);
        cbo.setValue("Canada");
        primaryStage.setTitle("Display Country Flag And Flag Description");
        primaryStage.setScene(new Scene(borderPane));
        primaryStage.show();
    }
}
