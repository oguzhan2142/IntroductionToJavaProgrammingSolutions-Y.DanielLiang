package Chapter08.exercise34;

import java.util.Scanner;

public class RightmostLowestPoint {

	public static void main(String[] args) {

		double[][] point = new double[6][2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 6 points:");

		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				point[i][j] = scan.nextDouble();
			}
		}
		scan.close();

		double[] rightmostLowestPoint = getRightmostLowestPoint(point);
		System.out.print("The rightmost lowest point is ");
		System.out.println(rightmostLowestPoint[0] + " " + rightmostLowestPoint[1]);

	}

	public static int findLargestDistanceIndex(double[][] array) {

		double[] distances = new double[array.length];

		for (int i = 0; i < array.length; i++) {

			distances[i] = Math.sqrt(Math.pow(array[i][0], 2) + Math.pow(array[i][1], 2));

		}

		int largestDistanceIndex = 0;
		for (int i = 0; i < distances.length; i++) {

			for (int j = i + 1; j < distances.length; j++) {

				if (distances[i] > distances[j]) {

					largestDistanceIndex = i;
					continue;
				}

			}
		}

		return largestDistanceIndex;

	}

	public static boolean isArrayEmpty(double[][] array) {

		for (int i = 0; i < array.length; i++) {
			if (array[i][0] != 0 || array[i][1] != 0) {
				return false;
			}
		}
		return true;

	}

	public static double[] getRightmostLowestPoint(double[][] points) {

		double[] rightmostLowestPoint = new double[2];
		double[][] firstSecOnCorSys = new double[points.length][2];
		double[][] secondSecOnCorSys = new double[points.length][2];
		double[][] thirdSecOnCorSys = new double[points.length][2];
		double[][] fourthSecnOnCorSys = new double[points.length][2];

		for (int i = 0; i < points.length; i++) {

			if (points[i][0] > 0 && points[i][1] > 0) {

				firstSecOnCorSys[i][0] = points[i][0];
				firstSecOnCorSys[i][0] = points[i][0];

			} else if (points[i][0] < 0 && points[i][1] > 0) {

				secondSecOnCorSys[i][0] = points[i][0];
				secondSecOnCorSys[i][0] = points[i][0];

			} else if (points[i][0] < 0 && points[i][1] < 0) {

				thirdSecOnCorSys[i][0] = points[i][0];
				thirdSecOnCorSys[i][0] = points[i][0];

			} else if (points[i][0] > 0 && points[i][1] < 0) {

				fourthSecnOnCorSys[i][0] = points[i][0];
				fourthSecnOnCorSys[i][0] = points[i][0];

			}

		}

		int rightmostLowestPointIndex;
		if (!isArrayEmpty(fourthSecnOnCorSys)) {
			rightmostLowestPointIndex = findLargestDistanceIndex(fourthSecnOnCorSys);
		} else if (!isArrayEmpty(firstSecOnCorSys)) {
			rightmostLowestPointIndex = findLargestDistanceIndex(firstSecOnCorSys);
		} else if (!isArrayEmpty(thirdSecOnCorSys)) {
			rightmostLowestPointIndex = findLargestDistanceIndex(thirdSecOnCorSys);
		} else {
			rightmostLowestPointIndex = findLargestDistanceIndex(secondSecOnCorSys);
		}

		rightmostLowestPoint[0] = points[rightmostLowestPointIndex][0];
		rightmostLowestPoint[1] = points[rightmostLowestPointIndex][1];

		return rightmostLowestPoint;

	}
}
