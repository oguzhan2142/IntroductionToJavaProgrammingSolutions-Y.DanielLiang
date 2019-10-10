package Chapter11.exercise01;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter three side of triangle:");

		double[] side = new double[3];

		for (int i = 0; i < side.length; i++) {
			side[i] = scan.nextDouble();
		}

		System.out.println("Enter color of triangle:");

		String color = scan.next();

		System.out.println("Is triangled filled or not (y/n):");

		char fiiled = scan.next().charAt(0);
		boolean isFilled;
		scan.close();

		if (fiiled == 'y' || fiiled == 'Y') {
			isFilled = true;
		} else {
			isFilled = false;
		}

		Triangle triangle = new Triangle(side[0], side[1], side[2]);
		triangle.setColor(color);
		triangle.setFilled(isFilled);

		System.out.println("area: " + triangle.getArea() + " perimeter: " + triangle.getPerimeter() + " color:"
				+ triangle.getColor() + " isFilled:" + triangle.isFilled());

	}

}
