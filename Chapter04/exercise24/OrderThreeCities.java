package Chapter04.exercise24;

import java.util.Scanner;

public class OrderThreeCities {

	public static void main(String[] args) {

		String[] city = new String[3];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first city:");
		city[0] = scan.nextLine();
		System.out.println("Enter the second city:");
		city[1] = scan.nextLine();
		System.out.println("Enter the third city:");
		city[2] = scan.nextLine();

		scan.close();
		
		for (int j = 0; j < city.length   ; j++) {
			
			for (int i = 0; i < city.length -1 ; i++) {
				String temp;
				
				if (city[i].charAt(0) > city[i + 1].charAt(0)) {
					temp = city[i];
					city[i] = city[i + 1];
					city[i + 1] = temp;
				}
				
			}
		}
		
		System.out.print("The three cities in alphabetical order are ");
		for (int i = 0; i < city.length; i++) {
			System.out.print(city[i] + " ");
		}
		

	}

}
