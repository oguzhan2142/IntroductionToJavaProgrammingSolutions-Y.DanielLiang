package Chapter05.exercise37;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a decimal integer:");
		int decimal = scan.nextInt();
		String binary = "";
		
		scan.close();
		
		
		
		
		
		while ((decimal  + 1) / 2 != 0) {
			
			
			binary += (decimal % 2);
			decimal = decimal / 2;
			
			
		}
		
		StringBuilder sb = new StringBuilder(binary);
		
		sb = sb.reverse();
				
				
		System.out.println("Binary value is " + sb);
		
		
	}

}
