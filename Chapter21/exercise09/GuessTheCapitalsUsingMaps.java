package exercise09;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GuessTheCapitalsUsingMaps {
    public static void main(String[] args) {


        String[][] statesAndCapitals = {

                {"Alaska", "Juneau"}, {"Alabama", "Montgomery"}, {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"}, {"California", "Sacramento"}, {"Colorado", "Denver"},
                {"Connecticut", "Hartford"}, {"Delaware", "Dover"}, {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"}, {"Hawaii", "Honolulu"}, {"Idaho", "Boise"}, {"Illinois", "Springfield"},
                {"Indiana", "Indianapolis"}, {"Iowa", "Des Moines"}, {"Kansas", "Topeka"}

        };


        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < statesAndCapitals.length; i++) {
            map.put(statesAndCapitals[i][0].toLowerCase(), statesAndCapitals[i][1].toLowerCase());
        }

        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("enter state:");
            String answer = scanner.next();

            System.out.println(map.get(answer.toLowerCase()));

        }


    }
}
