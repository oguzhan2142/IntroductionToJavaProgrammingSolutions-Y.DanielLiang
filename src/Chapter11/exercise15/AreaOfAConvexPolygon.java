package Chapter11.exercise15;

import java.util.Scanner;

public class AreaOfAConvexPolygon {

	public static void main(String[] args) {

		System.out.println("Enter cordinates of points:");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		double[][] cordinate = new double[n][2];
		System.out.println("Enter points:");
		for (int i = 0; i < cordinate.length; i++) {
			for (int j = 0; j < cordinate[i].length; j++) {
				cordinate[i][j] = scan.nextDouble();
			}
		}
		scan.close();
		
		System.out.println(areaOfPolygon(cordinate));
		

	}
	//		-12 0 -8,5 10 0 11,4 5,5 7,8 6 -5,5 0 -7 -3,5 -3,5
	public static double areaOfPolygon(double[][] cordinates) {

		double sum1[] = new double[cordinates.length ];
		double sum2[] = new double[cordinates.length ];

		for (int i = 0; i < cordinates.length -1; i++) {
			sum1[i] = cordinates[i][0] * cordinates[i + 1][1];

		}
		for (int i = 0; i < cordinates.length -1 ; i++) {
			sum2[i] = cordinates[i][1] * cordinates[i + 1][0];
		}
		sum1[cordinates.length -1] = cordinates[cordinates.length -1][0] * cordinates[0][1];
		sum2[cordinates.length -1] = cordinates[cordinates.length -1][1] * cordinates[0][0];
		double sum = 0;
		for (int i = 0; i < sum2.length; i++) {
			sum += (sum1[i] - sum2[i]);
		}

		return Math.abs(sum) / 2;
	}

}
