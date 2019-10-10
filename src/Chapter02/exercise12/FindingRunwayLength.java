package Chapter02.exercise12;

import java.util.Scanner;

public class FindingRunwayLength {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double speed = scan.nextDouble();
		double acceleration = scan.nextDouble();

		double length = (speed * speed) / (2 * acceleration);

		System.out.println(length);

	}

}
