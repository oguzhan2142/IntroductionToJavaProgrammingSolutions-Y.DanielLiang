package exercise15;

public class OcurrensOfSpecifiedCharacterInString {
    public static void main(String[] args) {

        System.out.println(count("programming is fun" , 'm'));

    }

    public static int count(String str, char a) {

        return count(str, a, str.length() - 1);

    }

    public static int count(String str, char a, int high) {

        if (high < 0)
            return 0;

        if (str.charAt(high) == a)
            return 1 + count(str, a, high - 1);
        else
            return count(str, a, high - 1);


    }
}
