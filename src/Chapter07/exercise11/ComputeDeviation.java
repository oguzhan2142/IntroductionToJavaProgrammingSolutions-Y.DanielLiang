package Chapter07.exercise11;

import java.util.Scanner;

public class ComputeDeviation {

	public static void main(String[] args) {

		double[] array = new double[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ten numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = scan.nextDouble();
		}
		scan.close();

		System.out.println("The mean is " + mean(array));
		System.out.println("The standard deviation is " + deviation(array));

	}

	public static double deviation(double[] x) {

		double deviation;
		double mean = mean(x);
		double asd = 0;

		for (int i = 0; i < x.length; i++) {
			asd += Math.pow(x[i] - mean, 2);
		}

		deviation = Math.sqrt(asd / (x.length - 1));

		return deviation;

	}

	public static double mean(double[] x) {

		double sumOfNum = 0;

		for (int i = 0; i < x.length; i++) {
			sumOfNum += x[i];
		}

		return sumOfNum / x.length;

	}

}
