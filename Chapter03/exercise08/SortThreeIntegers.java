package Chapter03.exercise08;

import java.util.Scanner;

public class SortThreeIntegers {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int []number = new int[3];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = scan.nextInt();
		}
		
		for (int i = 0; i < 2; i++) {
			
			if (number[i] > number[i + 1]) {
				
				int temp;
				temp = number[i];
				number[i] = number[i + 1];
				number[i+1] = temp;
				
			}
			
			
			
		}
		for (int i = 0; i < number.length; i++) {
			System.out.println(number[i] + "  ");
		}
		
		scan.close();
		
	}

}
