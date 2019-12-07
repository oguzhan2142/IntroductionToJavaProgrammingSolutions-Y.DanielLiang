package exercise14;

public class FindTheNumberIfUppercaseLettersInString {
    public static void main(String[] args) {

        System.out.println(counterUppercase("Programming Is Fun"));
        System.out.println(counterUppercase("Java is the  best Languages In The WORLD"));
    }

    private static int counterUppercase(String str) {


        return counterUppercase(str, 0);


    }

    private static int counterUppercase(String str, int index) {

        if (index == str.length())
            return 0;

        if (Character.isUpperCase(str.charAt(index)))
            return 1 + counterUppercase(str, index + 1);
        else
            return counterUppercase(str, index + 1);
    }
}
