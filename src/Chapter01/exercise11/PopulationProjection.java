package Chapter01.exercise11;

public class PopulationProjection {

	public static void main(String[] args) {

		int secForPerBirth = 7;
		int secForPerDeath = 13;
		int secForPerNewImmigrant = 45;
		
		
		int currentPopulation = 312032486;
		
		
		int secInAYer = 365 * 24 * 60 * 60;
		
		
		int totalBirthInAYear = secInAYer / secForPerBirth ;
		int totalDeathInAYear = secInAYer / secForPerDeath ;
		int totalNewImmigrantInAYear = secInAYer / secForPerNewImmigrant ;

		
		int populationAfterAYear = currentPopulation +totalBirthInAYear + totalNewImmigrantInAYear -totalDeathInAYear;
		
		System.out.println(populationAfterAYear);

	}

}
