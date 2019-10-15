package Chapter08.exercise21;

import java.util.Scanner;

public class CentralCity {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of cities:");
		int numberOfCities = scan.nextInt();
		double[][] distanceBetweenCities = new double[numberOfCities][numberOfCities];

		System.out.println("Enter the coordinates of the cities:");
		double[][] cityCordinates = new double[numberOfCities][2];
		for (int i = 0; i < cityCordinates.length; i++) {
			for (int j = 0; j < cityCordinates[i].length; j++) {
				cityCordinates[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		distanceBetweenCities = calculateDistanceBetweenCities(cityCordinates);
		int centralCityIndex = calculateCentralCity(distanceBetweenCities);

		System.out.print("Central city at :");
		System.out.println(cityCordinates[centralCityIndex][0] + " " + cityCordinates[centralCityIndex][1]);
		System.out.println("The total distance to all other cities is " + calculateTotaldistanceCentralCityToAllOtherCities(centralCityIndex, distanceBetweenCities));

	}

	public static double calculateTotaldistanceCentralCityToAllOtherCities(int centralCityIndex,
			double[][] distanceBetweenCities) {
		double totalDistance = 0;

		for (int i = 0; i < distanceBetweenCities[centralCityIndex].length; i++) {

			totalDistance += distanceBetweenCities[centralCityIndex][i];

		}

		return totalDistance;

	}

	public static int calculateCentralCity(double[][] distanceBetweenCities) {
		int centralCityIndex = 0;

		double totalDistance = 0;
		double shortestTotalDistance = 0;

		for (int i = 0; i < distanceBetweenCities.length; i++) {
			for (int j = 0; j < distanceBetweenCities[i].length; j++) {

				totalDistance += distanceBetweenCities[i][j];

			}
			if (shortestTotalDistance > totalDistance) {
				shortestTotalDistance = totalDistance;
				centralCityIndex = i;
			}
			totalDistance = 0;
		}

		return centralCityIndex;

	}

	public static double[][] calculateDistanceBetweenCities(double[][] cityCordinates) {
		double[][] distanceBetweenCities = new double[cityCordinates.length][cityCordinates.length];

		for (int i = 0; i < cityCordinates.length; i++) {
			for (int j = 0; j < cityCordinates.length; j++) {
				double distance = Math.sqrt(Math.pow((cityCordinates[i][0] - cityCordinates[j][0]), 2)
						+ Math.pow((cityCordinates[i][1] - cityCordinates[j][1]), 2));
				distanceBetweenCities[i][j] = distance;

			}
		}

		return distanceBetweenCities;
	}
}
