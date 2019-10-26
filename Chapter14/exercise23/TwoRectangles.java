package exercise23;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class TwoRectangles extends Application {

    double width = 500;
    double height = 500;


    private static boolean isInside(Rectangle r1, Rectangle r2) {

        double r1BeginX = r1.getX();
        double r1EndX = r1.getX() + r1.getWidth();
        double r1BeginY = r1.getY();
        double r1EndY = r1.getY() + r1.getHeight();

        double r2BeginX = r2.getX();
        double r2EndX = r2.getX() + r2.getWidth();
        double r2BeginY = r2.getY();
        double r2EndY = r2.getY() + r2.getHeight();


        if (r2BeginX > r1BeginX && r2EndX < r1EndX && r2BeginY > r1BeginY && r1EndY > r2EndY)
            return true;
        else
            return false;


    }

    private static boolean isOverlaps(Rectangle r1, Rectangle r2) {

        double r1BeginX = r1.getX();
        double r1EndX = r1.getX() + r1.getWidth();
        double r1BeginY = r1.getY();
        double r1EndY = r1.getY() + r1.getHeight();

        double r2BeginX = r2.getX();
        double r2EndX = r2.getX() + r2.getWidth();
        double r2BeginY = r2.getY();
        double r2EndY = r2.getY() + r2.getHeight();


        Line line = new Line(r2BeginX, r2BeginY, r2BeginX, r2EndY);
        Line line1 = new Line(r2EndX, r2BeginY, r2EndX, r2EndY);


        for (double x = r1BeginX; x < r1EndX; x++) {

            if (line.contains(x, r1BeginY) || line.contains(x, r1EndY) || line1.contains(x, r1BeginY) || line1.contains(x, r1EndY)) {
                return true;
            }

        }


        return false;


    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane pane = new Pane();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first rectangle`s x , y cordinates ,width and height:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double width1 = scanner.nextDouble();
        double height1 = scanner.nextDouble();

        System.out.println("Enter second rectangle`s x , y cordinates ,width and height:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double width2 = scanner.nextDouble();
        double height2 = scanner.nextDouble();


        Rectangle r1 = new Rectangle(x1 - width1 / 2, y1 - height1 / 2, width1, height1);
        r1.setFill(Color.WHITE);
        r1.setStroke(Color.BLACK);
        Rectangle r2 = new Rectangle(x2 - width2 / 2, y2 - height2 / 2, width2, height2);
        r2.setFill(Color.WHITE);
        r2.setStroke(Color.BLACK);

        Text overlaps = new Text(width / 10 * 3, height / 10 * 9, "The Rectangles overlap");
        Text dontOverlaps = new Text(width / 10 * 3, height / 10 * 9, "The Rectangles do not overlap");
        Text contained = new Text(width / 10 * 3, height / 10 * 9, "One Rectangle is contained in another");

        if (isInside(r1, r2) || isInside(r2, r1)) {
            pane.getChildren().add(contained);
        } else if (isOverlaps(r1, r2) || isOverlaps(r2, r1)) {
            pane.getChildren().add(overlaps);
        } else {
            pane.getChildren().add(dontOverlaps);
        }


        pane.getChildren().addAll(r1, r2);
        primaryStage.setScene(new Scene(pane, width, height));
        primaryStage.setTitle("Two Rectangles");
        primaryStage.show();


    }
}
