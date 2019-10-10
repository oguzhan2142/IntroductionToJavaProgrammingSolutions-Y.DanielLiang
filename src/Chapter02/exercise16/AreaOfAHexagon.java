package Chapter02.exercise16;

import java.util.Scanner;

public class AreaOfAHexagon {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double side = scan.nextDouble();

		
		double area = ((3 * Math.pow(3, 0.5)) / 2) * (side * side);
		System.out.println(area);
		scan.close();

	}

}
