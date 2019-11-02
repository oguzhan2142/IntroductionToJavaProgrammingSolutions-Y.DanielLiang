package exercise23;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Scanner;

public class TowRectangles extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first rectqngle`s x,y ,width,heigth:");
        double rectangle1X = scanner.nextDouble();
        double rectangle1Y = scanner.nextDouble();
        double rectangle1Width = scanner.nextDouble();
        double rectangle1Height = scanner.nextDouble();
        System.out.println("Enter second rectqngle`s x,y ,width,heigth:");
        double rectangle2X = scanner.nextDouble();
        double rectangle2Y = scanner.nextDouble();
        double rectangle2Width = scanner.nextDouble();
        double rectangle2Height = scanner.nextDouble();


        Pane pane = new Pane();

        Rectangle rectangle1 = new Rectangle(rectangle1X - rectangle1Width / 2, rectangle1Y - rectangle1Height / 2, rectangle1Width, rectangle1Height);
        Rectangle rectangle2 = new Rectangle(rectangle2X - rectangle2Width / 2, rectangle2Y - rectangle2Height / 2, rectangle2Width, rectangle2Height);

        rectangle1.setStroke(Color.BLACK);
        rectangle2.setStroke(Color.BLACK);
        rectangle1.setOpacity(0.4);
        rectangle2.setOpacity(0.4);
        rectangle1.setFill(Color.WHITE);
        rectangle2.setFill(Color.WHITE);

        if (isOverlap(rectangle1, rectangle2)) {
            pane.getChildren().add(new Text(200 , 500,"The Rectangles Overlaps" ));
        }else if (isContain(rectangle1,rectangle2) || isContain(rectangle2,rectangle1)){
            pane.getChildren().add(new Text(200 , 500,"One Rectangle is contained in another" ));
        }else{
            pane.getChildren().add(new Text(200 , 500,"The Rectangles do not overlap" ));
        }


        pane.getChildren().addAll(rectangle1, rectangle2);

        primaryStage.setScene(new Scene(pane, 600, 600));
        primaryStage.setTitle("Display Two Rectangle");
        primaryStage.show();

    }


    private boolean isOverlap(Rectangle r1, Rectangle r2) {

        return (r1.intersects(r2.getX(), r2.getY(), r2.getWidth() / 2, r2.getHeight() / 2)) && !isContain(r1,r2) ;

    }

    private boolean isContain(Rectangle r1, Rectangle r2) {


        for (double i = r1.getY(); i < r1.getHeight() + r1.getY(); i++) {
            for (double j = r1.getX(); j < r1.getWidth() + r1.getX(); j++) {
                if (!r2.contains(i, j)) {
                    return false;
                }
            }

        }
        return true;

    }
}
