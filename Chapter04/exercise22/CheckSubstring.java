package Chapter04.exercise22;

import java.util.Scanner;

public class CheckSubstring {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter string s1:");
		String str1 = scan.next();
		System.out.println("Enter string s2:");
		String str2 = scan.next();
		
		scan.close();
		boolean[] isSubstring = new boolean[str2.length()];
		boolean result = false;
		
		for (int i = 0; i < isSubstring.length; i++) {
			isSubstring[i] = false;
		}
		
		for (int i = 0; i < str1.length(); i++) {
			
			for (int j = 0; j < str2.length(); j++) {
				
				if (str2.charAt(j) == str1.charAt(i)) {
					isSubstring[j] = true;
				}
				
			}
			
		}
		
		
		for (int i = 0; i < isSubstring.length; i++) {
			
			result = isSubstring[i];
			if (!result) {
				System.out.println(str2 + " is not substring of " + str1);

				break;
			}
			
			
			
		}
		
		if (result) {
			
			System.out.println(str2 + " is substring of " + str1);
		}
		
		
		
	}

}
