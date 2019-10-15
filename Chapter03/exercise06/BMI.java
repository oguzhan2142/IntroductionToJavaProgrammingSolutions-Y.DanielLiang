package Chapter03.exercise06;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {

		final double METERS_PER_INCH = 0.0254;
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double FEET_PER_INCH = 0.0833333;	
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight = scan.nextDouble();
		System.out.print("Enter feets: ");
		double feet = scan.nextDouble();
		System.out.print("Enter inches: ");
		double inches = scan.nextDouble();

		// Compute BMI
		double heightInMeters = (inches += feet / FEET_PER_INCH) * METERS_PER_INCH;
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is " + bmi);
		if (bmi < 18.5)
			System.out.println("Underweight");
		else if (bmi < 25)
			System.out.println("Normal");
		else if (bmi < 30)
			System.out.println("Overweight");
		else
			System.out.println("Obese");
		
		
		scan.close();
	}

}
