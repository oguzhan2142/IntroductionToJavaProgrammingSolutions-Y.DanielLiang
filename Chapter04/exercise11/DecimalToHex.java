package Chapter04.exercise11;

import java.util.Scanner;

public class DecimalToHex {

	public static void main(String[] args) {
		
		System.out.println("Enter a decimal value (0 to 15): ");
		
		Scanner scan = new Scanner(System.in);
		
		int decimalNum = scan.nextInt();
		
		scan.close();


		if (decimalNum >= 0 && decimalNum <= 15) {
			if (decimalNum < 10 ) {
				System.out.println("The hex value is " + decimalNum);
			}
			else {
				
				char hex = (char) (decimalNum - 10 + 'A') ;
				
				System.out.println("The hex value is " + hex);
			}
			
		}
		else {
			System.err.println( decimalNum + " is an invalid input");
		}
		
	}

}
