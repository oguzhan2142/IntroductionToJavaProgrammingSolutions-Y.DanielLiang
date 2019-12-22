package exercise08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        // Generate a lottery number
        int l = (int) (Math.random() * 899) + 100;
        String lottaryNumber = l + "";


        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick three digits: ");
        String guessNumber = input.next();
        input.close();


        System.out.println("The lottery number is " + lottaryNumber);


        int sameDigitCounter = 0;


        for (int i = 0; i < guessNumber.length(); i++) {
            for (int j = 0; j < guessNumber.length(); j++) {
                if (guessNumber.charAt(i) == lottaryNumber.charAt(j)) {
                    sameDigitCounter++;
                    break;
                }

            }

        }


        if (lottaryNumber.equals(guessNumber))
            System.out.println("Exact match: you win $10,000");
        else if (sameDigitCounter == 3)
            System.out.println("Match all digits: you win $3,000");
        else if (sameDigitCounter == 2)
            System.out.println("Match two  digits: you win $2,000");
        else if (sameDigitCounter == 1)
            System.out.println("Match one digit: you win $1,000");
    }
}
