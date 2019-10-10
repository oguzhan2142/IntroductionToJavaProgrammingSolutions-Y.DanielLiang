package Chapter07.exercise30;

import java.util.Scanner;

public class ConsecutiveFourEqualNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of values:");
		int numberOfValues = scan.nextInt();
		int[] values = new int[numberOfValues];
		
		System.out.println("Enter the values:");
		for (int i = 0; i < values.length; i++) {
			values[i] = scan.nextInt();
		}
		scan.close();
		
		if (isConsecutiveFour(values)) {
			System.out.println("The list has consecutive fours");
		}else {
			System.out.println("The list has no consecutive fours");
		}
		
	}

	public static boolean isConsecutiveFour(int[] values) {

		for (int i = 0; i < values.length -3 ; i++) {
			int checkValue = values[i];
			if (checkValue == values[i] && checkValue == values[i + 1] && checkValue == values[i + 2]
					&& checkValue == values[i + 3]) {
				return true;
			}

		}

		return false;

	}

}
