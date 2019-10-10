package Chapter02.exercise10;

import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		double amountOfWater = scan.nextDouble();
		
		double initialTemperature = scan.nextDouble();
		double finalTemperature = scan.nextDouble();
		
		double energy;
		
		energy = amountOfWater * (finalTemperature - initialTemperature) * 4184;
		
		System.out.println(energy);
		scan.close();
		
		
	}

}
