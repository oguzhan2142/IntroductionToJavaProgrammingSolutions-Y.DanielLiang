package Chapter03.exercise13;

import java.util.Scanner;

public class ComputeTaxes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("0-single filer\n1-married jointly,\n" + "2-married separately\n3-head of household\n"
				+ "Enter the filing status: ");
		int status = input.nextInt();

		System.out.print("Enter the taxable income: ");
		double income = input.nextDouble();

		double tax = 0;
		if (status == 0) {
			if (income <= 8350)
				tax = income * 0.10;

			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;

			else if (income <= 82250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			else if (income <= 171550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;

			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (income - 171550) * 0.35;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28
						+ (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}

		// Compute tax for married filing jointly
		if (status == 1) {
			if (income <= 16700)
				tax = income * 0.10;

			else if (income <= 67900)
				tax = 16700 * 0.10 + (income - 16700) * 0.15;

			else if (income <= 137050)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (income - 137050) * 0.25;

			else if (income <= 208850)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (208850 - 1370501) * 0.25 + (income - 208851) * 0.28;
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (208850 - 1370501) * 0.25 + (372950 - 208851) * 0.28
						+ (income - 208851) * 0.33;
			else
				tax = 16700 * 0.10 + (67900 - 16700) * 0.15 + (208850 - 1370501) * 0.25 + (372950 - 208851) * 0.28
						+ (372950 - 208851) * 0.33 + (income - 372951) * 0.35;
		}

		// Compute tax for Married filing separately
		if (status == 2) {
			if (income <= 8350)
				tax = income * 0.10;

			else if (income <= 33950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;

			else if (income <= 68525)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;

			else if (income <= 104425)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (income - 68525) * 0.28;

			else if (income <= 186475)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (income - 104426) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28
						+ (186475 - 104426) * 0.33 + (income - 186476) * 0.35;
		} 

		// Display the result
		System.out.println("Tax is " + (int) (tax * 100) / 100.0);

	}

}
