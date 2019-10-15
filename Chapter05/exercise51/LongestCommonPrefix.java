package Chapter05.exercise51;

import java.util.Scanner;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String str1 = scan.nextLine();
		String str2 = scan.nextLine();
		scan.close();
		String commonPrefix = "";
		boolean areThereCommonPrefix = true;
		int loopConditionNum = str1.length() > str2.length() ? str1.length() : str2.length();

		for (int i = 0; i < loopConditionNum; i++) {
			
			areThereCommonPrefix  = str1.charAt(0) != str2.charAt(0);
			
			if (areThereCommonPrefix) {
				System.out.println(str1 + " and " + str2 + " have no common prefix");
				
			}

			if (str1.charAt(i) == str2.charAt(i)) {

				commonPrefix += str1.charAt(i);

			} else {
				break;
			}

		}

		
		if (!areThereCommonPrefix) {
			System.out.println("The common prefix is " + commonPrefix);
		}
		

	}

}
