package Chapter02.exercise17;

import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double temperature = scan.nextDouble();
		double windSpeed = scan.nextDouble();
		double result;

		if ((temperature > -58 && temperature < 41) && windSpeed >= 2) {

			result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
					+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			System.out.println(result);

		} else {
			System.err.println(
					"enter a temperature between - 58 F and 41 F and a wind speed greater than or equal to 2 ");
		}

		scan.close();
	}

}
