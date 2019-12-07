package exercise12;

public class PrintTheCharactersInStringReversely {
    public static void main(String[] args) {


        reverseDisplay("programming is fun");




    }
    public static void reverseDisplay(String value , int high){

        if (high < 0)
            return;
        else {

            System.out.print(value.charAt(high));
            reverseDisplay(value , high - 1);

        }


    }

    public static void reverseDisplay(String value){

        reverseDisplay(value , value.length() - 1);

    }

}


