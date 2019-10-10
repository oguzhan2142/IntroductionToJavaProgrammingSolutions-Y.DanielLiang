package Chapter02.exercise11;

import java.util.Scanner;

public class PopulationProjection {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numOfYears = scan.nextInt();
		int secForPerBirth = 7;
		int secForPerDeath = 13;
		int secForPerNewImmigrant = 45;
		int currentPopulation = 312032486;
		int secInYears = 365 * numOfYears * 24 * 60 * 60;
		int totalBirthInAYear = secInYears / secForPerBirth ;
		int totalDeathInAYear = secInYears / secForPerDeath ;
		int totalNewImmigrantInAYear = secInYears / secForPerNewImmigrant ;

		
		int populationAfterAYear = currentPopulation +totalBirthInAYear + totalNewImmigrantInAYear -totalDeathInAYear;
		
		System.out.println(populationAfterAYear);
		scan.close();
		
	}

}
