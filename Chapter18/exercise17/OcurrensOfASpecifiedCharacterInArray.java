package exercise17;

public class OcurrensOfASpecifiedCharacterInArray {
    public static void main(String[] args) {

        char[] chars = new char[20];

        for (int i = 0; i < chars.length; i++) {

            chars[i] = (char) ((int) (Math.random() * ('z' - 'a')) + 'a');

        }

        for (char c : chars){
            System.out.println(c);
        }

        System.out.println("NUMBER OF \'a\' : " + count(chars, 'a'));

    }

    public static int count(char[] chars, char ch) {

        return count(chars, ch, chars.length - 1);

    }

    public static int count(char[] chars, char ch, int high) {
        if (high < 0)
            return 0;

        if (chars[high] == ch)
            return count(chars, ch, high - 1) + 1;
        else
            return count(chars, ch, high - 1);
    }

}
