package exercise03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GuessingTheCapital {
    public static void main(String[] args) {
        String[][] statesAndCapitals = {

                {"Alaska", "Juneau"}, {"Alabama", "Montgomery"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},
                {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}

        };

        ArrayList<String[]> pairs = new ArrayList<>(Arrays.asList(statesAndCapitals));

        Collections.shuffle(pairs);

        Scanner scan = new Scanner(System.in);

        int correctCount = 0;

        for (int i = 0; i < statesAndCapitals.length; i++) {

            System.out.println("What is the capital of " + pairs.get(i)[0]);
            String answer = scan.next();
            answer = answer.toLowerCase();
            if (answer.equals(pairs.get(i)[1].toLowerCase())) {
                System.out.println("Your answer is correct");
                correctCount++;
            } else {
                System.out.println("The correct answer should be " + statesAndCapitals[i][1]);
            }

        }

        System.out.println("The correct count is " + correctCount);
        scan.close();

    }
}
