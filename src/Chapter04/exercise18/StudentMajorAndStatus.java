package Chapter04.exercise18;

import java.util.Scanner;

public class StudentMajorAndStatus {

	public static void main(String[] args) {

		System.out.println("Enter two characters:");

		Scanner scan = new Scanner(System.in);

		String str = scan.next();

		scan.close();

		boolean skip = false;
		
		switch (str.charAt(0)) {
		case 'M':
			System.out.print("Mahematics ");
			break;
		case 'C':
			System.out.print("Computer Science ");
			break;
		case 'I':
			System.out.print("Information Technology ");
			break;
		default:
			System.out.println("invalid input");
			skip = true;
			break;
		}
		
		if (!skip) {
			switch (str.charAt(1)) {
			case '1':
				System.out.print("Freshman ");
				break;
			case '2':
				System.out.print("Sophomore ");
				break;
			case '3':
				System.out.print("Junior ");
				break;
			case '4':
				System.out.print("Senior ");
				break;
			default:
				System.out.println("invalid input");
				break;
			}
			
		}

	}

}
