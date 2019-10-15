package Chapter05.exercise38;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {

Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer:");
		int decimal = scan.nextInt();
		String octal = "";
		
		scan.close();
		
		
		
		
		
		while ((decimal  + 1) / 8 != 0) {
			
			
			octal += (decimal % 8);
			decimal = decimal / 8;
			
			
		}
		
		octal += decimal;
		
		StringBuilder sb = new StringBuilder(octal);
		
		sb = sb.reverse();
				
				
		System.out.println("Octal value is " + sb);
		
		
		
	}

}
