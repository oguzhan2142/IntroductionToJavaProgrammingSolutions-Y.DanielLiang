package Chapter04.exercise20;

import java.util.Scanner;

public class ProcessAString {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
		String str =  scan.next();
		
		System.out.println("String lengts is " + str.length());
		
		System.out.println("String's first character is : " + str.charAt(0));
		
		scan.close();
		
		
		
	}

}
