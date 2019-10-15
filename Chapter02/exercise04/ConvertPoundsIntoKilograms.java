package Chapter02.exercise04;

import java.util.Scanner;

public class ConvertPoundsIntoKilograms {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double pounds = scan.nextDouble();
		
		System.out.println(pounds * 0.454);
		scan.close();
		
	}

}
