package exercise08;

public class PrintTheDigitsInAnIntegerReversely {
    public static void main(String[] args) {

        reverseDisplay(12345);

    }

    public static void reverseDisplay(int value) {
        if (value == 0)
            return;
        else {
            System.out.print(value % 10);
            reverseDisplay(value / 10);
        }
    }
}
