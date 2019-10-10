package Chapter07.exercise02;

import java.util.Scanner;

public class ReverseTheNumbersEntered {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter ten integer:");
		int[] number = new int[10];
		for (int i = 0; i < 10; i++) {
			
			number[i] = scan.nextInt();
			
			
		}
		scan.close();
		
		
		for (int i = number.length -1; i >= 0 ; i--) {
			System.out.print(number[i] + " ");
		}
		
		
		
		
	}

}
