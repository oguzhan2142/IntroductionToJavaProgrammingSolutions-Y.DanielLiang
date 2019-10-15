package Chapter05.exercise47;

import java.util.Scanner;

public class CheckISBN13 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int checkSum = 0;
		
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
		String ISBN = scan.next() ;
		scan.close();
		
		if (ISBN.length() != 12) {
			System.err.println(ISBN + " is an invalid input");
		}
		
		for (int i = 0; i < 12; i++) {
			
			
			if (i % 2 == 0) {
				
				checkSum += Integer.parseInt(ISBN.charAt(i) + "");
				
			} else {

				checkSum += 3 * (Integer.parseInt(ISBN.charAt(i) + ""));
			}
			
			
			
					
			
		}
		
		
		checkSum = 10 - (checkSum % 10);
		
		
		if (checkSum == 10) {
			checkSum = 0;
		}
			
		ISBN = ISBN + checkSum;
		
		
		System.out.println(ISBN);
		
		
		
		
		
		
		
	}

}
