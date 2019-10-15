package Chapter06.exercise09;

public class ConversionsBetweenFeetAndMeters {

	public static void main(String[] args) {

		System.out.println("Feet\tMeters\t|\tMeters\tFeet");
		System.out.println("_________________________________________________________");
		for (double feet = 1, meters = 20; feet < 11; feet++, meters += 5) {

			System.out.print(feet + "\t" + footToMeter(feet) + " \t|\t");
			System.out.println(meters + "\t" + meterToFoot(meters));

		}

	}

	public static double footToMeter(double foot) {

		return 0.305 * foot;

	}

	public static double meterToFoot(double meter) {

		return 3.279 * meter;
	}

}
