package Chapter02.exercise06;

import java.util.Scanner;

public class SumTheDigitsInAnInteger {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int integer = scan.nextInt();
		
		if (!(integer >= 0 && integer < 1000)) {
			System.err.println("enter integer between 0-999");
		} else {

			int sum = (integer % 10) + (integer /10) % 10 +(integer / 100);
			System.out.println(sum);
		}
		
		scan.close();
	}

}
