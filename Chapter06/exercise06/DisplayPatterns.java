package Chapter06.exercise06;

import java.util.Scanner;

public class DisplayPatterns {

	public static void main(String[] args) {

		System.out.println("Enter an integer for pattern:");
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		scan.close();
		
		
		displayPattern(num);

	}

	public static void displayPattern(int n) {

		for (int i = 0; i < n; i++) {

			
			for (int j2 = 0 ; j2 < n - (i + 1); j2++) {
				
				System.out.print("   ");
			}

			for (int j = i + 1; j >= 1; j--) {

				System.out.printf("%3d",j);
			}

			System.out.println();

		}

	}
}
