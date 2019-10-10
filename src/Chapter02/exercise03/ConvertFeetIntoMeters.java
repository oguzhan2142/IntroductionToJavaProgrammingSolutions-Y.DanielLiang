package Chapter02.exercise03;

import java.util.Scanner;

public class ConvertFeetIntoMeters {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int numInFeet = scan.nextInt();
		
		double oneFoot = 0.305;
		
		System.out.println(numInFeet * oneFoot);
		scan.close();
		
		
	}

}
