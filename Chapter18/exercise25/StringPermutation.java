package exercise25;

public class StringPermutation {
    public static void main(String[] args) {

        String x = "abc";
        displayPermutation(x);

    }


    public static void displayPermutation(String s) {


        /*
                0 1 2
                0 2 1

                1 0 2
                1 2 0

                2 0 1
                2 1 0
          */


        displayPermutation("", s);
    }

    public static void displayPermutation(String s1, String s2) {

        if (s2.equals("")) {
            System.out.println(s1);
            return;
        }

        for (int i = 0; i < s2.length(); i++) {
            displayPermutation(s1 + s2.charAt(i), s2.substring(0, i) + s2.substring(i + 1));
        }

    }


}
