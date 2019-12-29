package exercise16;

import java.util.ArrayDeque;
import java.util.Queue;

public class ConvertInfixToPostfix {

    public static void main(String[] args) {
        String e = "(1 + 2) * 3";


        System.out.println(infixToPostfix(e));
    }

    public static String infixToPostfix(String expression) {

        String result = "";

        Queue<Character> operand = new ArrayDeque<>();
        Queue<Character> operator = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);


            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' )
                operator.add(ch);
            else if (ch >= '1' && ch <= '9')
                operand.add(ch);
        }

        System.out.println(operand);
        System.out.println(operator);

        while (!operand.isEmpty() || !operator.isEmpty()) {


            if (!operand.isEmpty()) {
                char ch1 = operand.poll();
                result += ch1 + " ";
            }
            if (!operand.isEmpty()) {
                char ch2 = operand.poll();
                result += ch2 + " ";
            }
            if (!operator.isEmpty()) {
                char ch3 = operator.poll();
                result += ch3 + " ";
            }
        }


        return result;
    }


}
