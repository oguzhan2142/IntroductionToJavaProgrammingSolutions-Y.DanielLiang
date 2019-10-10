package Chapter03.exercise20;

import java.util.Scanner;

public class WindChillTemperature {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		double temperature = scan.nextDouble();
		double windSpeed = scan.nextDouble();
		double result;
		scan.close();

		if ((temperature > -58 && temperature < 41) && windSpeed >= 2) {

			result = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16)
					+ 0.4275 * temperature * Math.pow(windSpeed, 0.16);
			System.out.println(result);

		} else {
			
			if ((temperature > -58 && temperature < 41) && !(windSpeed >= 2)) {
				System.out.println("wind speed invalid");
			}
			else if (!(temperature > -58 && temperature < 41) && windSpeed >= 2) {
				System.out.println("temperature invalid");
			}
			else {
				System.out.println("wind speed and temperature invalid");
			}
			
		}

	}

}
