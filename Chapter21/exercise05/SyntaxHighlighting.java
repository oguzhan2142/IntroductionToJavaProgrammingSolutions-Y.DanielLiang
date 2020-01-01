package exercise05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class SyntaxHighlighting {
    public static void main(String[] args) throws IOException {


        if (args.length != 2)
            System.out.println("usage: java SyntaxHighlighting.java  Welcome.java Welcome.html");

        File source = new File(args[0]);
        File destination = new File(args[1]);


        Scanner scanner = new Scanner(source);
        PrintWriter writer = new PrintWriter(destination);

        ArrayList<String> list = new ArrayList<>();

        while (scanner.hasNext()) {


            String next = scanner.next();


            if (isKeyword(next)) {
                next = turnKeyword(next);
            } else if (isLineComment(next)) {

                next = scanner.nextLine();

                next = turnComment(next);

            } else if (isBlockComment(next)) {

                next = scanner.next();

                while (!next.equals("*/")) {

                    next += scanner.next();

                }

                next = turnComment(next);

            } else {
                next = turnLiteral(next);
            }

            list.add(next);

        }
        scanner.close();

        String result = "";

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            result += iterator.next();
        }

        result = addTags(result);

        writer.write(result);


        writer.close();

    }


    private static boolean isBlockComment(String s) {
        return s.equals("/*");
    }

    private static boolean isLineComment(String s) {
        return s.equals("//");
    }

    private static String addTags(String body) {

        String s = "<html><div>";

        s += body;
        s += "</div></html>";


        return s;
    }

    private static String turnKeyword(String keyword) {


        String s = "<span><b><p style=\"color:navy;\">";

        s += keyword;
        s += "</p></b></span>";


        return s;
    }


    private static String turnComment(String comment) {
        String s = "<span><b><p style=\"color:green;\">";

        s += comment;
        s += "</p></b></span>";


        return s;
    }


    private static String turnLiteral(String literal) {

        String s = "<span><b><p style=\"color:blue;\">";

        s += literal;
        s += "</p></b></span>";


        return s;
    }

    private static boolean isKeyword(String word) {
        Set<String> keywords = new HashSet<>(Arrays.asList("abstract", "assert", "boolean",
                "break", "byte", "case", "catch", "char", "class", "const",
                "continue", "default", "do", "double", "else", "enum",
                "extends", "for", "final", "finally", "float", "goto",
                "if", "implements", "import", "instanceof", "int",
                "interface", "long", "native", "new", "package", "private",
                "protected", "public", "return", "short", "static",
                "strictfp", "super", "switch", "synchronized", "this",
                "throw", "throws", "transient", "try", "void", "volatile",
                "while", "true", "false", "null"));

        return keywords.contains(word);
    }


}
