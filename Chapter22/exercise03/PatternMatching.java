package exercise03;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class PatternMatching {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1 = scanner.nextLine();
        System.out.println("Enter second string:");
        String s2 = scanner.nextLine();

        int index = 0;
        boolean isMatch = false;


        for (int i = 0; i < s1.length() - s2.length() ; i++) {



           if (s1.substring(i , i + s2.length()).equals(s2)){
                   isMatch = true;
                   index = i;
                   break;
           }
        }


        if (isMatch){
            System.out.println("Match at index : " + index );
        }else {
            System.out.println("No Match");
        }




    }

}
