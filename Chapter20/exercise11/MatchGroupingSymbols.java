package exercise11;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MatchGroupingSymbols {
    public static void main(String[] args) {

        File source = new File("/Users/oguzhan/Chapter20/src/exercise11/test.txt");
        String s = "";
        try {
            Scanner scanner = new Scanner(source);
            while (scanner.hasNext()) {
                s += scanner.next();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        char[] array = s.toCharArray();

        ArrayList<Character> symbols = giveSymbols(array);

        ArrayList<Character> part1 = new ArrayList<>();
        ArrayList<Character> part2 = new ArrayList<>();


        for (int i = 0; i < symbols.size(); i++) {

            if (i < symbols.size() / 2) {
                part1.add(symbols.get(i));
            } else {
                part2.add(symbols.get(i));
            }
        }

        for (int i = 0; i < symbols.size(); i += 2) {

            if (!isNoxtValid(symbols.get(i), symbols.get(i + 1))) {
                System.err.println("Syntax Error!");
            }

        }


    }

    private static boolean isNoxtValid(char c, char next) {

        if (c == '(' && next == ')')
            return true;
        else if (c == '{' && next == '}')
            return true;
        else if (c == '[' && next == ']')
            return true;
        else
            return false;

    }

    private static ArrayList<Character> giveSymbols(char[] chars) {
        ArrayList<Character> characters = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')') {
                characters.add(c);
            }

        }

        return characters;
    }

}
