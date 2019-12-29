package exercise13;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Stack;

public class The24PointCardGame extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        BorderPane mainPane = new BorderPane();
        HBox cardPane = new HBox(10);
        cardPane.setAlignment(Pos.CENTER);

        Label informationLbl = new Label();
        Button shuffleBtn = new Button("Shuffle");
        HBox topPane = new HBox(10, informationLbl, shuffleBtn);
        topPane.setAlignment(Pos.CENTER_RIGHT);

        Card[] cards = new Card[52];
        initCards(cards);

        shuffleBtn.setOnAction(event -> {

            shuffleCards(cards, cardPane);

        });


        TextField expressionFld = new TextField();
        expressionFld.setPrefColumnCount(30);
        Button verifyBtn = new Button("Verify");
        verifyBtn.setOnAction(event -> {
            if (!isNumbersExist(cardPane,expressionFld)) {

                informationLbl.setText("Numbers not exist");
            }

            if (isEvaluate24(expressionFld)) {
                informationLbl.setText("Correct");
            } else {
                informationLbl.setText("Incorrect Result");
            }

        });
        HBox botPane = new HBox(15, new Label("Enter Expression:"), expressionFld, verifyBtn);
        botPane.setAlignment(Pos.CENTER);


        mainPane.setCenter(cardPane);
        mainPane.setTop(topPane);
        mainPane.setBottom(botPane);
        primaryStage.setScene(new Scene(mainPane, 800, 500));
        primaryStage.setTitle("Card Game");
        primaryStage.show();
    }

    private boolean isEvaluate24(TextField field) {

        String s = field.getText();
        return evalueateExpression(s) == 24;
    }

    private boolean isNumbersExist(HBox pane, TextField expressionField) {


        ArrayList<Integer> enteredNumbers = new ArrayList<>();

        for (int i = 0; i < expressionField.getText().length(); i++) {

            if (expressionField.getText().charAt(i) >= '0' && expressionField.getText().charAt(i) <= '9'){
                enteredNumbers.add(Integer.parseInt(expressionField.getText().charAt(i) + ""));
            }

        }

        for (int i = 0; i < pane.getChildren().size(); i++) {

            Card card =(Card) pane.getChildren().get(i);

            if (!enteredNumbers.contains(card.value))
                return false;

        }
        return true;
    }


    private int evalueateExpression(String expression) {

        Stack<Integer> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();


        expression = insertBlanks(expression);

        String[] tokens = expression.split(" ");

        for (String token : tokens) {

            if (token.length() == 0) {
                continue;

            } else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
                while (!operators.isEmpty() && (operators.peek() == '+' || operators.peek() == '-' ||
                        operators.peek() == '*' || operators.peek() == '/')) {
                    processAnOperator(operands, operators);
                }

                operators.push(token.charAt(0));
            } else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
                while (!operators.isEmpty() && (operators.peek() == '*' || operators.peek() == '/')) {
                    processAnOperator(operands, operators);
                }
                operators.push(token.charAt(0));
            } else if (token.trim().charAt(0) == '(') {
                operators.push('(');
            } else if (token.trim().charAt(0) == ')') {
                while (operands.peek() != '(') {
                    processAnOperator(operands, operators);
                }
                operators.pop();

            } else {
                operands.push(new Integer(token));
            }


        }
        while (!operators.isEmpty()) {
            processAnOperator(operands, operators);
        }
        return operands.pop();

    }

    private void processAnOperator(Stack<Integer> operands, Stack<Character> operators) {

        char op = operators.pop();

        int operand1 = operands.pop();
        int operand2 = operands.pop();


        if (op == '+')
            operands.push(operand1 + operand2);
        else if (op == '-')
            operands.push(operand1 - operand2);
        else if (op == '*')
            operands.push(operand1 * operand2);
        else if (op == '/')
            operands.push(operand1 / operand2);

    }

    private String insertBlanks(String expression) {

        String result = "";

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(0);
            if (ch == '(' || ch == ')' || ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                result += " " + ch + " ";
            } else {
                result += ch;
            }

        }


        return result;
    }

    private void shuffleCards(Card[] cards, HBox pane) {
        pane.getChildren().clear();


        while (pane.getChildren().size() < 4) {
            int index = (int) (Math.random() * 52);

            if (!pane.getChildren().contains(cards[index])) {
                pane.getChildren().add(cards[index]);
            }

        }

    }

    private void initCards(Card[] cards) {

        cards[0] = new Card(1, "file:/Users/oguzhan/Chapter20/src/exercise13/card/1.png");

        for (int i = 1; i <= 9; i++) {
            cards[i] = new Card(i + 1, "file:/Users/oguzhan/Chapter20/src/exercise13/card/" + (i + 1) + ".png");
        }
        cards[10] = new Card(11, "file:/Users/oguzhan/Chapter20/src/exercise13/card/11.png");
        cards[11] = new Card(12, "file:/Users/oguzhan/Chapter20/src/exercise13/card/12.png ");
        cards[12] = new Card(13, "file:/Users/oguzhan/Chapter20/src/exercise13/card/13.png");

        cards[13] = new Card(1, "file:/Users/oguzhan/Chapter20/src/exercise13/card/14.png");

        for (int i = 14; i <= 22; i++) {
            cards[i] = new Card(i - 12, "file:/Users/oguzhan/Chapter20/src/exercise13/card/" + (i + 1) + ".png");
        }
        cards[23] = new Card(11, "file:/Users/oguzhan/Chapter20/src/exercise13/card/24.png");
        cards[24] = new Card(12, "file:/Users/oguzhan/Chapter20/src/exercise13/card/25.png ");
        cards[25] = new Card(13, "file:/Users/oguzhan/Chapter20/src/exercise13/card/26.png");


        cards[26] = new Card(1, "file:/Users/oguzhan/Chapter20/src/exercise13/card/27.png");

        for (int i = 27; i <= 35; i++) {
            cards[i] = new Card(i - 25, "file:/Users/oguzhan/Chapter20/src/exercise13/card/" + (i + 1) + ".png");
        }
        cards[36] = new Card(11, "file:/Users/oguzhan/Chapter20/src/exercise13/card/37.png");
        cards[37] = new Card(12, "file:/Users/oguzhan/Chapter20/src/exercise13/card/38.png ");
        cards[38] = new Card(13, "file:/Users/oguzhan/Chapter20/src/exercise13/card/39.png");


        cards[39] = new Card(1, "file:/Users/oguzhan/Chapter20/src/exercise13/card/40.png");

        for (int i = 40; i <= 48; i++) {
            cards[i] = new Card(i - 38, "file:/Users/oguzhan/Chapter20/src/exercise13/card/" + (i + 1) + ".png");
        }
        cards[49] = new Card(11, "file:/Users/oguzhan/Chapter20/src/exercise13/card/50.png");
        cards[50] = new Card(12, "file:/Users/oguzhan/Chapter20/src/exercise13/card/51.png ");
        cards[51] = new Card(13, "file:/Users/oguzhan/Chapter20/src/exercise13/card/52.png");

    }

}


class Card extends ImageView {

    protected int value;


    public Card(int value, String path) {
        super(new Image(path));
        this.value = value;

    }
}



