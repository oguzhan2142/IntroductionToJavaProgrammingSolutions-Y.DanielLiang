package exercise16;

public class FindTheNumberOfUppercaseLettersInArray {
    public static void main(String[] args) {

        char [] chars = {'a' , 'b' , 'c' , 'D' , 'A' , 'C' , 'd'};

        System.out.println(count(chars));

    }


    public static int count(char[] chars) {

        return count(chars, chars.length - 1);

    }


    public static int count(char[] chars, int high) {


        if (high < 0)
            return 0;

        if (Character.isUpperCase(chars[high]))
            return 1 + count(chars, high - 1);
        else
            return count(chars, high - 1);


    }

}
