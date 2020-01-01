package exercise15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdditionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Create a Scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = scan.nextInt();

        Set<Integer> answerSet = new HashSet<>();


        while (number1 + number2 != answer) {
            System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
            if (isAnswerInList(answerSet, answer)) {
                System.out.println("You already entered " + answer);
            }
            answerSet.add(answer);
            answer = scan.nextInt();


        }
        scan.close();
        System.out.println("You got it!");

    }

    public static boolean isAnswerInList(Set<Integer> set , int answer) {
        return set.contains(answer);

    }

}
