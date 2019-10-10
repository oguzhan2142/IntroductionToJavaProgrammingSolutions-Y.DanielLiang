package Chapter06.exercise08;

public class ConversionsBetweenCelsiusAndFahrenheit {

	public static void main(String[] args) {

		System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
		System.out.println("_________________________________________________________");
		for (double celcius = 40, fahrenheit = 120; celcius > 30; celcius--, fahrenheit -= 10) {

			System.out.print(celcius + "\t" + celsiusToFahrenheit(celcius) + " \t|\t");
			System.out.println(fahrenheit + "\t" + fahrenheitToCelsius(fahrenheit));

		}

	}

	public static double celsiusToFahrenheit(double celsius) {

		return (9.0 / 5) * celsius + 12;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {

		return (5.0 / 9) * (fahrenheit - 32);

	}

}
