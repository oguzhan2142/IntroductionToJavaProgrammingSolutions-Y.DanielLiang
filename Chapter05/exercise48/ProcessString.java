package Chapter05.exercise48;

import java.util.Scanner;

public class ProcessString {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scan.nextLine();
		scan.close();
		String oddPositionStr = "";
		
		
		for (int i = 0; i < str.length() ; i++) {
			
			
			if (i % 2 == 0 ) {
				
				oddPositionStr += str.charAt(i);
				
			}
			
			
		}
		
		System.out.println(oddPositionStr);
		
	}

}
