package Chapter06.exercise23;

import java.util.Scanner;

public class OccurrencesOfASpecifiedCharacter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = scan.nextLine();
		
		System.out.println("Enter a character:");
		char ch = scan.next().charAt(0);
		scan.close();
		
		System.out.println(count(str, ch));
		
		
		
		
		
		
	}
	
	public static int count(String str, char a) {
		int counter = 0 ;
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == a) {
				counter++;
			}
			
			
		}
		
		return counter;
		
		
	}

}
