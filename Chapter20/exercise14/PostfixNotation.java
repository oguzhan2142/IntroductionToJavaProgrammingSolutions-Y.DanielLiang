package exercise14;

import java.util.Stack;

public class PostfixNotation {


    public static void main(String[] args) {


        String expression = "1 2 + 3 *";


        Stack<Integer> operands = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                process(operands, expression.charAt(i));
            } else if (expression.charAt(i) >= '0' && expression.charAt(i) <= '9'){
                operands.push(Integer.parseInt(expression.charAt(i) + ""));
            }
        }

        System.out.println(operands.peek());
    }

    private static void process(Stack<Integer> stack, char operator) {
        int operand1 = stack.pop();
        int operand2 = stack.pop();
        switch (operator) {
            case '+':
                stack.push(operand1 + operand2);
                break;
            case '-':
                stack.push(operand1 - operand2);
                break;
            case '*':
                stack.push(operand1 * operand2);
                break;
            case '/':
                stack.push(operand1 / operand2);
                break;

        }
    }


}
