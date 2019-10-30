package exercise10;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class EnterAndDisplayAString extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        StringBuilder s = new StringBuilder();

        pane.setOnKeyTyped(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {

                s.append(event.getCharacter());


                if (event.getCharacter().charAt(event.getCharacter().length() - 1) == 13) {

                    Text text = new Text(300, 300, s.toString());
                    pane.getChildren().clear();
                    pane.getChildren().add(text);
                    s.delete(0, s.length() - 1);
                }

            }
        });


        primaryStage.setTitle("Enter A String");
        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.show();
        pane.requestFocus();
    }
}
