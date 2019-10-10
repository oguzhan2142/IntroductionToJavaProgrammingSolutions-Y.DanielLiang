package Chapter04.exercise21;

import java.util.Scanner;

public class CheckSSN {

	public static void main(String[] args) {

		
		System.out.println("Enter a SSN:");
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		scan.close();
		
		
		if (str.charAt(3) == '-' && str.charAt(6) == '-') {
			System.out.println(str + " is a valid social security number");
			
		}
		else {
			System.out.println(str + " is an invalid social security number");
		}
		
		
		
		
	}

}
