package Chapter02.exercise14;

import java.util.Scanner;

public class ComputingBMI {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double weight = scan.nextDouble() * 0.45359237;
		double height = scan.nextDouble() * 0.0254;

		
		double BMI = weight / (height * height);
		System.out.println(BMI);
		scan.close();
		
	}

}
