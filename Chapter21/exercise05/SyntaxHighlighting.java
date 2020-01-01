package exercise05;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SyntaxHighlighting {
    public static void main(String[] args) throws IOException {


        if (args.length != 2)
            System.out.println("usage: java SyntaxHighlighting.java  Welcome.java Welcome.html");

        File source = new File(args[0]);
        File destination = new File(args[1]);


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


        Scanner scanner = new Scanner(source);
        while (scanner.hasNext()){










        }


    }
}
