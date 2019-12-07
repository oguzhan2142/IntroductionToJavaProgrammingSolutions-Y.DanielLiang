package exercise09;

public class PrintTheCharactersInAStringReversely {
    public static void main(String[] args) {

        reverseDisplay("abcd");
    }

    public static void reverseDisplay(String value) {


        if (value.length() == 0)
            return;
        else {
            System.out.print(value.charAt(value.length() - 1));
            reverseDisplay(value.substring(0, value.length() - 1));
        }
    }
}
