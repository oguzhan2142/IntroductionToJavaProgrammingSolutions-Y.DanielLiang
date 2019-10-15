package Chapter04.exercise14;

import java.util.Scanner;

public class ConvertLetterGradeToNumber {

	public static void main(String[] args) {

		System.out.println("Enter a letter grade: ");
		
		Scanner scan = new Scanner(System.in);
		
		char character = scan.next().charAt(0);
		scan.close();
		
		
		if (character == 'A' || character == 'B' || character == 'C' || character == 'D' || character == 'F') {
			
			switch (character) {
			case 'A':
				System.out.println("The numeric value for grade A is 4");
				break;
			case 'B':
				System.out.println("The numeric value for grade B is 3");
				break;
			case 'C':
				System.out.println("The numeric value for grade C is 2");
				break;
			case 'D':
				System.out.println("The numeric value for grade D is 1");
				break;
			case 'F':
				System.out.println("The numeric value for grade F is 0");
				break;
			default:
				break;
			}
			
		}
		else {
			System.out.println(character +  " is invalid grade");
		}

	}

}
