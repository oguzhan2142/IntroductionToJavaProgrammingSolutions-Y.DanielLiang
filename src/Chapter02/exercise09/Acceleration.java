package Chapter02.exercise09;

import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int v1 = scan.nextInt();
		int v2 = scan.nextInt();
		int time = scan.nextInt();

		double acceleration = (v2 - v1) / time;

		System.out.println(acceleration);
		
		scan.close();
	}

}
