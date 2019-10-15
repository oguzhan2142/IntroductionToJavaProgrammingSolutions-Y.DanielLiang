package Chapter08.exercise15;

import java.util.Scanner;

public class SameLine {

	public static void main(String[] args) {

		double point[][] = new double[5][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter five points:");

		for (int i = 0; i < point.length; i++) {

			for (int j = 0; j < point[i].length; j++) {
				point[i][j] = scan.nextDouble();
			}
		}

		scan.close();

		boolean isSameLine = true;

		for (int j = 0; j < point.length - 2; j++) {
			if (!onTheSameLine(point[j][0], point[j][1], point[j + 1][0], point[j + 1][1], point[j + 2][0],
					point[j + 2][1])) {
				isSameLine = false;
			}
		}
		if (isSameLine) {
			System.out.println("The five points are on the same line");
		} else {
			System.out.println("The five points are not on the same line");
		}

	}

	public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2) {
		double result = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);
		if (result == 0) {
			return true;
		}
		return false;

	}

}
