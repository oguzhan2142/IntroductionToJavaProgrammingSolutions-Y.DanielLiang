package exercise13;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class DisplayAPieChart extends Application {

    final int width = 400;
    final int height = 400;
    final int radius = 150;

    @Override
    public void start(Stage primaryStage) throws Exception {


        Pane pane = new Pane();
        double centerX = width / 2;
        double centerY = height / 2;

        double lengthOfProjectArc = 360 * 0.2;
        double lengthOfQuiztArc = 360 * 0.1;
        double lengthOfMidtermtArc = 360 * 0.3;
        double lengthOfFinalArc = 360 * 0.4;

        Label projectLabel = new Label("Project -- 20%");
        Label quizLabel = new Label("Quiz -- 10%");
        Label midtermLabel = new Label("Midterm -- 30%");
        Label finalLabel = new Label("Final -- 40%");


        projectLabel.setLayoutX(centerX + 30);
        projectLabel.setLayoutY(centerY - 30);

        quizLabel.setLayoutX(centerX - 40);
        quizLabel.setLayoutY(centerY - 160);

        midtermLabel.setLayoutX(centerX - 160);
        midtermLabel.setLayoutY(centerY + 20);

        finalLabel.setLayoutX(centerX + 50);
        finalLabel.setLayoutY(centerY + 150);


        Arc projectArc = new Arc(centerX, centerY, radius, radius, 0, lengthOfProjectArc);
        Arc quizArc = new Arc(centerX, centerY, radius, radius, lengthOfProjectArc, lengthOfQuiztArc);
        Arc midtermArc = new Arc(centerX, centerY, radius, radius, (lengthOfProjectArc + lengthOfQuiztArc), lengthOfMidtermtArc);
        Arc finalArc = new Arc(centerX, centerY, radius, radius, (lengthOfMidtermtArc + lengthOfProjectArc + lengthOfQuiztArc), lengthOfFinalArc);

        projectArc.setStroke(Color.BLACK);
        projectArc.setFill(Color.RED);
        projectArc.setType(ArcType.ROUND);

        quizArc.setStroke(Color.BLACK);
        quizArc.setFill(Color.BLUE);
        quizArc.setType(ArcType.ROUND);

        midtermArc.setStroke(Color.BLACK);
        midtermArc.setFill(Color.GREEN);
        midtermArc.setType(ArcType.ROUND);

        finalArc.setStroke(Color.BLACK);
        finalArc.setFill(Color.ORANGE);
        finalArc.setType(ArcType.ROUND);


        pane.getChildren().addAll(projectArc, quizArc, midtermArc, finalArc, projectLabel,quizLabel,midtermLabel,finalLabel);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Pie Chart");
        primaryStage.show();


    }
}
