package Chapter06.exercise14;

public class EstimatePI {

	public static void main(String[] args) {

		System.out.println("i m(i)");
		System.out.println("___________");
		for (int i = 1; i < 902; i += 100) {

			System.out.println(i + " " + estimatePI(i));

		}

	}

	public static double estimatePI(int i) {

		double PI = 0;

		for (double j = 1; j <= i; j++) {

			PI += Math.pow(-1, j + 1) / (2 * j - 1);

		}
		PI *= 4;

		return PI;

	}

}
